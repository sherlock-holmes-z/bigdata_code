package com.gulu.chapter08

/**
 * @author chocolate
 *         2024/2/19 15:33
 */
object Scala_03_Match {

  // TODO: 模式匹配应用
  def main(args: Array[String]): Unit = {

    val data = (1, "zhangSan", 18)
    println(data._1, data._2, data._3)

    // 模式匹配简化
    val (id, name, age) = (1, "zhangSan", 18)
    println(id, name, age)

    val map = Map((1, "a"), (2, "b"), (3, "c"), (4, "b"))
    for (v <- map) {
      println(v._1, v._2)
    }

    for ((k, v) <- map) {
      println(k, v)
    }

    println("模式匹配遍历")
    for ((k, "b") <- map) { // 模式匹配值值操作value为b的元素
      println(k)
    }


    println("模式匹配数据处理")
    val map1 = Map(
      (("北京", "衣服"), 2),
      (("上海", "鞋"), 3),
      (("北京", "鞋"), 4),
      (("上海", "衣服"), 5),
    )

    val r1 = map1.toList.map(
      m => (m._1._1, (m._1._2, m._2))
    )
    println(r1)

    // 使用模式匹配定义数据含义后处理，不能使用小括号，因为小括号在map中表示参数列表
    val r2 = map1.toList.map {
      case ((city, product), click) => {
        (city, (product, click))
      }
    }.groupBy { // 根据city去分组
      case (city, _) => {
        city
      }
    }
    println(r2)


    val list = List(1, 2, 3, "4", 5)
    list.map {
      case a: Int => a + 1
      case b: String => b + "1"
    }.foreach(println)


  }
}
