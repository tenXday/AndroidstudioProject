package com.example.testx

open class City {
    var name:String="null"
    var leader:String="null"
    fun welcome(){
        System.out.println("Welcome to ${this.name},Our leader is ${this.leader}")
    }
}
