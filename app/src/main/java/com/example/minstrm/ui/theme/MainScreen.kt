package com.example.minstrm.ui.theme

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.minstrm.GreetingCard


@Composable
fun MainScreen(onNavigate: () -> Unit) {
    GreetingCard(name = "Bruger") {
        onNavigate()
    }
}
