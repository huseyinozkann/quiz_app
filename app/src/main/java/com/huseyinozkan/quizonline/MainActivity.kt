package com.huseyinozkan.quizonline

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.huseyinozkan.quizonline.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    lateinit var quizModelList: MutableList<QuizModel>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        quizModelList = mutableListOf()
        getDataFromFirebase()

    }

    private fun setupRecyclerView(){

    }
    private fun getDataFromFirebase(){
        quizModelList.add(QuizModel("1","Programming","All the basic programming","10"))
        quizModelList.add(QuizModel("2","Computer","All the computer questions","20"))
        quizModelList.add(QuizModel("3","Georaphy","boost your Georaphic knowledge","15"))
        setupRecyclerView()
    }
}