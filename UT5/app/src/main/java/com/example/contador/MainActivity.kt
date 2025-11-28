package com.example.contador

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ContadorApp()
        }
    }
}

@Composable
fun ContadorApp() {
    var contador by remember { mutableStateOf(0) }

    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ) {

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(20.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {

            Text(
                text = "CONTADOR",
                fontSize = 32.sp
            )

            Spacer(modifier = Modifier.height(35.dp))

            Text(
                text = contador.toString(),
                fontSize = 90.sp
            )

            Spacer(modifier = Modifier.height(35.dp))

            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                OutlinedButton(
                    onClick = { contador++ }
                ) {
                    Text(text = "+")
                }

                Spacer(modifier = Modifier.width(25.dp))

                OutlinedButton(
                    onClick = {
                        if (contador > 0) contador--
                    }
                ) {
                    Text(text = "-")
                }
            }

            Spacer(modifier = Modifier.height(30.dp))

            OutlinedButton(
                onClick = { contador = 0 }
            ) {
                Text("Reiniciar")
            }
        }
    }
}
