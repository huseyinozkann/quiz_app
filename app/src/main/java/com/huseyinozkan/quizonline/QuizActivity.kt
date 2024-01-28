package com.huseyinozkan.quizonline

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.huseyinozkan.quizonline.databinding.ActivityQuizBinding

class QuizActivity : AppCompatActivity() {
    lateinit var binding: ActivityQuizBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQuizBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}