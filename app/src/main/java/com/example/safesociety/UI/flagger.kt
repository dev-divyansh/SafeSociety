package com.example.safesociety.UI

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import com.example.safesociety.R
import com.example.safesociety.databinding.ActivityFlaggerBinding

class flagger : AppCompatActivity() {
    private lateinit var binding: ActivityFlaggerBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityFlaggerBinding.inflate(layoutInflater)

        setContentView(binding.root)

        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN , WindowManager.LayoutParams.FLAG_FULLSCREEN
        )
    }
}