package com.gulu.chapter03

/**
 * @author chocolate
 *         2024/1/29 23:10
 *
 *         循环返回值
 */
object Scala_for_return {

  def main(args: Array[String]): Unit = {

    // todo 使用yield将每次循环的最后一个逻辑代码的结果保存
    val result = for (i <- 1 to 3) yield {

      if (i == 2) {
        println(i)
      } else {
        i
      }
    }
    println(result)


    // java中的yield方法,会加上引号
    Thread.`yield`()
  }

}
