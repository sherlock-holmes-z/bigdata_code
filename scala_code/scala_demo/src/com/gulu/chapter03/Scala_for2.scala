package com.gulu.chapter03

/**
 * @author chocolate
 *         2024/1/29 22:47
 *
 *         循环控制
 */
object Scala_for2 {

  def main(args: Array[String]): Unit = {

    // 循环守卫
    for (num <- Range(1, 5) if num != 3) {
      println(num)
    }

    println("------------------")

    // 循环步长by,表示遍历时增长幅度，默认为1，一个一个遍历
    val array = 1 to 5
    for (num <- array by 2) {
      println(num)
    }

    println("------------------")

    // 数组中直接加步长，生成指定步长数组
    val array2 = Range(1, 5, 2)
    for (num <- array2) {
      println(num)
    }


    println("----循环嵌套--------")
    // 外层代码没有处理逻辑时可使用
    for (i <- 1 to 3; j <- 1 to 3) {
      println("i = " + i + "; j = " + j)
    }

    println("=======")
    for (i <- 1 until 4) {
      println("i ==== " + i)
      for (j <- 1 until 4) {
        println("j = " + j)
      }
    }


    println("------引入变量---------")
    for (i <- Range(1, 4)) {
      val j = i + 10
      println(j)
    }
    // 等同于
    for (i <- Range(1, 4); j = i + 10) {
      println(j)
    }


  }

}
