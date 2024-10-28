package com.example.lab6kotlin

fun main(){
//    val rockPlanets = arrayOf<String>("Mercury", "Venus", "Earth", "Mars")
//    val gasPlanets = arrayOf("Jupiter", "Saturn", "Uranus", "Neptune")
//    val solarSystem = rockPlanets + gasPlanets
//    println(solarSystem[0])
//    println(solarSystem[1])
//    println(solarSystem[2])
//    println(solarSystem[3])
//    println(solarSystem[4])
//    println(solarSystem[5])
//    println(solarSystem[6])
//    println(solarSystem[7])
//
//    solarSystem[3] = "Little Earth"
//    println(solarSystem[3])
//    //solarSystem[8] = "Pluto" will get exception
//    val newSolarSystem = arrayOf("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune", "Pluto")
//    println(newSolarSystem[8])

//    val solarSystem = listOf("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune")
//    println(solarSystem.size)
//    println(solarSystem[2])
//    println(solarSystem.get(3))
//    println(solarSystem.indexOf("Earth"))
//    println(solarSystem.indexOf("Pluto"))
//    for (planet in solarSystem) {
//        println(planet)
//    }

    val solarSystem = mutableListOf("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune")
    solarSystem.add("Pluto")
    solarSystem.add(3, "Theia")
    for (planet in solarSystem) {
        println(planet)
    }

    solarSystem[3] = "Future Moon"
    println(solarSystem[3])
    println(solarSystem[9])

    solarSystem.removeAt(9)
    solarSystem.remove("Future Moon")
    println(solarSystem.contains("Pluto"))
    println("Future Moon" in solarSystem)

}
