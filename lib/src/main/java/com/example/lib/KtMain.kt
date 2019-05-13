package com.example.lib

fun main() {
    System.out.println("hello kotlin")
    KtMain.test()
}

class KtMain{
    companion object {
        fun test (){
            System.out.println("test")
        }

        fun main(args : Array<String>) {

        }

    }
}