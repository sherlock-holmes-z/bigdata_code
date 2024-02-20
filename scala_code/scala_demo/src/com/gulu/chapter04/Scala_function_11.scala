package com.gulu.chapter04

/**
 * @author chocolate
 *         2024/1/31 17:50
 *
 *         匿名函数
 */
object Scala_function_11 {

  def main(args: Array[String]): Unit = {

    def func1(f: () => Unit) = {

    }

    // 函数对象作为参数，如果函数对象的参数只有一个，可以省略括号
    def func2(f: String => String) = {

    }

    def func3(f: (String, String) => String): Unit = {
        println(f("aaa","bbb"))
    }

    println("---------test-----------")

    def test(f: String => String, name: String) = {
      f(name)
    }

    def t1(name: String): String = {
      s"t1: $name"
    }

    // 常规写法，需要先定义一个符合test中参数的函数
    val result = test(t1, "zhangSan")
    println(result)

    // 匿名函数
    // 函数对象时作为参数传递，函数的名字和返回类型都已定义好了，可以去掉
    // 逻辑代码只有一行，大括号也可以省略
    // 函数对象的参数类型也定义好了，参数类型也可省略（参数只有一个，还可以省略参数括号，前提是类型已省略）
    test(name => s"t1: $name", "lisi")

    // 参数按照顺序只使用一次，可以使用下划线【_】代替，但是不能嵌套使用
    // test(print(_), "lisi") 不行，_下划线不在当前函数中，而在print()函数中
    // test(_.substring(0,1), "lisi") 可以，下划线_属于当前函数，在当前函数中调用了substring函数
    val r2 = test("t1: " + _, "lisi")
    println(r2)


    func3(_+_)
  }


}
