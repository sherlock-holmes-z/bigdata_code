package com.gulu.chapter07

/**
 * @author chocolate
 *         2024/2/6 1:50
 */
object Scala_13_Collection_Tuple_2 {


  // TODO: 集合-Tuple

  def main(args: Array[String]): Unit = {
    // 如果tuple中的元素数量为2，那么称之为【对偶元祖】，也称为键值对对象
    val t1 = ("a", 1)
    val t2 = ("b", 2)

    // 键值对也是Tuple类型
    val t3: (Int, Int) = 1 -> 2

    1 -> 2 -> 3 -> 4 // 与下面的嵌套对偶元祖相同
    (((1, 2), 3), 4)


    // TODO: Map操作有了变化
    val map = Map(t1, t2, ("c", 3))
    for (elem <- map) {
      println(elem._1 + "=" + elem._2)
    }

    println(map)
  }

}
