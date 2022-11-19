package com.example.workhome.Animal

import com.example.workhome.Animal.Carnevorous
import com.example.workhome.Animal.Herbivorous

fun main() {

    val home= arrayOf("Cow", "Goat")
    for (home in home)
        println("$home")
    val listHome: List<String> = listOf("Cow", "Goat")

    val wild = arrayOf("Elephant", "Giraffe")
    for (wild in wild)
        println("$wild")
    val list2: List<String> = listOf("Elephant", "Giraffe")
        println("Herbivorous: $list2, $listHome")


    val predator = arrayOf("Hyena", "Lynx")
    for (predator in predator)
        println("$predator")
    val list3: List<String> = listOf("Hyena", "Lynx")

    val mammals = arrayOf("Dolphin", "Mink")
    for (mammals in mammals)
        println("$mammals")
    val list4: List<String> = listOf("Dolphin", "Mink")
        println("Carnevorous: $list4, $list3")

}