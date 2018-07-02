package chapter2

/**
 * Author: Created by zs on 2018/6/27.
 *
 * Description: 函数
 *
 * - 以特定功能组织起来的代码块
 * - 通过参数的变化和转换进而得到某种结果
 */

/**
 * Unit: 相当于java中的void返回
 */
fun main(args: Array<String>): Unit{
    val arg1 = args[0].toInt()
    val arg2 = args[1].toInt()

    println("$arg1 + $arg2 = ${sum(arg1, arg2)}")

    println(int2Long(3))
}


fun sum(arg1: Int, arg2: Int): Int{
    return arg1 + arg2
}

/**
 * 方法的简写
 */
fun sumSimple(arg1: Int, arg2: Int) =  arg1 + arg2

/**
 * 匿名函数，无名氏一直是神一样的存在
 */
val int2Long = fun(x: Int): Long{
    return x.toLong()
}