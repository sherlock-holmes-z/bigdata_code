package com.gulu.chapter04

/**
 * @author chocolate
 *         2024/1/31 10:49
 *
 *         将函数对象作为参数使用
 */
object Scala_function_07 {

  def main(args: Array[String]): Unit = {
    def func1(): Unit = {
      println("func1")
    }

    // 参数为一个无参无返回值的函数对象
    def func2(f: () => Unit): Unit = {
      f()
    }

    val f1 = func1 _
    func2(f1)
    func2(func1)


    println("------将函数对象作为参数，类似将逻辑进行传递，意味着逻辑不用写死-------")

    def sum(n1: Int, n2: Int): Int = {
      n1 + n2
    }

    def diff(n1: Int, n2: Int): Int = {
      n1 - n2
    }

    def func3(f: (Int, Int) => Int, n1: Int, n2: Int): Unit = {
      val result = f(n1, n2)
      println(result)
    }

    // 传入函数对象
    // 定义函数对象使用_下划线的目的是不让函数执行，将它作为对象使用，明确知道函数不执行的时可以省略下划线
    // 函数作为参数传递时，参数一定是函数对象，不会执行，可以省略下划线
    func3(sum, 1, 2)
    func3(diff, 100, 1)

  }

}
