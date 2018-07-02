package chapter2

/**
 * Author: Created by zs on 2018/6/27.
 *
 * Description:
 */

class X{

}


class GlobalVariable {
    //lateinit 关键字 延迟初始化 告诉编译器后期会妥善处理
    lateinit var sex: String
    val x: X by lazy {
        println("init x")
        X()
    }
    var name: String = "哈哈哈哈"
        get() {
            println("someone tries to get.")
            return field
        }
        set(value) {
            name = value
            println("someone tries to set.")
        }
}

fun main(args: Array<String>) {
    var globalVariable = GlobalVariable()
    println(globalVariable.name)
}