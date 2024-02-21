package com.gulu.chapter10

import scala.language.implicitConversions

/**
 * @author chocolate
 *         2024/2/21 10:06
 */
object Scala_04_Implicit_class {

  // TODO: 隐式类
  def main(args: Array[String]): Unit = {
//    implicit def userTransform(user: User): UserExt = {
//      new UserExt
//    }

    val user = new User
    user.insert()
    user.update()
  }

  // TODO: 隐式类  当前类的内部,构造参数有且只能有一个
  implicit class UserExt(user: User) {
    def update(): Unit = {
      println("update")
    }
  }

  class User {
    def insert(): Unit = {
      println("insert")
    }
  }
}
