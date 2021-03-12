package com.example.edu

import java.util.*
import kotlin.collections.HashSet


fun makeLottoNumbers(buyCount: Int): HashSet<Int> {
    val random = Random()
    val ranDomNumSet: HashSet<Int> = HashSet()
   
    while(ranDomNumSet.size< buyCount*6)
          ranDomNumSet.add(random.nextInt(45)+1)

    return ranDomNumSet
}

fun printLottoNumbers(lottoNumSet : HashSet<Int>) :Unit{
    var count : Int =0

    lottoNumSet.forEach {
        count++
        if(it<10)
            print("0${it} ")
        else
            print("$it ")

        if(count%6===0)
            print("\n")
    }

}
