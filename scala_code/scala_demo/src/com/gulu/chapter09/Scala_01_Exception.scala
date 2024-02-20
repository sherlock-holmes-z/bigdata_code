package com.gulu.chapter09

/**
 * @author chocolate
 *         2024/2/20 15:17
 */
object Scala_01_Exception {

  // TODO: 异常
  //  java中异常分为编译时异常，运行时异常
  //  scala中异常没有分类，也没有throws关键字
  def main(args: Array[String]): Unit = {

    // scala的异常处理类似模式匹配
    // 处理异常时，需要主动将异常范围小的放前面，范围大的放后面
    // 无法显示抛出异常，即没有throws关键字
    try {
      var i = 10 / 0
    } catch {
      case exception: ArithmeticException => {
        println("ArithmeticException:" + exception.getMessage)
      }
      case exception: Exception => {
        println("Exception:" + exception.getMessage)
      }
    } finally {
      println("finally")
    }

    test()
  }

  // 明确告诉调用此方法的java代码，这个方法会抛出异常
  @throws[Exception]
  def test(): Unit = {
    throw new Exception()
  }

}
