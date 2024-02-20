package com.gulu.chapter07

/**
 * @author chocolate
 *         2024/2/5 23:31
 */
object Scala_06_Collection_Seq {

  // TODO: Seq有序可重复（有序是插入顺序），不可变
  //  seq是一个trait，无法直接构建对象
  def main(args: Array[String]): Unit = {
    // seq是一个trait，无法直接构建对象，一般使用伴生对象的apply方法，底层是list集合
    val seq1: Seq[Int] = Seq.apply(1, 2, 3, 4)
    val seq2: Seq[Int] = Seq.apply(1, 2, 3, 4)
    val list1: List[Int] = List.apply(1, 2, 3, 4)
    val list2: List[Int] = List(1, 2, 3, 4)


    // TODO: Seq与List默认是不可变的，所以常用的数据方法都是特殊符号
    //  默认情况下，不可变集合的数据操作，都会产生新的集合
    val seq3 = seq1 :+ 5 // seq1.+:(5)冒号在的那边·放前面
    val seq4 = 5 +: seq1 // seq1.:+(5)

    println(seq3, seq4)

    // 修改后产生新的集合
    val newSeq = seq3.updated(0, 11)
    println(newSeq)

    // 查询
    println(newSeq.head) // newSeq(0)

    // TODO 使用不同的方式构建集合
    // ::表示向集合中添加数据，:::表示将容器中的数据添加到集合中
    // 直接使用List()，表示空集合，Nil也可以表示空集合
    val list3 = 1 :: 2 :: 3 :: List() // 结果为123
    val list4 = 1 :: 2 :: 3 :: Nil
    val list5 = List().::(3).::(2).::(1) // 使用集合.方法的时候，冒号在的一边放前面

    val r1= list3 :: list4 // list3整个元素放入list4，r1类型声明为List[Int]会报错
    val r2 = list3 ::: list4 // list容器中的元素放入list4
    println(r1, r2)
  }

}
