package com.gulu.chapter11

/**
 * @author chocolate
 *         2024/2/21 17:51
 */
object Scala_01_Genericity {

  // TODO: Scala的泛型
  //  【协变】：泛型前面使用+，泛型子类转为该泛型
  //  【逆变】：泛型前面使用-，泛型父类转为该泛型
  def main(args: Array[String]): Unit = {

    val m1: Message[Parent] = new Message[Parent]
    //    val m2: Message[Parent] = new Message[GrandPa] // -。逆变，父转子
    val m3: Message[Parent] = new Message[Child] // +，协变，子转父
  }

  class Message[+T] {

  }

  class GrandPa {

  }

  class Parent extends GrandPa {

  }

  class Child extends Parent {

  }
}
