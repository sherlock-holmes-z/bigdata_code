package com.gulu.chapter06

/**
 * @author chocolate
 *         2024/2/4 14:50
 */
object Scala_08_Trait_03 {

  def main(args: Array[String]): Unit = {
    // TODO: trait可以在创建对象时将功能mixin混入到对象中
    val user = new User() with Update  // 对user新增功能，但是又不改变user原本结构（开闭原则：扩展开发，修改关闭）
    user.insert()
    user.update()
  }

  trait Update {
    def update(): Unit = {
      println("update user")
    }
  }

  class User {
    def insert(): Unit = {
      println("insert User")
    }
  }
}
