package com.example.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    var greeting:String = "My first variable"; // Var - mutable variable (we can change it)
    // If we want to create immutable variable - we must use val (we can't change it)

    // Regular way to of concatenation
    val language:String = "Kotlin"
    val creator:String = "JetBrains"
    val description = language + "is created by" + creator
    // description: Kotlin is created by JetBrains

    // Another way (better to use)
    val releaseDate = "July 2011"
    val releaseString = "Kotlin was released in $releaseDate"
    // releaseString: Kotlin was released in July 2011

}