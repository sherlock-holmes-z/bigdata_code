package com.gulu

import com.gulu.chapter10.Scala_05_Implicit_Action_Scope.User

/**
 * @author chocolate
 *         2024/2/21 13:42
 */
package object test {
  implicit class UserExt(user: User) {
    def update(): Unit = {
      println("update")
    }
  }
}
