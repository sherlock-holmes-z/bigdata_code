package com.gulu.chapter2

import java.net.Socket

/**
 * @author chocolate
 *         2024/1/28 22:46
 */
object ScalaNetClient {

  def main(args: Array[String]): Unit = {
    val socket = new Socket("localhost", 9999)
    println("client连接成功")
    val out = socket.getOutputStream
    val str = scala.io.StdIn.readLine()
    out.write(str.getBytes)
    out.close()

    println("向发送成功")
    socket.close()
  }

}
