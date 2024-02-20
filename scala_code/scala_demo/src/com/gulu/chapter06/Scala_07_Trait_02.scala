package com.gulu.chapter06

/**
 * @author chocolate
 *         2024/2/4 14:36
 */
object Scala_07_Trait_02 {

  // TODO: 执行顺序：parent class > trait class > current class
  //  如果父类和子类同时拥有一个trait，该trait只会在父类初始化前初始化一次，子类初始化不会再执行

  def main(args: Array[String]): Unit = {
    // TODO: trait编译后是interface，但不能只局限于interface
    //  应该理解为interface和abstract的结合
    //  trait可以继承类

    val user = new User()
  }

  trait Run extends Exception {
    // user在初始化的时候会先执行run的初始化
    println("run")
  }

  //  Run继承类后，它的实现User也会继承该类，但是User不能继承多个类
  class User extends Run {
    println("user")
  }

}
