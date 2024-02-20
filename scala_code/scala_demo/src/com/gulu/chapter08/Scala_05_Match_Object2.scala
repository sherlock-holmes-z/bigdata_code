package com.gulu.chapter08

/**
 * @author chocolate
 *         2024/2/19 21:45
 */
object Scala_05_Match_Object2 {

  // TODO: 模式匹配 -对象匹配
  //  unapply方式的对象匹配需要重写方法，比较麻烦
  //  在class前面增加一个关键字：case，并且需要传递参数，参数作为属性进行匹配，成为【样例类】
  def main(args: Array[String]): Unit = {
    val user = User("lisi", 18)
    user.age = 10
    user match {
      case User("lisi", 18) => println("this")
      case _ => println("other")
    }
  }

  // 样例类
  // 属性在创建后默认不能改变，需要在参数前加var才可以修改属性
  // 样例类在编译后会产生大量方法，实现序列化接口，equals，copy，hashcode，toString,构造方法
  //  同时声明了伴生对象，存在apply，unapply等
  case class User(name: String, var age: Int)
}
