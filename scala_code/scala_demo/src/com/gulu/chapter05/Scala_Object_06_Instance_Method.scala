package com.gulu.chapter05

/**
 * @author chocolate
 *         2024/2/2 17:45
 */
object Scala_Object_06_Instance_Method {

  def main(args: Array[String]): Unit = {
    // 构建
    new User

    val person = new Person("zhangSan")
    println(person.name_)

    val lisi = new User2("lisi")
    val wangwu = new User2("wangwu", 12)
    println(wangwu.name + wangwu.age)

    val zhaoliu = new User3("zhaoliu", 100)
    println(zhaoliu.name + zhaoliu.age)

  }

  // todo scala的类本身就是一个函数，万物皆函数，万物皆对象（类名后可以加括号）
  //  花括号{}中，即是类的主体，也是构造函数体
  class User() {
    println("user instance")

    // 自定义构造方法，jvm就不会提供默认构造方法
    def User(): Unit = {
      println("user instance")
    }
  }

  // TODO: 构造方法可以传递参数
  class Person(name: String) {
    var name_ : String = name
  }

  // TODO:  1.主构造方法：完成类的初始化
  //        2.辅助构造方法： 类的初始化后，完成类的辅助功能，比如属性赋值
  //                      辅助构造方法必须直接或间接的调用主构造方法
  //                      可以重载，但是主构造方法没有重载
  //                      采用this关键字声明
  //                      构造方法在互相调用之前必须提前声明
  class User2 {

    var name: String = _
    var age: Int = _

    println("main method")

    def this(name: String) = {
      this() // 调用主构造
      this.name = name
      println("1 auxiliary method")
    }

    def this(name: String, age: Int) = {
      this(name) // 调用辅助1，间接调用主构造，辅助1代码顺序必须在2之前
      this.age = age
      println("2 auxiliary method")
    }

  }

  // TODO: scala为了开发方便，可以再构造参数前增加var，val，让参数作为属性存在
  class User3(var name: String, val age: Int) {

  }
}
