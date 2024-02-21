package com.gulu.chapter10

object Scala_03_Implicit_args {

  // TODO: 隐式变量
  //  开发的时候，明确知道数据可能发生变化，可以在参数上增加implicit，表示隐式参数
  //  正常调用情况下不会起作用，需要设置隐式变量
  def main(args: Array[String]): Unit = {
    def test(implicit name: String ) = {
      println(s"值为$name")
    }

    // 正常调用，不会改变参数值
    test("wangwu")

    // 设置隐式变量
//    implicit val name: String = "lisi"
    test // 使用隐式参数后面不能加括号，加括号就必须传值
  }

}
