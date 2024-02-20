package com.gulu.chapter05

/**
 * @author chocolate
 *         2024/2/2 16:36
 *
 *         类的方法其实就是类中声明的函数
 */
object Scala_Object_05_Method {

  def main(args: Array[String]): Unit = {
    val user = new User()
    user.test() // 类对象调用方法
    User.test() // 类调用静态方法

    println(user.isInstanceOf[User]) // 反编译为instanceof

    val user2: Object = new User()
    val value: User = user2.asInstanceOf[User] // 反编译后为强制类型转换(User)
    println(value)

    // 调用时method类型为java原方法，function为scala函数
    println(user.eq(user2)) // 比较内存地址，反编译为=
    user.equals(user2) // 反编译后为equals
  }

  class User {
    def test(): Unit = {
      println("class test")
    }
  }

  object User {
    def test(): Unit = {
      println("object test")
    }
  }
}
