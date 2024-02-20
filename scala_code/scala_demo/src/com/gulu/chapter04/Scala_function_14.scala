package com.gulu.chapter04

import scala.annotation.tailrec

/**
 * @author chocolate
 *         2024/2/1 16:59
 *
 *         递归
 */
object Scala_function_14 {

  def main(args: Array[String]): Unit = {

    // 递归函数必须指定返回值类型，因为推断类型不一定对
    def fun1(num: Int): Int = {
      if (num > 100) {
        0
      } else {
        num + fun1(num + 1)
      }
    }

    println(fun1(1))

    // todo 虚拟机的栈帧大小有限，Scala采用尾（伪）递归优化递归（编译后使用while循环，执行过的函数直接出栈）
    // 只调大栈帧容易导致栈内存没有足够空间分配栈帧，导致栈内存溢出（每个线程都有自己的栈内存）
    def func2(): Unit = {
      println("test")
      func2()
    }


    def func3(): Unit = {
      func3()
      println("test")
    }

  }
}
