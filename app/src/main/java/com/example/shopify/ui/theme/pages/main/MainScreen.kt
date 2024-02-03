package com.example.shopify.ui.theme.pages.main

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.IconButton
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.navigation.compose.rememberNavController
import com.example.shopify.navigation.AppNavHost
import com.example.shopify.ui.theme.Orange
import com.example.shopify.ui.theme.ShopifyTheme
import com.example.shopify.ui.theme.pages.home.HomeScreen

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen() {
    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = { Text(
                    text = "SHOPIFY",
                    fontSize = 30.sp,
                    fontWeight = FontWeight.Bold
                    )},
                colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
                    containerColor = Orange,
                    titleContentColor = Color.White
                )
            )
        },
        bottomBar = {
            BottomAppBar{

                }
        }

    ) { paddingValues ->
        Modifier.padding(paddingValues)
        AppNavHost(navController = rememberNavController())
    }
}


@Preview
@Composable
fun MainScreenPreview() {
    ShopifyTheme {
        MainScreen()
    }
}