package com.gulu.chapter2

/**
 * @author chocolate
 *         2024/1/28 22:22
 */
object IoScala {

  def main(args: Array[String]): Unit = {

    // 读取控制台输入的值
    val str = scala.io.StdIn.readLine()
    val readInt = scala.io.StdIn.readInt() // readInt接收大不是数组会报错
    println(s"read console : ${str}; read int : ${readInt}")

  }

}
