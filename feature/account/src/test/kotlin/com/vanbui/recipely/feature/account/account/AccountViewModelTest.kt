package com.vanbui.recipely.feature.account.account

import com.vanbui.recipely.core.model.exampleAccounts
import com.vanbui.recipely.core.testing.TestAccountRepository
import com.vanbui.recipely.core.testing.TestCartRepository
import com.vanbui.recipely.core.testing.TestRecipeRepository
import org.junit.Before
import org.junit.Test
import kotlin.test.assertEquals

class AccountViewModelTest {

    lateinit var accountViewModel: AccountViewModel

    @Before
    fun setUp() {
        accountViewModel = AccountViewModel(
            accountRepository = TestAccountRepository(),
            recipeRepository = TestRecipeRepository(),
            cartRepository = TestCartRepository()
        )
    }

    @Test
    fun getCurrentAccount() {
        val currentAccount = accountViewModel.currentAccount.value
        assertEquals(exampleAccounts[0], currentAccount)
    }

    @Test
    fun getFavouriteRecipes() {
        val currentFavouriteRecipe = accountViewModel.favouriteRecipes.value
        assertEquals(emptyList(), currentFavouriteRecipe)
    }

    @Test

    fun getComingOrder() {
    }
}