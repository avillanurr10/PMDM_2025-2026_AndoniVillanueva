package com.example.ejerciciopaginlogin

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.ejerciciopaginlogin.ui.model.LoginStructure
import com.example.ejerciciopaginlogin.ui.theme.EjercicioPaginLoginTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            EjercicioPaginLoginTheme {
                LoginStructure()
            }
        }
    }
}