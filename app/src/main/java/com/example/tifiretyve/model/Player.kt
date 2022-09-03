package com.example.tifiretyve.model

//holds lives of a player, their points, and which lifelines are used
class Player(var points: Int,var lives: Int) {

    fun changeLives(value: Int) {
        this.lives += value
    }

    fun changePoints(value: Int) {
        this.points += value
    }

}