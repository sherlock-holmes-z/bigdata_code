package com.gulu.chapter2

import java.io.PrintWriter
import scala.io.Source

/**
 * @author chocolate
 *         2024/1/28 22:27
 */
object FileScala {

  def main(args: Array[String]): Unit = {

    // 输入，从文件输入scala程序
    val source = Source.fromFile("D:\\bigdata_code\\scala_code\\scala_demo\\src\\com\\gulu\\test\\FileScalaRead.txt")
    val iterable = source.getLines()
    while (iterable.hasNext) {
      println(iterable.next())
    }
    source.close();

    // 输出（使用java方法）
    // 向文件中写入（文件不存在自动生成文件）
    val writer = new PrintWriter("D:\\bigdata_code\\scala_code\\scala_demo\\src\\com\\gulu\\test\\FileScalaWriter.txt")
    writer.println("1")
    writer.println("2")
    writer.flush()
    writer.close()

  }

}
