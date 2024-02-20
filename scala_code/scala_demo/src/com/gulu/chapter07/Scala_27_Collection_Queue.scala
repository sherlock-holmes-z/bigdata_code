package com.gulu.chapter07

import scala.collection.mutable

/**
 * @author chocolate
 *         2024/2/18 22:52
 */
object Scala_27_Collection_Queue {

  def main(args: Array[String]): Unit = {
    // TODO: 队列Queue 先进先出
    //  enqueue放元素，dequeue取元素
    val queue = new mutable.Queue[String]()
    queue.enqueue("a","b","c")

    println(queue.dequeue())
    println(queue.dequeue())
    println(queue.dequeue())
  }
}
