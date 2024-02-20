package com.gulu.chapter06

/**
 * @author chocolate
 *         2024/2/4 17:18
 */
object Scala_10_Equals {

  def main(args: Array[String]): Unit = {
    val user1 = new User()
    user1.name = "1"
    val user2 = new User()
    user2.name = "1"
    println(user1.equals(user2))

    // TODO: 获取类信息classOf
    val userClass: Class[User] = classOf[User]
    println(userClass)

    // TODO: 反射
    val name: String = "abc"

    val stringClass = classOf[String] // 获取class
    val valueField = stringClass.getDeclaredField("value") // 获取属性
    valueField.setAccessible(true) // 属性开放权限
    val chars = valueField.get(name).asInstanceOf[Array[Char]] // 获取对象中该属性的值
    chars.update(2,'e')
    println(name)
  }

  class User {
    var name: String = _

    // equals
    override def equals(obj: Any): Boolean = {
      if (obj.isInstanceOf[User]) {
        val obj2 = obj.asInstanceOf[User]
        obj2.name == this.name
      } else {
        false
      }
    }
  }

}
