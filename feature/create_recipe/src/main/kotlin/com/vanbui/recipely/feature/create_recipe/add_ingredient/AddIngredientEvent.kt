package com.vanbui.recipely.feature.create_recipe.add_ingredient

import com.vanbui.recipely.core.model.Ingredient
import com.vanbui.recipely.core.model.IngredientItem

sealed class AddIngredientEvent {
    data class Init(val ingredientItem: IngredientItem? = null) : AddIngredientEvent()
    data class EnterIngredientName(val value: String) : AddIngredientEvent()
    data class EnterAmount(val value: String) : AddIngredientEvent()
    data class ChooseIngredient(val ingredient: Ingredient) : AddIngredientEvent()
    data object AddIngredient : AddIngredientEvent()
    data object Dispose : AddIngredientEvent()
}
