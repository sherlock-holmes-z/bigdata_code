package com.gulu.chapter06

/**
 * @author chocolate
 *         2024/2/4 14:03
 */
object Scala_06_Trait {

  def main(args: Array[String]): Unit = {
    // TODO: Scala中的特质trait，编译后就是java的interface
    //  1.没有父类，直接采用extends来混入
    //  2.有父类或多个特质，父类和第一个特质采用extends，后续采用with

  }


  // 定义特质
  trait Animal {
    def eat(): Unit
  }

  trait Test {
    def test(): Unit
  }

  // TODO: 没有父类，直接采用extends来混入 
  class Dog extends Animal {

    override def eat(): Unit = {
      println("dog eat")
    }
  }

  // TODO: 有父类或多个特质，父类和第一个特质采用extends，后续采用with
  class User extends Person with Animal {

    override def eat(): Unit = {
      println("user eat")
    }
  }

  class User2 extends Animal with Test {

    override def eat(): Unit = {
      println("user2 eat")
    }

    override def test(): Unit = {
      println("user2 test")
    }
  }

  class Person {

  }
}
