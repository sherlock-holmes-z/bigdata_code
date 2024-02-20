package com.gulu.chapter07

import scala.collection.mutable
import scala.io.Source

/**
 * @author chocolate
 *         2024/2/18 15:32
 */
object Scala_24_Collection_Method_10_WordCount {

  def main(args: Array[String]): Unit = {

    // TODO: 使用功能函数实现WordCount
    //  统计一个单词出现的频率
    // 读取word.txt文件，返回(hello,4)(java,3)(scala,2)(spark,1)
    val source = Source.fromFile("D:\\bigdata_code\\scala_code\\scala_demo\\src\\com\\gulu\\test\\word.txt")
    val dataList: List[String] = source.getLines().toList
    source.close()

    // 扁平化拆分
    val strings = dataList.flatMap(l => {
      l.split(" ")
    })

    // 分组
    val map = strings.groupBy(k => k)

    // 修改、统计value
    val wc = map.mapValues(w => w.size)

    // 排序取前三
    val tuples = wc.toList.sortBy(w => {
      (w._2)
    })(Ordering.Int.reverse).take(3)

    println(tuples)

    // todo 函数式编程方式
    val result2 = dataList.flatMap(_.split(" "))
      .groupBy(k => k)
      .mapValues(_.size)
      .toList
      .sortBy(_._2)(Ordering.Int.reverse)
      .take(3)


    //    val map: mutable.Map[String, Int] = mutable.Map()
    //    list.foreach(
    //      line => {
    //        val strings = line.toString.split(" ")
    //        strings.foreach(a => {
    //          map.update(a, map.getOrElse(a, 0) + 1)
    //        })
    //      }
    //    )
    //    println(map)


  }
}
