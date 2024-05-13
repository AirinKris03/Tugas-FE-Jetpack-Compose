package com.example.woof.data

import java.io.Serializable

data class Knine(
    val id : Int,
    val name : String,
    val from : String,
    val desc : String,
    val knineImageId : Int = 0
) :Serializable