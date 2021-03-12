package com.example.edu

import java.util.*
import kotlin.collections.ArrayList
import kotlin.collections.HashSet


fun makeLottoNumbers(buyCount: Int): ArrayList<Int> {
    val random = Random()
    val randDomSet: TreeSet<Int> = TreeSet()
    var lottoNumbers = arrayListOf<Int>()

    for(i in 0 until buyCount) {
        while (randDomSet.size <  6) {
            randDomSet.add(random.nextInt(45) + 1)
        }
        randDomSet.forEach { item ->
            lottoNumbers.add(item)
        }
        randDomSet.clear()
    }
    return lottoNumbers
}

fun printLottoNumbers(lottoNumbers : ArrayList<Int>) :Unit{
    var count : Int =0

    lottoNumbers.forEach { num->
        count++
        if(num<10)
            print("0${num} ")
        else
            print("$num ")
                          
        if(count%6===0)
            print("\n")
    }

}
