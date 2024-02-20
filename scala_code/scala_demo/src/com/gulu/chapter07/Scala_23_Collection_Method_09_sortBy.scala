package com.gulu.chapter07

/**
 * @author chocolate
 *         2024/2/6 16:33
 */
object Scala_23_Collection_Method_09_sortBy {

  // TODO: sortBy 按照标记，对数据进行排序，默认升序
  def main(args: Array[String]): Unit = {
    val list = List(4, 3, 1, 2)

    // 将返回值作为参数的标记，根据标记排序，默认升序
    val list1 = list.sortBy(num => num)
    println(list1)

    // todo 想要降序，需要传递第二个参数（参数柯理化）
    val list2 = list.sortBy(num => num)(Ordering.Int.reverse)
    println(list2)

    val user1 = new User
    user1.age = 10
    user1.money = 100
    val user2 = new User
    user2.age = 10
    user2.money = 1000
    val user3 = new User
    user3.age = 1
    user3.money = 999
    val user4 = new User
    user4.age = 1
    user4.money = 10

    // TODO: sortWith 先按照年龄排序，年龄相同的按金钱排序
    //  sortWith方法需要传递一个函数，函数类型为 (object,object) : Boolean
    //  返回值为true表示预计结果，非预期结果为false
    val users = List(user1, user2, user3, user4)
    val newUsers = users.sortWith((u1, u2) => {
      if (u1.age < u2.age) {
        true
      } else if (u1.age == u2.age) {
        u1.money > u2.money
      } else {
        false
      }
    })
    println(newUsers)

    // TODO: 如果需要按照第一个数据排序，数据相同再按照第二个数据排序，第二个数据相同再按照第三个数据排序，以此类推
    //  可以采用特殊的排序：Tuple排序
    val users1 = users.sortBy(u => {
      (u.age, u.money)
    }) // 根据age和money升序
    println(users1)

    val users2 = users.sortBy(u => {
      (u.age, u.money)
    })(Ordering.Tuple2(Ordering.Int, Ordering.Int.reverse)) // 指定age升序，money降序

    println(users2)
  }

  class User {
    var age: Int = _
    var money: Int = _

    // 重写toString
    override def toString: String = {
      s"User[$age,$money]"
    }
  }

}
