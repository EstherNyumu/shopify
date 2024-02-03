package com.example.shopify.ui.theme.pages.register

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.shopify.ui.theme.ShopifyTheme

@Composable
fun RegisterScreen(navHostController: NavHostController) {

}


@Preview
@Composable
fun RegisterScreenPreview() {
    ShopifyTheme {
        RegisterScreen(rememberNavController())
    }
}