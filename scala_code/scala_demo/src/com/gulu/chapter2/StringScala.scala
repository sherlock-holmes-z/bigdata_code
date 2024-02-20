package com.gulu.chapter2

/**
 * @author chocolate
 *         2024/1/28 16:05
 */
object StringScala {

  def main(args: Array[String]): Unit = {

    // scala的String使用的是java的String类
    // 所以java中字符串的方法在scala中都可以使用
    val name: String = " scala  "
    println(name.trim)


    // 传值字符串拼接
    // printf将%s作为占位符，将name传到占位符里
    printf("name=%s\n",name)
    printf("name=%s%s\n",name,name)


    // 插值字符串拼接
    // 使用了特殊符号规则，字符串前需要加s
    println(s"插值拼接：name=${name}")
    println(s"插值拼接：name=$name")
    //带{}可以对变量使用方法
    println(s"插值拼接：name=${name.substring(0,5)}")

    // 多行字符串
    // |代表顶格符，换行后与左边界的距离
    println(
      s"""
        |hello
        |${name}
        |""".stripMargin)
  }


}
