package com.gulu.chapter06

/**
 * @author chocolate
 *         2024/2/4 16:00
 */
object Scala_09_Trait_04 {

  def main(args: Array[String]): Unit = {
    val user = new User()
    user.doOperator()
  }

  trait Operator {

    def doOperator(): Unit = {
      println("写入数据")
    }
  }

  trait DataBaseOperator extends Operator {

    override def doOperator(): Unit = {
      println("向数据库")
      super.doOperator()
    }


  }

  trait LogOperator extends Operator {
    override def doOperator(): Unit = {
      println("向日志文件")
      // 调用database
      super.doOperator()

      // 不想调用database，而是直接调用直属父类Operator
      //      super[Operator].doOperator()
    }
  }

  // 初始化顺序Operator -> database -> log -> User
  // TODO: 执行时，按初始化顺序相反执行（先log -> database -> operator）
  class User extends DataBaseOperator with LogOperator {
    override def doOperator(): Unit = {
      println("user")

      // TODO: supper不是调用父类，而是调用初始化顺序的上一级接口（调用log）
      super.doOperator()
    }

  }

}
