package com.example.tifiretyve.model

class Answer(answerString: String, var isHidden: Boolean) {
    fun changeHidden(){
        isHidden = !isHidden
    }
}