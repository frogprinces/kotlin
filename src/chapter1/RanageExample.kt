package chapter1

/**
 * Author: Created by zs on 2018/6/26.
 *
 * Description: 区间
 *
 * 一个数学上的范围，表示范围
 * ClosedRange的子类，IntRange最常用
 *
 * 基本写法：
 *  - 0..100 表示[0,100]
 *  - 0 until 100 表示[0, 100)
 *  - i in 0..100 判断i是否在[0,100]
 */

//[0, 1024] 闭区间
val range: IntRange = 0..1024

//[0, 1024) --> [0, 1023]
val range2: IntRange = 0 until 1024

val range3: IntRange = -0..-1

fun main(args: Array<String>) {
    //true
    println(range.contains(500))
    println(500 in range)

    //false
    println(range2.contains(1024))

    //true
    println(range3.isEmpty())

    //遍历
    for (i in range){
        print("$i,")
    }
}

