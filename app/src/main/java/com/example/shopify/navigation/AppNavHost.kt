package com.example.shopify.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.shopify.ui.theme.pages.home.HomeScreen
import com.example.shopify.ui.theme.pages.login.LoginScreen
import com.example.shopify.ui.theme.pages.profile.ProfileScreen
import com.example.shopify.ui.theme.pages.register.RegisterScreen
import com.example.shopify.ui.theme.pages.shoppingcart.ShoppingCartScreen

@Composable
fun AppNavHost(navController: NavHostController) {
    NavHost(navController = navController,
        startDestination = ROUTE_HOME ){
        composable(route = ROUTE_HOME){
            HomeScreen(navController)
        }
        composable(route = ROUTE_LOGIN){
            LoginScreen(navController)
        }
        composable(route = ROUTE_REGISTER){
            RegisterScreen(navController)
        }
        composable(route = ROUTE_PROFILE){
            ProfileScreen(navController)
        }
        composable(route = ROUTE_SHOPPING_CART){
            ShoppingCartScreen(navController)
        }

    }

}