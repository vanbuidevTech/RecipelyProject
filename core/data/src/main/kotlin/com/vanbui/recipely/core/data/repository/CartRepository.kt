package com.vanbui.recipely.core.data.repository

import com.vanbui.recipely.core.model.IngredientItem
import com.vanbui.recipely.core.model.Order
import kotlinx.coroutines.flow.Flow

interface CartRepository {
    fun getAllInCartOfCurrentAccount(): Flow<List<IngredientItem>>

    fun getAllOrderOfCurrentAccount(): Flow<List<Order>>

    fun getOrderById(orderId: String): Flow<Order>

    fun getDummyOrder(): Order

    suspend fun updateAmountInCartOfCurrentAccount(ingredientId: String, amount: Int)

    suspend fun addIngredientToCart(ingredientId: String, amount: Int)

    suspend fun createOrder()

    suspend fun cancelOrder(id: String)

}