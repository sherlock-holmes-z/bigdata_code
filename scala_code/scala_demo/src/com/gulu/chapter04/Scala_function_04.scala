package com.gulu.chapter04

/**
 * @author chocolate
 *         2024/1/30 21:45
 *
 *         参数默认值
 */
object Scala_function_04 {

  /**
   * 希望参数有默认值，如果不传参，参数去默认值
   *
   * @param args
   */
  def main(args: Array[String]): Unit = {

    // 函数的参数默认使用val声明，不可以修改
    def func(name: String, age: Int): Unit = {
      // 无法赋值 会报错
      // age = 10
    }


    // 参数声明时初始化
    def func2(name: String, age: Int = 10): Unit = {
      println(s"name= $name,age = $age")
    }

    func2("zhangsan")
    func2("lisi", 33)

    // 改变传值顺序,带名传参数
    func2(age = 44, name = "wangwu")
  }

}
