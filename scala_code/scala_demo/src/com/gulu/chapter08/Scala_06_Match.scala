package com.gulu.chapter08

/**
 * @author chocolate
 *         2024/2/20 14:47
 */
object Scala_06_Match {

  // TODO: 模式匹配 - 偏函数
  //  功能函数中，存在【全函数】和【偏函数】的概念
  //  全函数：表示函数会对数据集中所有的数据进行处理
  //  偏函数：对数据集中满足条件的数据进行处理
  def main(args: Array[String]): Unit = {
    val list = List(1, 2, "3", "4")

    // map就是全函数，需要对所有的数据进行处理，无法处理字符串就会报错
    //    val newList = list.map {
    //      case i: Int => i + 1
    //    }

    // 对函数进行过滤后处理，本质还是全函数
    //    val newList = list.filter(_.isInstanceOf[Int]).map {
    //      case i: Int => i + 1
    //    }

    // collect是偏函数，只对模式匹配的数据进行
    val newList = list.collect { case i: Int => i + 1 }

    println(newList)

  }

}
