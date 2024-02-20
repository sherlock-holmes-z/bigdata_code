package com.gulu.chapter1

/**
 * @author chocolate
 *         2024/1/28 4:32
 */
object Variable {

  /**
   * 声明变量的方式 :
   * var
   * val
   */
  def main(array: Array[String]): Unit = {

    // var声明一个变量必须赋值
    var name: String = "gulu"
    name = "guli"
    println(name)

    // val声明的变量不可修改，（推荐使用）
    // var和val声明的变量在编译后没有本质区别，但在编译时又约束，一旦编译就不能修改
    val age: Int = 100
    println(age)

    // 赋值后类型不可修改
    var addr = "american"

    var h = HelloWord
    println()

    // 命名规则和java一样
    // 如果非要使用关键字命名，可以使用反引号``
    var `var` = "value"
    println(`var`)
  }

}
