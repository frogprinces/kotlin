package chapter1

/**
 * Author: Created by zs on 2018/6/26.
 *
 * Description: 数组
 */

val arrayOfInt: IntArray = intArrayOf(1, 3, 8, 9, 10)
val arrayOfChar: CharArray = charArrayOf('a','b','c')
val arrayOfString: Array<String> = arrayOf("我", "是", "中国人")

fun main(args: Array<String>) {

    //长度
    println(arrayOfChar.size)

    //遍历
    for(int in arrayOfInt){
        print(int)
    }

    //获取
    println(arrayOfChar[1])

    //修改
    arrayOfChar[1] = 'd'

    //连接字符串
    println(arrayOfChar.joinToString(""))

    //选择获取
    println(arrayOfInt.slice(1..2))
}