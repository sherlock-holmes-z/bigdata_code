package com.gulu.chapter04

/**
 * @author chocolate
 *         2024/1/30 21:38
 *
 *         可变参数
 */
object Scala_function_03 {

  def main(args: Array[String]): Unit = {
    def func(name1: String,
             name2: String,
             name3: String): Unit = {

    }

    // 可变参数
    def func2(name: String*): Unit = {
      println(name)
    }

    func2() // 空参数为List()
    func2("zhangsan", "lisi", "wangwu") // 可变参数使用WrappedArray封装


    // 一个参数列表中不能有多个可变参数
    def func3(age: Int, name: String*): Unit = {
      println(s"name : $name ,age : $age")
    }

    func3(10)
    func3(11,"zhaoliu","qiqi")
  }

}
