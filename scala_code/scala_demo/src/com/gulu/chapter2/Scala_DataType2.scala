package com.gulu.chapter2

/**
 * @author chocolate
 *         2024/1/28 23:34
 */
object Scala_DataType2 {

  def main(args: Array[String]): Unit = {
    val a: Int = 1
    val b: String = "b"

    // 任意值类型
    val s1: AnyVal = a

    // 任意引用类型
    val s2: AnyRef = b
    // todo anyVal和AnyRef之间不能相互转换


    // 任意类型（值和引用的顶级）
    val s3: Any = a
    val s4: Any = b

    // 隐式转换
    // byte short int long float double    char可以从int开始转换（因为char是2字节无符号整数，byte是1字节，short是2字节有符号整数）

  }
}
