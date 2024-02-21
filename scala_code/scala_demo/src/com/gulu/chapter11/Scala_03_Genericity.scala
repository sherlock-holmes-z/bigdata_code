package com.gulu.chapter11

object Scala_03_Genericity {

  // TODO: 泛型的上下文限定 = 隐式转换 + 泛型
  def main(args: Array[String]): Unit = {

    def method[A: Test](param: A): Unit = {
      println(param)
    }

    implicit val test : Test[User] = new Test[User]

    method(new User)
  }


  class Test[T] {

  }

  class User{

  }

}
