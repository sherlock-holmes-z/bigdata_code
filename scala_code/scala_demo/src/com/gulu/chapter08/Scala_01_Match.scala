package com.gulu.chapter08

/**
 * @author chocolate
 *         2024/2/19 14:12
 */
object Scala_01_Match {

  // TODO: 模式匹配
  //  对数据进行数据校验的语法,类似于java的switch语法，java需要break防止穿透，case和default关键字存在执行的先后顺序
  def main(args: Array[String]): Unit = {
    val age = 10

    // TODO: 采用match关键字进行规则匹配
    //  规则使用case进行声明，规则匹配成功执行后续代码，不会出现穿透现象，没有歧异
    //  match没有default关键字，下划线_分支放在前面，也会先执行（_表示任意值）
    //  如果没有匹配到任何规则，会报错
    age match {
      case 10 => {
        println(age + "this")
      }
      case 20 => {
        println("20")
      }
      case _ => {
        println("default")
      }
    }

    val operator : Char = '-'
    val result = operator match {
      case '+' => {
        age + age
      }
      case '-' => {
        age - age
      }
      case _ => {
        "err"
      }
    }
    println(result)
  }
}
