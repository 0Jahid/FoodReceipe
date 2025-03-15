package com.jahid.foodreceipe.data

import com.jahid.foodreceipe.data.network.FoodRecipeAPI
import com.jahid.foodreceipe.models.FoodRecipe
import retrofit2.Response
import javax.inject.Inject

class RemoteDataSource @Inject constructor(
    private val foodRecipeApi: FoodRecipeAPI
) {

    suspend fun getRecipes(queries: Map<String, String>): Response<FoodRecipe> {
        return foodRecipeApi.getRecipes(queries)
    }
}