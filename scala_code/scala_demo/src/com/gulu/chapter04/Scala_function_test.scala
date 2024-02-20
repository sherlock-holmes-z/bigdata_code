package com.gulu.chapter04

import scala.annotation.tailrec


/**
 * @author chocolate
 *         2024/2/1 23:44
 */
object Scala_function_test {

  // 将简化函数式恢复成完整代码
  def main(args: Array[String]): Unit = {

    //test(10,20,_+_)
    def test(num1: Int, num2: Int, f: (Int, Int) => Int): Int = {
      f(num1, num2)
    }

    def func1(n1: Int, n2: Int): Int = {
      n1 + n2
    }

    val r = test(10, 20, func1)

    println(r)


    // scala中字符串也可以乘以数字，重复后拼接
    val name = "zhangsan"
    println(name * 2)


    // todo 使用抽象函数实现while循环
    def myWhile(condition: => Boolean)(method: => Unit): Unit = {
      if (condition) {
        method
        myWhile(condition)(method)
      }
    }

    var count = 1
    myWhile(count < 10) {
      println(count)
      count += 1
    }


  }

}
