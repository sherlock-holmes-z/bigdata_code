package com.gulu.chapter05

import com.gulu.chapter05.Scala_Object_04_Access.User

/**
 * @author chocolate
 *         2024/2/2 16:15
 */
object Scala_Object_04_Access {

  // TODO: 4种访问权限
  //  private：同类
  //  private[包名] 包私有，同类，同包，子包
  //  protected ：同类，子类
  //  default/public  任何

  def main(args: Array[String]): Unit = {
    val user = new User
    //    user.name // 不是同类无法访问
    user.age = 11 // 同包可访问
    // user.sex // 不是同类，子类
  }

  class User {
    private var name: String = "zhangSan"
    private[chapter05] var age: Int = 10
    protected var sex: Char = 0
    var addr: String = "shanghai"

    def main(args: Array[String]): Unit = {
      this.name = "zhangSan2" // 同类可访问
    }
  }

}
