package com.gulu.chapter03

/**
 * @author chocolate
 *         2024/1/29 22:19
 */
object Scala_IfReturn {


  def main(args: Array[String]): Unit = {
    val num = 10

    // if的结果为分支的返回值，result是Any类型,如果所有分支都不符合，返回Unit
    val result = if (num == 11) {
      11
      println(12) // 返回Unit类型，()
    } else {
      null
    }
    println(result)

    println("================================")

    // Scala中没有三元表达式,也没有switch语法
    // 如果if else中的逻辑代码只有一行，可以省略大括号
    val rs2 = if (num == 10) "10" else "other"
    println(rs2)

  }

}
