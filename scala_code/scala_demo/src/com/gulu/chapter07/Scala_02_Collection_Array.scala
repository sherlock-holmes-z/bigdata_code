package com.gulu.chapter07

/**
 * @author chocolate
 *         2024/2/5 15:07
 */
object Scala_02_Collection_Array {

  // TODO: 集合 - 数组
  // java中数组不算集合，因为数组没有自己的类型
  // scala是完全面向对象的语言，万物皆对象，数组的类型是Array，本质是java的数组[]

  def main(args: Array[String]): Unit = {
    // 创建数组
    val array = new Array[String](3)

    // 没有增加和删除能力，初始化默认所有值为null
    // 更新
    array.update(0, "zhangSan")
    array(1) = "lisi" // Array访问索引采用的是(),[]表示的是泛型

    // 查询
    println(array(0))

    // 将数组中的数据生成字符串
    println(array.mkString("Array(", ", ", ")"))

    println("-------for--------")
    for (elem <- array) {
      println(elem)
    }

    println("-------foreach--------")

    def forMethod(str: String): Unit = {
      println(s"foreach : ${str}")
    }

    array.foreach(str => forMethod(str)) // 将数组遍历传入一个函数中处理数据
    array.foreach(forMethod)


    // 方法名不重要，返回类型不重要， =换=>
    array.foreach(
      (str: String) => {
        println(s"foreach : ${str}")
      }
    )

    // 参数类型不重要，一个参数时括号可以去掉，逻辑只有一行时花括号可以去掉
    array.foreach(
      str => println(s"foreach : ${str}")
    )

    // 参数按顺序只使用一次，可以用_代替（可以直接使用，不能嵌套使用）
    array.foreach(
      println(_)
    )
  }

}
