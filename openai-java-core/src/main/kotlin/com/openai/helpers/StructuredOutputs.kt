package com.openai.helpers

import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.ObjectMapper
import com.github.victools.jsonschema.generator.OptionPreset
import com.github.victools.jsonschema.generator.SchemaGenerator
import com.github.victools.jsonschema.generator.SchemaGeneratorConfigBuilder
import com.github.victools.jsonschema.module.jackson.JacksonModule
import com.github.victools.jsonschema.module.jackson.JacksonOption
import com.openai.core.JsonValue
import com.openai.models.ResponseFormatJsonSchema

fun <T> fromClass(type: Class<T>): ResponseFormatJsonSchema {
    val configBuilder =
        SchemaGeneratorConfigBuilder(
            com.github.victools.jsonschema.generator.SchemaVersion.DRAFT_2020_12,
            OptionPreset.PLAIN_JSON
        )
            // TODO: Decide if this module is needed. The `withRequiredCheck()` (below) does more
            //   that was originally required of this line. If no Jackson annotations are needed,
            //   then this module is not needed either.
            .with(JacksonModule(JacksonOption.RESPECT_JSONPROPERTY_REQUIRED))

    // For OpenAI schemas, _all_ properties _must_ be required. Override the interpretation of the
    // Jackson `required` parameter to the `@JsonProperty` annotation: it will always be assumed to
    // be `true` (even if explicitly `false` and even if there is no `@JsonProperty` annotation
    // present).
    configBuilder.forFields().withRequiredCheck { true }

    val jsonSchema: JsonNode = SchemaGenerator(configBuilder.build()).generateSchema(type)

    return ResponseFormatJsonSchema.builder()
        .jsonSchema(ResponseFormatJsonSchema.JsonSchema.builder()
            .name("json-schema-from-${type.simpleName}")
            .schema(JsonValue.from(jsonSchema))
            .build()
        )
        .build()
}

fun <T> fromJson(json: String, type: Class<T>): T {
    try {
        return ObjectMapper().readValue(json, type)
    } catch (e: Exception) {
        throw RuntimeException(e)
    }
}
