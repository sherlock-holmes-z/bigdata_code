package com.gulu.chapter06

/**
 * @author chocolate
 *         2024/2/4 13:48
 */
object Scala_05_Object {

  def main(args: Array[String]): Unit = {

    // TODO: object关键字声明的是类，同时也是伴生对象
    //        apply方法可以用于构建对象，但不仅仅能构建对象（apply方法可以被编译器动态识别，所以可以省略）
    val user1 = new User() // 执行class类的构造方法
    println("----------------")
    val user2 = User // 访问的是伴生对象
    println("----------------")
    val user3 = User.apply() // 执行object中的apply
    println("----------------")
    val user4 = User() // apply应用场景多，编译器可以动态识别，所以可以省略

    println(user3)
  }

  class User {
    println("user")
  }

  object User {
    def apply(): User = {
      println("user apply")
      new User()
    }
  }
}
