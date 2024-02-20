package com.gulu.chapter04

/**
 * @author chocolate
 *         2024/1/29 23:47
 *
 *         函数&方法
 *
 *         类中声明的函数都叫方法，其他地方声明的就是函数
 *
 *         函数没有重载和重写，类中的方法可以
 *
 *         函数的本质就是方法，编译后的class文件中，增加了修饰符private static final（不能被重载重写）
 *
 */
object Scala_function_01 {

  def main(args: Array[String]): Unit = {
    // 函数可以声明在任意位置，方法只能在类中
    def test(): Unit = {
      println("function....")
    }

    // 如果函数和方法名称相同，默认调用函数，没有函数再调用方法
    // 函数编译时方法时，函数名会自动发生变化,加上$1，为了避免和方法名重复:test$1()
    test()

    // 调用方法，方法和对象相关，函数可以独立使用
    this.test()


    def test$1(): Unit = {
      println("function test$1....")
    }

  }

  def test(): Unit = {
    println("method....")
  }

}
