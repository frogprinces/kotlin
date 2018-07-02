package chapter2

/**
 * Author: Created by zs on 2018/6/27.
 *
 * Description: Lambda表达式： 匿名函数
 *
 * 写法：{参数列表 -> 函数体, 最后一行是返回值}
 * var sum = {a: Int, b: Int - > a + b}
 *
 * 类型：
 * () -> Unit 无参，返回值为Unit
 * (Int) -> Int 传入整型，返回整型
 * (String, (String)->String) -> Boolean  传入字符串、Lambda表达式，返回Boolean
 *
 * Lambda表达式的调用：
 * 用()调用，等价于invoke()
 *
 * Lambda表达式的简化：
 * - 函数参数调用时最后一个Lambda可以移出去
 * - 函数参数只有一个Lambda，调用时小括号可省略
 * - Lambda只有一个参数可默认为it
 */
fun main(args: Array<String>) {

    println(sumLambda(1, 3))

    println(sumLambda.invoke(1, 3))

    for (i in args){
        println(i)
    }

    //传入一个参数时，可用it替代
    args.forEach{
        println(it)
    }

    //更简单的写法
    args.forEach(::println)

    //lambda表达式，此处并不是lambda函数，所以此处return的是main方法
    args.forEach {
        if("q" == it){
            return
        }
        println(it)
    }

    println("the end")

    //跳出forEach的循环
    args.forEach ForEach@{
        if("q" == it){
            return@ForEach
        }
        println(it)
    }

    println("the end")

    hello{ i1, i2 -> print("$i1, $i2")  }

   hello { it -> println(it) }

    //参数最长23个  参照Functions类
    println(sumLambda)
}

fun sum1(arg1: Int, arg2: Int): Int{
    return arg1 + arg2
}

fun sum2(arg1: Int, arg2: Int) = arg1 + arg2

val sumLambda = {arg1: Int, arg2: Int -> arg1 + arg2}

val printHello = {
    println("hello")
}

fun hello(action: (Int, Int) -> Unit){
    action(0, 1)
}

fun hello(action: (Int) -> Unit){
    action(0)
}