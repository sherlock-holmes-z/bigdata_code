package com.gulu.chapter1

/**
 * @author chocolate
 *         2024/1/28 0:40
 *
 *         object:声明对象（单例）
 *                object声明一个对象，编译同时会生成.class和$.class两个文件，
 *                 HelloWord.class:类型class
 *                 HelloWord$.class:对象class
 */
object HelloWord {

  def main(args: Array[String]): Unit = {
      println("hello gulu")
  }

}
