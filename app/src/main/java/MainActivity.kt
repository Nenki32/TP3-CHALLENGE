package com.example.myprimeraappandroid

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.example.myprimeraappandroid.ui.LoginScreen
import com.example.myprimeraappandroid.ui.RegisterScreen
import com.example.myprimeraappandroid.ui.WelcomeScreen
import com.example.myprimeraappandroid.ui.theme.MyPrimeraAppAndroidTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyPrimeraAppAndroidTheme {
                Surface(
                    modifier = Modifier.Companion.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    WelcomeScreen()
                    //LoginScreen()
                    //RegisterScreen()
                }
            }
        }
    }
}