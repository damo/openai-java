// File generated from our OpenAPI spec by Stainless.

package com.openai.models.moderations

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.openai.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ModerationTest {

    @Test
    fun create() {
        val moderation =
            Moderation.builder()
                .categories(
                    Moderation.Categories.builder()
                        .harassment(true)
                        .harassmentThreatening(true)
                        .hate(true)
                        .hateThreatening(true)
                        .illicit(true)
                        .illicitViolent(true)
                        .selfHarm(true)
                        .selfHarmInstructions(true)
                        .selfHarmIntent(true)
                        .sexual(true)
                        .sexualMinors(true)
                        .violence(true)
                        .violenceGraphic(true)
                        .build()
                )
                .categoryAppliedInputTypes(
                    Moderation.CategoryAppliedInputTypes.builder()
                        .addHarassment(Moderation.CategoryAppliedInputTypes.Harassment.TEXT)
                        .addHarassmentThreatening(
                            Moderation.CategoryAppliedInputTypes.HarassmentThreatening.TEXT
                        )
                        .addHate(Moderation.CategoryAppliedInputTypes.Hate.TEXT)
                        .addHateThreatening(
                            Moderation.CategoryAppliedInputTypes.HateThreatening.TEXT
                        )
                        .addIllicit(Moderation.CategoryAppliedInputTypes.Illicit.TEXT)
                        .addIllicitViolent(Moderation.CategoryAppliedInputTypes.IllicitViolent.TEXT)
                        .addSelfHarm(Moderation.CategoryAppliedInputTypes.SelfHarm.TEXT)
                        .addSelfHarmInstruction(
                            Moderation.CategoryAppliedInputTypes.SelfHarmInstruction.TEXT
                        )
                        .addSelfHarmIntent(Moderation.CategoryAppliedInputTypes.SelfHarmIntent.TEXT)
                        .addSexual(Moderation.CategoryAppliedInputTypes.Sexual.TEXT)
                        .addSexualMinor(Moderation.CategoryAppliedInputTypes.SexualMinor.TEXT)
                        .addViolence(Moderation.CategoryAppliedInputTypes.Violence.TEXT)
                        .addViolenceGraphic(
                            Moderation.CategoryAppliedInputTypes.ViolenceGraphic.TEXT
                        )
                        .build()
                )
                .categoryScores(
                    Moderation.CategoryScores.builder()
                        .harassment(0.0)
                        .harassmentThreatening(0.0)
                        .hate(0.0)
                        .hateThreatening(0.0)
                        .illicit(0.0)
                        .illicitViolent(0.0)
                        .selfHarm(0.0)
                        .selfHarmInstructions(0.0)
                        .selfHarmIntent(0.0)
                        .sexual(0.0)
                        .sexualMinors(0.0)
                        .violence(0.0)
                        .violenceGraphic(0.0)
                        .build()
                )
                .flagged(true)
                .build()

        assertThat(moderation.categories())
            .isEqualTo(
                Moderation.Categories.builder()
                    .harassment(true)
                    .harassmentThreatening(true)
                    .hate(true)
                    .hateThreatening(true)
                    .illicit(true)
                    .illicitViolent(true)
                    .selfHarm(true)
                    .selfHarmInstructions(true)
                    .selfHarmIntent(true)
                    .sexual(true)
                    .sexualMinors(true)
                    .violence(true)
                    .violenceGraphic(true)
                    .build()
            )
        assertThat(moderation.categoryAppliedInputTypes())
            .isEqualTo(
                Moderation.CategoryAppliedInputTypes.builder()
                    .addHarassment(Moderation.CategoryAppliedInputTypes.Harassment.TEXT)
                    .addHarassmentThreatening(
                        Moderation.CategoryAppliedInputTypes.HarassmentThreatening.TEXT
                    )
                    .addHate(Moderation.CategoryAppliedInputTypes.Hate.TEXT)
                    .addHateThreatening(Moderation.CategoryAppliedInputTypes.HateThreatening.TEXT)
                    .addIllicit(Moderation.CategoryAppliedInputTypes.Illicit.TEXT)
                    .addIllicitViolent(Moderation.CategoryAppliedInputTypes.IllicitViolent.TEXT)
                    .addSelfHarm(Moderation.CategoryAppliedInputTypes.SelfHarm.TEXT)
                    .addSelfHarmInstruction(
                        Moderation.CategoryAppliedInputTypes.SelfHarmInstruction.TEXT
                    )
                    .addSelfHarmIntent(Moderation.CategoryAppliedInputTypes.SelfHarmIntent.TEXT)
                    .addSexual(Moderation.CategoryAppliedInputTypes.Sexual.TEXT)
                    .addSexualMinor(Moderation.CategoryAppliedInputTypes.SexualMinor.TEXT)
                    .addViolence(Moderation.CategoryAppliedInputTypes.Violence.TEXT)
                    .addViolenceGraphic(Moderation.CategoryAppliedInputTypes.ViolenceGraphic.TEXT)
                    .build()
            )
        assertThat(moderation.categoryScores())
            .isEqualTo(
                Moderation.CategoryScores.builder()
                    .harassment(0.0)
                    .harassmentThreatening(0.0)
                    .hate(0.0)
                    .hateThreatening(0.0)
                    .illicit(0.0)
                    .illicitViolent(0.0)
                    .selfHarm(0.0)
                    .selfHarmInstructions(0.0)
                    .selfHarmIntent(0.0)
                    .sexual(0.0)
                    .sexualMinors(0.0)
                    .violence(0.0)
                    .violenceGraphic(0.0)
                    .build()
            )
        assertThat(moderation.flagged()).isEqualTo(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val moderation =
            Moderation.builder()
                .categories(
                    Moderation.Categories.builder()
                        .harassment(true)
                        .harassmentThreatening(true)
                        .hate(true)
                        .hateThreatening(true)
                        .illicit(true)
                        .illicitViolent(true)
                        .selfHarm(true)
                        .selfHarmInstructions(true)
                        .selfHarmIntent(true)
                        .sexual(true)
                        .sexualMinors(true)
                        .violence(true)
                        .violenceGraphic(true)
                        .build()
                )
                .categoryAppliedInputTypes(
                    Moderation.CategoryAppliedInputTypes.builder()
                        .addHarassment(Moderation.CategoryAppliedInputTypes.Harassment.TEXT)
                        .addHarassmentThreatening(
                            Moderation.CategoryAppliedInputTypes.HarassmentThreatening.TEXT
                        )
                        .addHate(Moderation.CategoryAppliedInputTypes.Hate.TEXT)
                        .addHateThreatening(
                            Moderation.CategoryAppliedInputTypes.HateThreatening.TEXT
                        )
                        .addIllicit(Moderation.CategoryAppliedInputTypes.Illicit.TEXT)
                        .addIllicitViolent(Moderation.CategoryAppliedInputTypes.IllicitViolent.TEXT)
                        .addSelfHarm(Moderation.CategoryAppliedInputTypes.SelfHarm.TEXT)
                        .addSelfHarmInstruction(
                            Moderation.CategoryAppliedInputTypes.SelfHarmInstruction.TEXT
                        )
                        .addSelfHarmIntent(Moderation.CategoryAppliedInputTypes.SelfHarmIntent.TEXT)
                        .addSexual(Moderation.CategoryAppliedInputTypes.Sexual.TEXT)
                        .addSexualMinor(Moderation.CategoryAppliedInputTypes.SexualMinor.TEXT)
                        .addViolence(Moderation.CategoryAppliedInputTypes.Violence.TEXT)
                        .addViolenceGraphic(
                            Moderation.CategoryAppliedInputTypes.ViolenceGraphic.TEXT
                        )
                        .build()
                )
                .categoryScores(
                    Moderation.CategoryScores.builder()
                        .harassment(0.0)
                        .harassmentThreatening(0.0)
                        .hate(0.0)
                        .hateThreatening(0.0)
                        .illicit(0.0)
                        .illicitViolent(0.0)
                        .selfHarm(0.0)
                        .selfHarmInstructions(0.0)
                        .selfHarmIntent(0.0)
                        .sexual(0.0)
                        .sexualMinors(0.0)
                        .violence(0.0)
                        .violenceGraphic(0.0)
                        .build()
                )
                .flagged(true)
                .build()

        val roundtrippedModeration =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(moderation),
                jacksonTypeRef<Moderation>(),
            )

        assertThat(roundtrippedModeration).isEqualTo(moderation)
    }
}
