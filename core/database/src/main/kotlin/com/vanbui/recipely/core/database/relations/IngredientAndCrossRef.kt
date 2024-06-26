package com.vanbui.recipely.core.database.relations

import androidx.room.Embedded
import androidx.room.Relation
import com.vanbui.recipely.core.database.entities.IngredientEntity
import com.vanbui.recipely.core.database.entities.RecipeIngredientCrossRef

data class IngredientAndCrossRef(
    @Embedded
    val crossRef: RecipeIngredientCrossRef,
    @Relation(
        parentColumn = "ingredient_id",
        entityColumn = "_id"
    )
    val ingredient: IngredientEntity
)
