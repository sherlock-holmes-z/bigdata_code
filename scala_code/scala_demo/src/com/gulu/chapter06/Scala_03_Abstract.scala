package com.gulu.chapter06

/**
 * @author chocolate
 *         2024/2/3 23:44
 */
object Scala_03_Abstract {

  def main(args: Array[String]): Unit = {
    val child = new UserChild1()
    child.test()
  }


  // TODO: abstract修饰，抽象类，无法直接构建对象
  //        需要由子类继承构建,并且子类必须重写抽象方法
  //        1.抽象方法一定在抽象类中，抽象类中不一定有抽象方法
  abstract class User{



    // 不完整的方法，只有声明，没有实现，抽象方法
    def test(): Unit

    def test2(): Unit = {

    }
  }

  class UserChild1 extends User {

    // 重写抽象方法，override可省略
    def test(): Unit = {
      println("userChild1 test")
    }

    // 重写普通方法，必须有override
    override def test2(): Unit = {

    }
  }
}
