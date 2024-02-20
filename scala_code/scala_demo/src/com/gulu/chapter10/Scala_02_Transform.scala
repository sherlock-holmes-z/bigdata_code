package com.gulu.chapter10

import scala.language.implicitConversions

/**
 * @author chocolate
 *         2024/2/20 17:49
 */
object Scala_02_Transform {

  // TODO: 隐式转换
  def main(args: Array[String]): Unit = {

    val user = new User
    user.insert()
    user.update()

  }

  // 通过隐式转换，实现扩展开发，修改关闭
  implicit def userTransform(user: User): UserExt = {
    new UserExt
  }

  class User {
    def insert(): Unit = {
      println("insert")
    }
  }

  class UserExt {
    def update(): Unit = {
      println("update")
    }
  }

}
