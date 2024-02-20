package com.gulu.chapter07

/**
 * @author chocolate
 *         2024/2/6 15:40
 */
object Scala_19_Collection_Method_05_flatMap {

  // TODO: 扁平化操作 flatten
  //  将集合中的整体数据拆分成个体来使用的功能 （默认规则，集合拆分到每个元素，字符串当做char数组）
  def main(args: Array[String]): Unit = {
    val list = List(
      List(1, 2, 3), List(4, 5, 6)
    )
    val flattenList: List[Int] = list.flatten
    println(flattenList)

    // TODO: 自定义扁平化规则
    val stringList = List(
      "hello world", "gulu guli"
    )

    val flatList = stringList.flatMap(_.split(" "))
    println(flatList)
  }
}
