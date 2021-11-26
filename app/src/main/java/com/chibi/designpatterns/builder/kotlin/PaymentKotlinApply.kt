package com.chibi.designpatterns.builder.kotlin

import java.util.*

//https://ahmed-shaaban-elhdah.medium.com/builder-design-pattern-with-kotlin-bdb9f4ac8583
data class PaymentKotlinApply(val id : Int, val name : String, val amount : Boolean,
var taxAmt : Int? = null, var time : Date? = null ) {

    fun setTaxAmt(taxAmt : Int) = apply {
        this.taxAmt = taxAmt
    }

    fun setTime(time : Date) = apply {
        this.time = time
    }
}