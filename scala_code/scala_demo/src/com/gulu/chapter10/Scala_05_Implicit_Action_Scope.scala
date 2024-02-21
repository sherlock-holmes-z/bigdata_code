package com.gulu.chapter10

import com.gulu.chapter10.Scala_05_Implicit_Action_Scope.User


/**
 * @author chocolate
 *         2024/2/21 10:16
 */
object Scala_05_Implicit_Action_Scope extends OtherTrait {

  // TODO: 作用域
  //  隐式转换的规则需要和被转换的类之间存在关系
  //  父类，父类的伴生对象
  //  trait特质，trait的伴生对象
  //  当前包对象
  //  直接导入
  def main(args: Array[String]): Unit = {

    import com.gulu.test._ // 直接导入外部包对象
    val user = new User
    user.insert()
    user.update()
  }

  class User {
    def insert(): Unit = {
      println("insert")
    }
  }
}

// TODO: 父类
class OtherClass {
//  implicit class UserExt(user: User) {
//    def update(): Unit = {
//      println("update")
//    }
//  }
}

// TODO: 父类的伴生对象
object OtherClass{
//  implicit class UserExt(user: User) {
//    def update(): Unit = {
//      println("update")
//    }
//  }
}

// TODO: 混入的trait中包含implicit
trait OtherTrait{
//  implicit class UserExt(user: User) {
//    def update(): Unit = {
//      println("update")
//    }
//  }
}

// TODO: 混入trait的伴生对象中包含implicit
object OtherTrait{
//  implicit class UserExt(user: User) {
//    def update(): Unit = {
//      println("update")
//    }
//  }
}
