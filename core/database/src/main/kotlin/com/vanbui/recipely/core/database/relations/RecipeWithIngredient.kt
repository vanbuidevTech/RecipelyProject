package com.vanbui.recipely.core.database.relations

import androidx.room.Embedded
import androidx.room.Junction
import androidx.room.Relation
import com.vanbui.recipely.core.database.entities.IngredientEntity
import com.vanbui.recipely.core.database.entities.RecipeEntity
import com.vanbui.recipely.core.database.entities.RecipeIngredientCrossRef

data class RecipeWithIngredient(
    @Embedded val recipeEntity: RecipeEntity,
    @Relation(
        parentColumn = "_id",
        entityColumn = "_id",
        associateBy = Junction(RecipeIngredientCrossRef::class)
    )
    val ingredient: List<IngredientEntity>
)
