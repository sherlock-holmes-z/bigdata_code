package com.gulu.chapter06

/**
 * @author chocolate
 *         2024/2/3 23:55
 */
object Scala_04_Abstract_Field {

  def main(args: Array[String]): Unit = {
    new UserChild
  }

  // TODO: 抽象属性：只有声明，没有初始化，就称为抽象属性，抽象属性只能在抽象类中
  //      如果需要构建类，需要通过子类构建，并且需要将属性补充完整
  abstract class User {

    // todo: 抽象属性的本质：抽象属性不会被编译为属性，而是会编译为抽象的get/set方法
    //  子类编译时实现了这些方法，本质上属性的抽象，就是方法的抽象
    var name: String


    var age1: Int = 10

    // TODO: 完整的属性也是可以被重写的，但只能是val，不能是var可变变量
    val age2: Int = 20
  }

  class UserChild extends User {

    // 子类编译时实现了get/set方法
    override var name: String = _

    // TODO: 可变变量var不能被重写，只有val可以被重写
//    var age1: Int = 10

    override val age2: Int = 22


  }
}
