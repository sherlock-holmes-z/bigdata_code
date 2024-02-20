package com.gulu.chapter07

/**
 * @author chocolate
 *         2024/2/6 1:30
 */
object Scala_12_Collection_Tuple {

  // TODO: Tuple（元祖）是Scala中的特殊集合，采用小括号声明，将数据包含到小括号中即可，但有个数的限制22个
  //  元祖是集合，所以也有类型 TupleN[ClassType...],N为元素个数
  //  Tuple限制集合中元素的个数，但没有限制元素的类型，可以将集合作为其中一个元素放入Tuple中


  /*
    如何将无关的数据当做一个整体使用？
    1. 如果数据之间有关系，生成bean对象，对应属性
    2. 如果数据类型，含义相同，使用集合，Set,Seq,Array
    3. 如果数据之间毫无关系，且类型不同，
   */
  def main(args: Array[String]): Unit = {
    //    val tuple3: Tuple3[Int, String, Boolean] = (1, "zhangSan", false)
    val tuple: (Int, String, Boolean, Array[Int]) = (1, "zhangSan", false, Array(1, 2, 3)) // 简写

    // 元素的访问：
    // 无法使用循环操作，因为数据之间没有关系
    // 采用顺序号访问数据，最大顺序号等同元素个数
    println(tuple._1, tuple._2)

    // 采用索引访问
    val value = tuple.productElement(0)
    println(value)

    // 迭代器获取元素
    tuple.productIterator.foreach(print)
  }
}
