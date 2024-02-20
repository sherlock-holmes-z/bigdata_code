package com.gulu.chapter07

/**
 * @author chocolate
 *         2024/2/18 23:15
 */
object Scala_29_Collection_Test {
  val list = List(
    ("zhangsan", "河北", "鞋"),
    ("lisi", "河北", "衣服"),
    ("wangwu", "河北", "鞋"),
    ("zhangsan", "河南", "鞋"),
    ("lisi", "河南", "衣服"),
    ("wangwu", "河南", "鞋"),
    ("zhangsan", "河南", "鞋"),
    ("lisi", "河北", "衣服"),
    ("wangwu", "河北", "鞋"),
    ("zhangsan", "河北", "鞋"),
    ("lisi", "河北", "衣服"),
    ("wangwu", "河北", "帽子"),
    ("zhangsan", "河南", "鞋"),
    ("lisi", "河南", "衣服"),
    ("wangwu", "河南", "帽子"),
    ("zhangsan", "河南", "鞋"),
    ("lisi", "河北", "衣服"),
    ("wangwu", "河北", "帽子"),
    ("lisi", "河北", "衣服"),
    ("wangwu", "河北", "电脑"),
    ("zhangsan", "河南", "鞋"),
    ("lisi", "河南", "衣服"),
    ("wangwu", "河南", "电脑"),
    ("zhangsan", "河南", "电脑"),
    ("lisi", "河北", "衣服"),
    ("wangwu", "河北", "帽子")
  )

  // todo 统计不同省份的商品点击排行
  def main(args: Array[String]): Unit = {
    val map = list
      .groupBy(_._2)
      .mapValues(
        _.groupBy(_._3)
          .mapValues(_.size)
          .toList
          .sortBy(_._2)(Ordering.Int.reverse)
      )
    println(map)
  }
}
