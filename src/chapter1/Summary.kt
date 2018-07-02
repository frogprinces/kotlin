package chapter1

/**
 * Author: Created by zs on 2018/6/26.
 *
 * Description:
 */

const val FINAL_HELLO_WORLD: String = "Hello World"
var helloWorld: String = FINAL_HELLO_WORLD
var nullAbleHelloWorld: String? = helloWorld
val helloWorldArray: Array<Char> = arrayOf('H','e','l','l','o')
val helloWorldCharArray: CharArray = charArrayOf('H','e','l','l','o')
val helloWorldLength: Int = helloWorld.length
val helloWorldLongLength: Long = helloWorld.length.toLong()

fun main(args: Array<String>) {
    println(nullAbleHelloWorld!!.slice(0..1))
    println(helloWorld.slice(0 until 3))
}