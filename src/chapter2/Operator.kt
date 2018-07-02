package chapter2

/**
 * Author: Created by zs on 2018/6/27.
 *
 * Description:
 *
 * 基本操作符：
 * - 任何类都可以定义或者重载父类的基本运算符
 * - 通过运算符对应的具名函数来定义
 *
 * 中缀表达式：
 * - 只有一个参数，且用infix修饰的函数
 */

class Complex(var real: Double, var imaginary: Double) {
    operator fun plus(other: Complex): Complex {
        return Complex(real + other.real, imaginary + other.imaginary)
    }
}

fun main(args: Array<String>) {
    var c1 = Complex(3.0, 4.0)
    var c2 = Complex(5.7, 4.8)

    println(c1 + c2)

    //条件判断表达式
    val name = if(args.isEmpty()){
        "张三"
    }else {
        "李四"
    }

    var x = 6
    when(x){
        is Int -> println("is a Int")
    }
}