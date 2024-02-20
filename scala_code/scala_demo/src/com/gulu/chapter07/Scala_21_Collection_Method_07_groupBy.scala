package com.gulu.chapter07

/**
 * @author chocolate
 *         2024/2/6 15:57
 */
object Scala_21_Collection_Method_07_groupBy {

  // TODO: 分组groupBy
  //  将数据集中的每一条数据按照指定的规则进行分组
  //  根据函数的返回值作为元素的标记，进行分组
  def main(args: Array[String]): Unit = {
    val list = List(1, 2, 3, 4, 5, 6)

    val groupMap1 = list.groupBy(num => {
      if (num % 2 == 0) {
        "偶数"
      } else {
        "基数"
      }
    })
    println(groupMap1)

    val map = list.groupBy(_ % 2)
    println(map)

  }

}
