package com.chibi.designpatterns.builder.kotlin

import java.util.*

class PaymentKotlin(val id : Int, val name : String, val amount : Boolean) {

    var taxAmt : Int? = null
    private set

    var time : Date? = null
    private set

    class Builder (val id : Int, val name : String, val amount : Boolean)
    {
        var paymentKotlin : PaymentKotlin? = null
        init {
            paymentKotlin = PaymentKotlin(id,name,amount)
        }

         fun setTaxAmt(taxAmt : Int) : Builder{
             paymentKotlin?.taxAmt = taxAmt
             return this
         }

        fun setTime(time : Date) : Builder{
            paymentKotlin?.time = time
            return this
        }

        fun build() : PaymentKotlin
        {
            return paymentKotlin!!
        }
    }
}