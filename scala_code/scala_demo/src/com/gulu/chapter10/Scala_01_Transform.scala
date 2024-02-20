package com.gulu.chapter10

import scala.language.implicitConversions

/**
 * @author chocolate
 *         2024/2/20 15:45
 */
object Scala_01_Transform {

  // TODO: 隐式转换 implicit
  //  所谓隐式转换，其实就是类型转换
  def main(args: Array[String]): Unit = {
    // 1.两个数据之间进行转换，那么类型之间必须有关系：父子类，接口，实现类

    // Int和Byte之间并没有关系，还可以进行隐式转换？
    val a: Byte = 10
    val b: Int = a
    println(b)


    // TODO: 如果在作用域中存在相同的转换规则，那么转换会报错
    implicit def transform(num: Double): Int = {
      num.toInt + 1
    }
    val doubleNum:Double = 10.11
    val intNum:Int = doubleNum // 编译器会自动查找对应的implicit转换规则
    println(intNum)





  }

}
