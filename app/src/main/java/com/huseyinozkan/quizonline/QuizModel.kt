package com.huseyinozkan.quizonline

data class QuizModel(
    val id : String,
    val title : String,
    val subtitle : String,
    val time : String,
){
    constructor() : this("","","","")
}
