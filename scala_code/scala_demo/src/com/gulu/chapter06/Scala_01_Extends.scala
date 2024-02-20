package com.gulu.chapter06

import scala.xml.dtd.ParsedEntityDecl

/**
 * @author chocolate
 *         2024/2/3 22:57
 */
object Scala_01_Extends {

  def main(args: Array[String]): Unit = {

    new Son1

    new Son2("lisi").age = 11
  }

  class Parent(name: String) {
    var age: Int = _
    println(s"parent name: $name")
  }

  // TODO: scala和java的继承都是单继承，主要目的是为了复用父类的功能和属性
  // 固定给父类传值
  class Son1 extends Parent("zhangsan") {
    println("son1")
  }

  // 通过子类构造方法给父类传参
  class Son2(name: String) extends Parent(name) {
    println("son2")
  }
}
