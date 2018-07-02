package chapter1

/**
 * Created by zs on 2018/6/25.
 */


/**
 * Boolean类型
 */

/**
 * number类型 主要包括整型和浮点型
 *
 * 浮点型：Double类型(64)  Float类型(32)
 *
 * 整型：Long类型(64) Int类型(32) Short(16)
 *
 * 字节：Byte(8)
 */

/**
 * 装箱、拆箱
 *
 * Kotlin中没有像Java中装箱、拆箱的概念
 *
 * Char类型
 */

/**
 * 基本类型的转换
 *
 * 不可隐式转换
 */

val aInt: Int = 5
val aLong: Long = aInt.toLong()

/**
 * ${chapter1.getStr1 === chapter1.getStr2}
 *
 * 字符串模板，单个变量时使用 $chapter1.getStr1  表达式时使用花括号{}扩起来
 */
var str1: String = "Hello"
var str2: String = String(charArrayOf('H', 'e', 'l', 'l', 'o'))

/**
 * 转义字符
 */
var sayHello: String = "Hello \"Jack\""


fun main(args: Array<String>) {
    //等同于java中的equals方法
    println("chapter1.getStr1 == chapter1.getStr2: ${str1 == str2}")
    //等同于java中的==
    println("chapter1.getStr1 === chapter1.getStr2: ${str1 === str2}")

    println(sayHello)

}








