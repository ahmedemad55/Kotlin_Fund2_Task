package com.example.kotlinfun2

fun main(){
    println("1-Happy  2-Sad")
    println("Choose the number of your mood : ")
    val mood = readLine()?.toInt()

    println("1-Sunny  2-Rainy  3-Mild")
    println("Choose the number of the weather today : ")
    val weather = readLine()?.toInt()

    todo (mood!!,weather!!)

}

fun todo(mood:Int = 1 ,weather:Int = 3 ){
    if (mood == 1 && weather == 1){
        println("Go to swimming")
    }

    else if (mood == 1 && weather == 2){
        println("Stay and watch your favorite film")
    }

    else if (mood == 1 && weather == 3){
        println("Go to gym")
    }

    else if (mood == 2 && weather == 1){
        println("Go to club")
    }

    else if (mood == 2 && weather == 2){
        println("Play games on computer")
    }

    else if (mood == 2 && weather == 3){
        println("Call your friend and enjoy")
    }

    else{
        println("Please enter a valid number")

    }
    temperature(weather)
}

fun temperature(weather: Int =3 ){
    when(weather){
        1-> println("Temperature from 35 to 50")
        2-> println("Temperature from 10 to 20")
        3-> println("Temperature from 20 to 35")
    }
}

// What are types of outputs?
// val hello1 = Hello()
// val hello2 = {Hello()}
// println(hello1)--> String
// println(hello2)--> Function, lambda expression