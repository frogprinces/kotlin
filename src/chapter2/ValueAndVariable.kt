package chapter2

/**
 * Author: Created by zs on 2018/6/26.
 *
 * Description: 常量(val)  变量(var)
 *
 * val = value 值类型，类似java中的final 不可重复赋值
 * eg: 运行时常量 val x = getX()  编译时常量 const val x = 2
 *
 * var = variable
 * eg: var x = "hello"  x = "world"
 */

val FINAL_HELLO_WORLD = "HelloWorld"

var helloWorld: String = "HelloWorld"

//类型推倒, 可以省略类型Sting  编译器可以智能的推倒出类型
val FINAL_HELLO_CHINA = "HelloChina"

fun main(args: Array<String>) {
    helloWorld = "HelloChina"
}