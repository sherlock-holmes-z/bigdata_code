package com.gulu.chapter05

import scala.beans.BeanProperty


/**
 * @author chocolate
 *         2024/2/2 14:39
 *
 *         属性
 */
object Scala_Object_03 {

  def main(args: Array[String]): Unit = {
    val user = new User
    println(user.name)
    println(user.getDream)

//    user.email 无法访问
  }

  private class User {
    // scala中声明属性等同于给类声明变量
    // 变量使用var和val声明
    // 变量的类型如果可以推断出来，可以省略类型
    // 变量必须显示初始化
    // 类的属性在编译时，默认都是private权限,同时生成公共的同名get/set方法，但不已get/set开头（当访问属性时，相当于调用对象的get/set方法）
    var name: String = "gulu"
    val age = 10

    // TODO: scala中属性必须显示初始化，但也希望和java保持一致，用下划线[_]默认赋值
    //  默认赋值只能使用var，并且必须声明类型
    var addr: String = _

    // TODO: scala中的对象属性不遵循bean规范，所以和其他框架集成会有问题
    //  使用@BeanProperty生成get/set方法
    @BeanProperty var dream: String = _

    // 属性使用private，get/set方法也会是private，private属性不能使用@BeanProperty
    private var email = "xxx@qq.com"
  }
}
