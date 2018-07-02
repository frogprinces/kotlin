package chapter1
/**
 * Author: Created by zs on 2018/6/26.
 *
 * Description: 类与对象
 *
 * 类： 一个抽象的概念  具有某些特征的事物的概括  不特定指代任何一个具体的事物
 *
 * 类的写法  class  <类名>{<成员>}
 *
 * 对象：是一个具体的概念，与类相对 描述某一种类的具体个体
 *
 * 类与对象的关系：一个类通常可以有多个具体的对象，一个对象本质上只能从属于一个类
 *
 */
class MeiZi constructor(voice: String, character: String): Person(voice, character){
    fun run(){
        println("我要飞的更好")
    }
}

class Handsome (voice: String, character: String){

    /**
     * init 构造方法的方法体
     */
    init {
        println("new 了一个帅哥，她的声音$voice, 性格$character")
    }
}

/**
 * 抽象出来一个类
 *
 * 类的继承：提取多个类的共性得到一个更抽象的类
 * 子类拥有父类的一切特征
 * 子类也可以自定义自己的特征
 * 所有类都最终继承子Any
 */
open class Person constructor(voice: String, character: String){

    /**
     * init 构造方法的方法体
     */
    init {
        println("new 了一个person，声音$voice, 性格$character")
    }
}

fun main(args: Array<String>) {
    var meiZi: MeiZi = MeiZi("甜美", "温柔")
    var handsome: Handsome = Handsome("婚后", "彪悍")

    println(meiZi is Person)

    println(Person::class.java.simpleName)

    println(Person::class.java.name)
}


