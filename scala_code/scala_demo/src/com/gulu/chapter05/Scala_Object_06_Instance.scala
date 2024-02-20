package com.gulu.chapter05

/**
 * @author chocolate
 *         2024/2/2 17:27
 */
object Scala_Object_06_Instance {

  def main(args: Array[String]): Unit = {
    // 1.new构建对象
    new User()
    // 类的构造方法默认有jvm提供，无参，公共，小括号可以省略
    new User

    // 2.反射构建对象
    //
    // 3.clone
    //
    // 4.反序列化
    //
    // 5.object关键字构建（单例对象，静态代码块，饿汉式）
    println(Scala_Object_06_Instance)

    // 6.scala方法构建对象，本质还是new（不止可以构建对象，可以自定义别的操作）

    val user = User.apply()
    val user2 = User() // 简写，自动识别apply方法
    println(user2.name)
  }

  class User {
    var name: String = _
  }

  object User {
    def apply() = new User()
    //    def apply(): Unit = println("apply method")

  }

}
