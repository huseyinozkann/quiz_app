package com.huseyinozkan.quizonline

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.huseyinozkan.quizonline.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    lateinit var quizModelList: MutableList<QuizModel>
    lateinit var adapter: QuizListAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        quizModelList = mutableListOf()
        getDataFromFirebase()

    }

    private fun setupRecyclerView(){
        adapter = QuizListAdapter(quizModelList)
        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        binding.recyclerView.adapter = adapter
    }
    private fun getDataFromFirebase(){

        val listQuestionModel = mutableListOf<QuestionModel>()
        listQuestionModel.add(QuestionModel("What is Android?", mutableListOf("Language", "OS","Product","None"),"OS"))
        listQuestionModel.add(QuestionModel("What is Android?", mutableListOf("Language", "OS","Product","None"),"OS"))
        listQuestionModel.add(QuestionModel("What is Android?", mutableListOf("Language", "OS","Product","None"),"OS"))

        quizModelList.add(QuizModel("1","Programming","All the basic programming","10",listQuestionModel))
        //quizModelList.add(QuizModel("2","Computer","All the computer questions","20"))
        //quizModelList.add(QuizModel("3","Georaphy","boost your Georaphic knowledge","15"))
        setupRecyclerView()
    }
}