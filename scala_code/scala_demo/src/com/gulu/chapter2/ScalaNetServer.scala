package com.gulu.chapter2

import java.net.ServerSocket

/**
 * @author chocolate
 *         2024/1/28 22:42
 */
object ScalaNetServer {

  def main(args: Array[String]): Unit = {
    val serverSocket = new ServerSocket(9999)
    println("服务器启动成功，等待客户端连接")
    val socket = serverSocket.accept()
    val input = socket.getInputStream
    val i = input.read()
    println(i)

  }

}
