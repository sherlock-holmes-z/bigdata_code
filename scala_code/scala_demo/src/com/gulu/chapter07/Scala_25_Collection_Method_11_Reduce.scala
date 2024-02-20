package com.gulu.chapter07

import scala.io.Source

/**
 * @author chocolate
 *         2024/2/18 15:32
 */
object Scala_25_Collection_Method_11_Reduce {

  def main(args: Array[String]): Unit = {

    // TODO: 集合--功能函数--计算
    //  集合不可能将所有的计算全部封装，可以自定义计算逻辑作为参数传递给集合，由集合完成计算
    //  计算过程中，必须是两两计算（两两计算完成后，继续执行两两计算，迭代操作）
    val list = List(1, 2, 3, 4)

    //    val result = list.reduce((x: Int, y: Int) => {
    //      println(x + "+" + y)
    //      x + y // 自定义计算方法
    //    })
    val result = list.reduce(_ + _ + 1)
    println(result)

    val left = list.reduceLeft(_ - _) // 从左向右迭代计算，同reduce，从左边加括号计算
    val right = list.reduceRight(_ - _) // 全局从右向左迭代，两两局部从左向右，从右边加括号计算
    println(left + "   " + right)
  }
}
