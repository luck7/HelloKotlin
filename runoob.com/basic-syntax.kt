package com.runoob.main

import java.util.*

fun test(){}
class Runoob{}

fun vars(vararg v:Int){
    for(vt in v){
        print(vt)            
    }
}

// 测试
fun main(args: Array<String>) {
    vars(1,2,3,4,5)  // 输出12345
    println("")
    
    println("--------------------")

    val sumLambda: (Int, Int) -> Int = {x,y -> x+y}
    println(sumLambda(1,2))  // 输出 3
}