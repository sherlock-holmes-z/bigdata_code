package com.gulu.chapter06

/**
 * @author chocolate
 *         2024/2/3 23:20
 */
object Scala_02_Private {

  def main(args: Array[String]): Unit = {
    val user = User.apply()
    val user1 = User() //  User.apply()简写

    val user2 = new User("123")
  }


  // TODO: 使用private可以使类的构造方法私有化
  //  1.辅助方法可以构造对象
  //  2.伴生对象可以访问伴生类中的私有内容
  class User private {
    // 辅助方法
    def this(name: String) = {
      this()
    }
  }


  // 伴生对象
  object User {
    // 访问伴生类中私有内容
    def apply(): User = new User()
  }
}
