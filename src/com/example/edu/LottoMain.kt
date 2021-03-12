package com.example.edu

import java.util.*

class LottoMain

fun main(){
    val sc: Scanner = Scanner(System.`in`)

    print("로또 구매 갯수 입력:")
    val buyCount: Int =sc.nextInt()

    printLottoNumbers(makeLottoNumbers(buyCount))
}
