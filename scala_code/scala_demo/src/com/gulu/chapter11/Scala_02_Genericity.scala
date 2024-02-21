package com.gulu.chapter11

/**
 * @author chocolate
 *         2024/2/21 17:57
 */
object Scala_02_Genericity {

  // TODO: Scala中的泛型也存在【上限】和【下限】的概念


  class Message[T] {
    var context: T = _
  }

  class Producer[T] {
    // T是下限
    def produce(message: Message[_ >: T]): Unit = {

    }
  }

  class Consumer[T] {
    // T是上限
    def consumer(message: Message[_ <: T]): Unit = {

    }
  }
}