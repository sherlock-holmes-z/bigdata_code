package com.gulu.chapter03

/**
 * @author chocolate
 *         2024/1/29 16:19
 */
object Scala_Oper1 {

  /**
   * 运算符
   * 除了==。其他和java一样
   */
  def main(args: Array[String]): Unit = {

    val a = new String("111")
    val b = new String("111")
    // ==不是比较地址，在scala编译的class文件中表示先比较是否都为null，再equals比较，不会出现null报错
    println(a == b)

    // eq比较内存地址，两种写法（编译后的class文件中为==）
    println(a.eq(b))
    println(a eq b)

    val c = null
    val d = "1"
    println(c == d)
  }

}
