package chapter1

/**
 * Author: Created by zs on 2018/6/26.
 *
 * Description: 空类型和智能类型的转换 - 编译器知道的太多了
 */

/**
 * ?  可为空
 */
fun getName(): String? {
    return "小明"
}

fun main(args: Array<String>) {

    //if(chapter1.getName == null){return}
    val name: String = getName() ?: return

    //if(chapter1.getName != null){println(chapter1.getName.length)}
    println(getName()?.length)

    // !!告知编译器该对象不为null
    val value: String? = "Hello World"
    println(value!!.length)

    //smart cast
    val person: Person = MeiZi("甜美", "温柔")
    if (person is MeiZi) {
        person.run()
    }

    val handsome: Handsome = Handsome("浑厚", "彪悍")

    /*
        java.lang.ClassCastException: chapter1.Handsome cannot be cast to chapter1.Person
        at NullSafeKt.chapter1.main(NullSafe.kt:34)
     */
    //val p1: chapter1.Person? = handsome as chapter1.Person

    //不会抛出异常,此时的p2 = null  as? 类安全的类型转换
    val p2: Person? = handsome as? Person
    println(p2)
}

