package com.gulu.chapter08

/**
 * @author chocolate
 *         2024/2/19 21:15
 */
object Scala_04_Match_Object {

  // TODO: 模式匹配，匹配对象
  def main(args: Array[String]): Unit = {
    val user = User("zhangSan", 17)

    // 这里的匹配不是匹配对象的内存地址，而是匹配对象中所有的属性值是否相同
    // 普通的对象无法在模式匹配中使用，因为对象的匹配就是属性的匹配
    // 通过对象获取属性，使用unapply方法（通过属性创建对象apply）
    user match {
      case User("zhangSan", 17) => println("this")
      case _ => println("other")
    }

  }

  class User {
    var name: String = _
    var age: Int = _
  }

  object User {
    def apply(name: String, age: Int): User = {
      val user = new User()
      user.name = name
      user.age = age
      user
    }

    def unapply(user: User): Option[(String, Int)] = {
      Option((user.name, user.age))
    }

  }
}
