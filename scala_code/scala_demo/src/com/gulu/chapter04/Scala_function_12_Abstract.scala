package com.gulu.chapter04

import scala.util.control.Breaks._

/**
 * @author chocolate
 *         2024/2/1 14:52
 *
 *         控制抽象
 */
object Scala_function_12_Abstract {

  def main(args: Array[String]): Unit = {

    def func1(f: () => Unit): Unit = {
      f()
    }

    // 函数类型只有返回，没有输入的时候，称之为【抽象】
    // 此时方法的执行不能再加参数括号
    def func2(f: => Unit) = {
      f
    }

    //
    func1(() => println("func1"))
    //    func1(println("func1"))   // 不可以省略参数括号，print本身就是一个函数，这么写表示传入了一个有参函数

    // 完整的参数传递，是将函数对象作为参数进行传递
    // 控制抽象，是将逻辑代码进行传递
    //  自定义语法时，可以使用控制抽象，因为代码可传递，逻辑可变化
    func2({
      println("func2")
      println("func2 - 1")
    })
    // 将print作为一串代码传递到func2中执行


    println("---------循环中断的代码体现控制抽象-----------")


    //    Breaks.breakable({
    //      for (i <- 1 to 5) {
    //        if (i == 3) {
    //          Breaks.break()
    //        }
    //        println(i)
    //      }
    //    })

    // import scala.util.control.Breaks._
    // 类后添加【._】的话，可以省略Breaks
    breakable({
      for (i <- 1 to 5) {
        if (i == 3) {
          break // 方法无参，括号可不加
        }
        println(i)
      }
    })
    // breakable是个函数,使用控制抽象，不定义参数，将我们自定的代码传到该函数中执行，参数跨越多行，可以使用{}
    //    def breakable(op: => Unit) {
    //      try {
    //        op
    //      } catch {
    //        case ex: BreakControl =>
    //          if (ex ne breakException) throw ex
    //      }
    //    }


  }
}
