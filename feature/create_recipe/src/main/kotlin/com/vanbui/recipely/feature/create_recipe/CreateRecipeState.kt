package com.vanbui.recipely.feature.create_recipe

import android.net.Uri
import com.vanbui.recipely.core.model.IngredientItem
import com.vanbui.recipely.core.model.Step

data class CreateRecipeState(
    val coverImages: List<Uri> = emptyList(),
    val title: String = "",
    val description: String = "",
    val serving: String = "",
    val ingredientItems: List<IngredientItem> = emptyList(),
    val steps: List<Step> = emptyList(),
    val success: Boolean = false,
    val error: String = ""
)