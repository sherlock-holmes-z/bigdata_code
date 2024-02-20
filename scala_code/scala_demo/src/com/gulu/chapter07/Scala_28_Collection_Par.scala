package com.gulu.chapter07

import scala.collection.parallel.immutable.ParRange

/**
 * @author chocolate
 *         2024/2/18 23:07
 */
object Scala_28_Collection_Par {
  def main(args: Array[String]): Unit = {
    // TODO: Par并行计算
    //  将普通集合转换为并行集合，可以多线程进行计算
    val par: ParRange = (0 to 10).par
    val result2 = (0 to 10).par.map(x => Thread.currentThread().getName)

    val result1 = (0 to 10).map(x => Thread.currentThread().getName)

    println(result1)
    println(result2)
  }
}
