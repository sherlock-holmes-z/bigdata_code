package com.gulu.chapter04

/**
 * @author chocolate
 *         2024/1/31 17:10
 */
object Scala_function_09 {

  def main(args: Array[String]): Unit = {

    def func(f: (Int, Int) => Int, num1: Int, num2: Int) = {
      f(num1, num2)
    }

    println(func(_ + _, 1, 2))


    println("-----------------")

    def out(num1: Int) = {
      def mid(f: (Int, Int) => Int) = {
        def inner(num2: Int) = {
          f(num1, num2)
        }

        inner _
      }

      mid _
    }

//    val mid = out(1)
//    val inner = mid(_ + _)
//    val result = inner(3)
//    println(result)
    val num = out(1)(_+_)(4)
    println(num)
  }
}
