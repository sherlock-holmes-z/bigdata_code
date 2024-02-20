package com.gulu.chapter07

/**
 * @author chocolate
 *         2024/2/6 16:26
 */
object Scala_22_Collection_Method_08_mapValue {

  // TODO: mapValues
  //  当kv类型数据在转换时，如果key不变，只操作value，可以使用

  def main(args: Array[String]): Unit = {
    val dataMap = Map("a" -> 1, "b" -> 2)

    // 使用map函数只修改v
    val dataMap1 = dataMap.map(kv => {
      (kv._1, kv._2 + 100)
    })
    println(dataMap1)

    // TODO: 使用mapValues
    val dataMap2 = dataMap.mapValues(_ + 10)
    println(dataMap2)
  }

}
