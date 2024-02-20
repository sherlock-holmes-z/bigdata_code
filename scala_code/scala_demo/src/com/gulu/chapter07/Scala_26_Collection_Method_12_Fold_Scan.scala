package com.gulu.chapter07

/**
 * @author chocolate
 *         2024/2/18 17:56
 */
object Scala_26_Collection_Method_12_Fold_Scan {

  def main(args: Array[String]): Unit = {
    // TODO: fold（折叠）将数据集和外部的数据进行聚合
    //  第一个参数为计算初始值，第二个参数为计算函数
    val list = List(1, 2, 3, 4)

    val result = list.fold(10)(_ - _)
    println(result)

    // 等同于fold，将初始值放在集合的左边，从左边两两加括号
    val result2 = list.foldLeft(10)(_ - _)

    // 初始值放在集合的右边，从右边两两加括号
    val result3 = list.foldRight(10)(_ - _)


    // TODO: scan扫描
    //  将fold,foldLeft,foldRight的执行过程记录下来
    println(list.scanLeft(10)(_ - _))
    println(list.scanRight(10)(_ - _))
  }
}
