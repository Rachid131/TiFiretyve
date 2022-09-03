package com.example.tifiretyve.model

import java.util.*


//holds hardcoded array of trials.
class Trialbank {

    private val trialList = arrayOf(
        Trial(
            "What is 1+5?",
            Answer("15", false) ,
            Answer("1", false),
            Answer("8", false),
            Answer("6", false),
            4
        ),
        Trial(
            "What is the name of this game?",
            Answer("Who wants to be a millionaire", false) ,
            Answer("TiFireTyve", false),
            Answer("Ripoff quiz", false),
            Answer("Super Mario", false),
            3
        ))

    fun getRandomTrial(): Trial {
        val random_Number = Random().nextInt(trialList.size)
        return trialList[random_Number]
    }

    fun getTrialAtIndex(index: Int): Trial{
        return trialList[index]
    }

}