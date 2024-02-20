package com.gulu.chapter07

/**
 * @author chocolate
 *         2024/2/6 14:58
 */
object Scala_17_Collection_Method_03 {


  // TODO: multiple collection method
  def main(args: Array[String]): Unit = {
    val list1 = List(1, 2, 3, 4, 5)
    val list2 = List(3, 4, 5, 6, 7)

    // 交集
    println(list1.intersect(list2))

    // 并集（list并集不去重，set并集会去重）
    println(list1.union(list2))

    // 差集，左边为主（完整差集需要左右两边分别调用后合并）
    println(list1.diff(list2))

    // 拉链
    // 将两个数据集相同位置的元素作放在一起，形成对偶元组
    // 如果两个数据集长度不一样，以最短的为准
    println(list1.zip(list2))

    // 将集合的索引与元素封装成元组
    println("zipWithIndex" + list1.zipWithIndex)

    // TODO:   map：功能函数
    //  将数据集中的每一个元素进行转换处理，获取转换后新的数据集
    val list = list1.map(_ + 100)
    println(list)

    val  result = for (elem <- list) yield{
      elem - 100
    }
    println(result)
  }
}
