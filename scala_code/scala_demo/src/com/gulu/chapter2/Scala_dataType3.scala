package com.gulu.chapter2

/**
 * @author chocolate
 *         2024/1/29 15:55
 */
object Scala_dataType3 {

  def main(args: Array[String]): Unit = {
    // 可以正常运行（常量在编译时计算，编译的class文件直接赋值B,没有类型转换）
    val s: Char = 'A' + 1
    println(s)

    // 不能正常运行，b需要在运行时计算，Int无法转为char
//    val a: Char = 'A'
//    val b: Char = a + 1   // char+int的结果应该是int类型
//    println(b)

    val c:Int = 10
    println(c.toByte)
  }

}
