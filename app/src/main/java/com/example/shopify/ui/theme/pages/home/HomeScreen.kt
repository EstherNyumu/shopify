package com.example.shopify.ui.theme.pages.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.shopify.ui.theme.ShopifyTheme

@Composable
fun HomeScreen(navHostController: NavHostController) {
    Surface ( modifier = Modifier
        .fillMaxSize()){
        Column(
//                .background(color = Color.White),

            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Welcome to Shopify!",
                fontWeight = FontWeight.Bold
            )
        }
    }

}


@Preview
@Composable
fun HomeScreenPreview() {
    ShopifyTheme {
        HomeScreen(rememberNavController())
    }
}