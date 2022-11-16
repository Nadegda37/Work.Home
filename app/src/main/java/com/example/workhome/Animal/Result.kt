package com.example.workhome.Animal

import com.example.workhome.Animal.Carnevorous
import com.example.workhome.Animal.Herbivorous

fun main() {

    val home= arrayOf("Cow", "Goat")
    for (home in home)
        println("$home")

    val wild = arrayOf("Elephant", "Giraffe")
    for (wild in wild)
        println("$wild")

    val predator = arrayOf("Hyena", "Lynx")
    for (predator in predator)
        println("$predator")

    val mammals = arrayOf("Dolphin", "Mink")
    for (mammals in mammals)
        println("$mammals")

}