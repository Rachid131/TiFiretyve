package com.example.tifiretyve.model

//holds the string for an answer, and wether it is hidden
class Answer(answerString: String, var isHidden: Boolean) {
    fun changeHidden(){
        isHidden = !isHidden
    }
}