package com.gulu.chapter04

/**
 * @author chocolate
 *         2024/2/1 16:38
 *
 *         函数柯理化（Curry）
 */
object Scala_function_13_Curry {

  def main(args: Array[String]): Unit = {
    def func1(a: Int, b: Int) = {
      for (i <- 1 to a) {
        println(i)
      }
      for (i <- 1 to b) {
        println(i)
      }
    }

    // 两个参数之间没有联系，但是传参的时候必须都穿
    func1(5, 6)

    println("-------curry化----")
    def func2(a: Int)(b: Int) = {
      for (i <- 1 to a) {
        println(s"a : ${i}")
      }
      for (i <- 1 to b) {
        println(s"b : ${i}")
      }
    }
    // 参数分开，可单独将部分传参的函数当做一个对象
    val intToUnit:Int => Unit = func2(2)
    intToUnit(3) // 执行函数时还是需要将后续参数加入

    func2(2)(3)
  }

}
