package com.gulu.chapter05

import com.gulu.chapter04
import com.gulu.chapter04._

/**
 * @author chocolate
 *         2024/2/2 0:18
 */
object Scala_Object_01 {

  //   Scala是基于java的，基本的面向对象语法是相同的，学习时语法顺序按照代码开发顺序学习

  // todo 包package
  // java包名规则：域名反写 + 项目名称 + 模块名称 + 程序的分层
  //         com.baidu + bar + user + util/service/dao


  def main(args: Array[String]): Unit = {

    // TODO: scala包
    // 包也可以作为对象，在包内创建 package object xxx，
    // 包对象的声明的属性和方法，在当前包和他的子包都可以访问
    packageFunction()

    // import可以导包,导入包后
    // import com.gulu.chapter04 // import关键字可以在任何地方使用,但在顶部作用域更大，方法内部使用，其他方法就无法使用
    chapter04.packageFunc()
    chapter04.Scala_function_01.test() // 通过包名使用包中的对象

    // import com.gulu.chapter04.Scala_function_01
    // import com.gulu.chapter04._   // 下划线_导入包中所有的类，代替java的*
    Scala_function_01.test() // 直接使用对象需要导入指定对象

    // 给导入的类起别名
    // TODO: _root_.  表示从顶级包中导入（默认以当前包为基准导入）
    import _root_.java.util.{HashMap => JavaHashMap}
    val map = new JavaHashMap()

    // 没有_root_.导入的为当前包下的类
    //    new HashSet


    // TODO: scala中lang包，scala包以及Predef对象的方法也无需导入，类似于静态导入
    println() // predef对象的方法

    // TODO: 导入对象的所有内容,对象必须使用val声明
    val user = new User
//    user.test() // 正常使用

    // 导入user对象的所有内容，可以直接使用，Predef同理
    import user._
    test()

  }


  class User {
    def test(): Unit = {
      println("user test")
    }
  }

}

//package java{
//  package util{
//    class HashSet{
//
//    }
//  }
//}
