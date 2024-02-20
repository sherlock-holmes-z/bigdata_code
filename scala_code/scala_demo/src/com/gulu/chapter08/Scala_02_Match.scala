package com.gulu.chapter08

import com.sun.xml.internal.bind.v2.TODO

/**
 * @author chocolate
 *         2024/2/19 14:53
 */
object Scala_02_Match {

  // TODO: 模式匹配  -  规则匹配
  def main(args: Array[String]): Unit = {
    val param: Any = 10

    // TODO: 匹配常量
    param match {
      case "hello" => println("string")
      case 10 => println(10)
      case true => println(true)
      case 'a' => println("char")
    }

    // TODO: 匹配类型
    //  如果所有规则都不匹配，会查找下划线分支，如果想要使用下划线代表的值，需要给下划线起名
    def matchResult(x: Any): String = {
      x match {
        case a: Int => "Int"
        case b: String => "String"
        case c: Boolean => "Boolean"
        case d: List[_] => "List" // 泛型中下划线表示任意类型.Array除外，Array的泛型必须指定才能运行
        case e: Array[Int] => "Array[Int]"
        case something => "something:" + something
      }
    }

    val str = matchResult(Array("1", "2"))
    println(str)


    // TODO: 匹配数组
    for (arr <- Array(Array(0), Array(1, 0), Array(0, 1, 0), Array(1, 1, 0), Array(1, 1, 0, 1), Array("hello", "word"))) {
      val result = arr match {
        case Array(0) => "0" // 精准匹配Array(0)
        case Array(x, y) => x + "," + y // 匹配两个元素的数组
        case Array(0, _*) => "以0开头的数组" // 匹配以0开头的数组，_表示任意值，*表示任意个数
        case _ => "other"
      }
      println(arr.mkString("Array(", ", ", ")") + ":" + result)
    }

    // TODO: 匹配列表
    def listMatch(x: Any): String = {
      x match {
        case List(0) => "0"
        case List(x, y) => x + "," + y // 两个元素的列表
        case List(0, _*) => "以0开头的列表"
        case _ => "other"
      }
    }

    val list: List[Int] = 1 :: 2 :: Nil

    def listMatch2(x: Any): String = {
      x match {
        // ::分割。表示集合至少有两个元素，可以分成三份 1 :: 2 :: Nil
        case first :: second :: other => first + ":" + second + ":" + other
        case _ => "other"
      }
    }

    println(listMatch2(List(1)))

    // TODO: 匹配元祖
    def tupleMatch(x: Any): String = {
      x match {
        case (0, _) => "第一个元素是0，第二个任意值,下划线表示任意而且不使用"
        case (_, 0) => "最后一个元素是0"
        case (a, b) => "对偶元祖，值任意且可以使用:" + a + "-" + b
        case _ => "other"
      }
    }


  }
}
