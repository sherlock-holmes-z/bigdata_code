package com.gulu.chapter04

/**
 * @author chocolate
 *         2024/1/30 22:32
 *
 *         函数 = 对象
 */
object Scala_function_06 {

  def main(args: Array[String]): Unit = {
    // Scala中万物皆对象，万物皆函数
    // 所以对象 = 函数
    def func1() = {
      println("func1")
    }

    func1 // 方法没有参数可以省略括号，执行函数
    println(func1 _) // 不想让函数执行，只获取对象，使用特殊符号进行转换

    // 0表示0个参数
    // []内为返回值类型
    val f: Function0[Unit] = func1 _

    def func2(age: Int): String = {
      s"age : ${age.toString}"
    }

    println(func2(10))

    // 一个参数，[参数类型，返回值类型]
    // 【函数对象】的参数只能有22个，【函数】可以有无限个参数
    val f2: Function1[Int, String] = func2 _
    println(f2)

    // 简写,函数对象传参后执行
    val f3 = func2 _
    println(f3(333))

    // 函数对象，只有加括号才会作为函数执行
    f
    f()

  }

}
