package com.gulu.chapter03

import scala.util.control.Breaks

/**
 * @author chocolate
 *         2024/1/29 23:28
 *
 *         中断循环
 */
object Scala_break {

  def main(args: Array[String]): Unit = {

    // todo scala没有continue和break关键字

    // if else代替continue
    for (num <- 1 to 4) {
      if (num != 3) {
        println(num)
      }
    }

    println("-------跳出循环，代替break-----------")

    // 采用面向对象方式跳出循环，Breaks.break()代替java关键字break
    Breaks.breakable({
      for (num <- 1 to 4) {
        if (num == 3) {
          Breaks.break() // 底层实现为抛出异常来中端循环,所以循环外需要捕捉异常Breaks.breakable
        }
        println(num)
      }
    })
  }
}
