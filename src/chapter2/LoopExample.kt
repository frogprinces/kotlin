package chapter2

/**
 * Author: Created by zs on 2018/6/29.
 *
 * Description:
 */
fun main(args: Array<String>) {

    //for循环有iterator
    for (arg in args){
        println(arg)
    }

    for (indexedValue in args.withIndex()){
        println("${indexedValue.index} -> ${indexedValue.value}")
    }

    for ((index, value) in args.withIndex()){
        println("$index -> $value")
    }

    var x = 5
    while (x > 0){
        println(x)
        x --
    }

    do {
        println(x)
        x --
    }while (x > 0)

    //continue 和 break  同  java一致

    //变长参数
    hello(1,2,3,4, string="你好")

    var array = intArrayOf(1, 2, 3)

    hello(*array, string="nihao")
}

fun hello(vararg ints: Int, string: String){

}