package com.example.mobileapp03_02_2022

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.mobileapp03_02_2022.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        // https://developer.android.com/topic/libraries/view-binding#kotlin
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view: View = binding.root
        setContentView(view)

        binding.lowerCaseButton.setOnClickListener{
            val inputField = binding.writeAWord
            val word = inputField.text.toString().trim()
            if(word.isEmpty()){
                inputField.error = "No name"
                return@setOnClickListener
            }
            val lowercaseWord = word.lowercase()
            binding.TextViewMessage.text = "Hello $lowercaseWord"
        }
        binding.upperCaseButton.setOnClickListener{
            val inputField = binding.writeAWord
            val word = inputField.text.toString().trim()
            if(word.isEmpty()){
                inputField.error = "No name"
                return@setOnClickListener
            }
            val uppercaseWord = word.uppercase()
            binding.TextViewMessage.text = "Hello $uppercaseWord"
        }
        binding.capitalizeButton.setOnClickListener{
            val inputField = binding.writeAWord
            val word = inputField.text.toString().trim()
            if(word.isEmpty()){
                inputField.error = "No name"
                return@setOnClickListener
            }
            val capitalizeWord = word.replaceFirstChar { it.uppercase() }
            binding.TextViewMessage.text = "Hello $capitalizeWord"
        }
        binding.reverseButton.setOnClickListener{
            val inputField = binding.writeAWord
            val word = inputField.text.toString().trim()
            if(word.isEmpty()){
                inputField.error = "No name"
                return@setOnClickListener
            }
            val reverseWord = word.reversed()
            binding.TextViewMessage.text = "Hello $reverseWord"
        }


    }
}