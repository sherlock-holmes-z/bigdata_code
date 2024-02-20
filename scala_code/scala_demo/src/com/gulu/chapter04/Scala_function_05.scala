package com.gulu.chapter04

/**
 * @author chocolate
 *         2024/1/30 21:57
 */
object Scala_function_05 {

  def main(args: Array[String]): Unit = {

    // 1.将满足条件的最后一行代码的逻辑结果作为返回值，可以省略return
    def func1(): String = {
      "func1"
    }

    println(func1())

    // 2.函数中逻辑代码只有一行，可以将大括号省略
    def func2(): String = "func2"

    println(func2())


    // 3.函数的返回类型可以通过返回值推断处理，返回值可省略
    def func3() = "func3"

    println(func3())


    // 4.函数参数列表中没有声明参数，参数括号可以省略(因为省略了很多的语法内容，所以函数声明和变量声明很像，所以必须使用def关键字区分)
    def func4 = "func4"
    // 函数没有括号，方法调用时也不能加括号
    println(func4)


    // 5.逻辑代码有return返回值，但是函数声明为Unit，此时return不起作用，可以同时将: Unit = 一起省略
    def func5() {
      return "func5"
    }
    println(func5())
  }

}
