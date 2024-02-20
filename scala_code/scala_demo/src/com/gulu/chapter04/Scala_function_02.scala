package com.gulu.chapter04

/**
 * @author chocolate
 *         2024/1/30 20:54
 */
object Scala_function_02 {

  def main(args: Array[String]): Unit = {

    // 函数时功能的封装，意味着功能已经按照特定的规则封装好了，重点在与如何调用
    def func1(): Unit = {
      println("func1")
    }

    // 1.无参无返回值
    // 如果函数没有参数，可以省略方法括号
    func1()
    func1


    // 2.方法在参数只有一个时，可以省略（）和.
    Scala_function_02 func2 "123"

    // 3.有参有返回值
    def func3(s : String): String = {
      return "func3 : " + s
    }
    println(func3("33333"))


    // 4.多参，有返回值
    def func4(name : String,age : Int): String = {
      return s"func4=> name: ${name},age:$age"
    }
    println(func4("zhangsan",11))

  }

  def func2(s : String): Unit = {
    println("func2 : " + s)
  }


}
