package com.chibi.designpatterns.singleton.kotlin

object Singleton {
    var instance: Singleton? = null
        get() {
            if (null == field) {
                synchronized(Singleton::class.java) {
                    if (null == field) {
                        field = Singleton
                    }
                }
            }
            return field
        }
        private set
}
