package com.gulu.chapter03

/**
 * @author chocolate
 *         2024/1/29 17:03
 */
object Scala_Oper2 {

  /**
   * 赋值运算符
   * 没有i++，i--运算，因为这两种运算有歧义，所以采用+=,-=来代替
   */
  def main(args: Array[String]): Unit = {
    var num1 = 1
    num1 += 10
    println(num1)

    var num2 = 1
    num2 -= 10
    println(num2)
  }

}
