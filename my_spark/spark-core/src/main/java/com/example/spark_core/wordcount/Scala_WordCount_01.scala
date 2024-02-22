package com.example.spark_core.wordcount

import org.apache.spark.{SparkConf, SparkContext}

object Scala_WordCount_01 {

  // TODO: Spark框架
  def main(args: Array[String]): Unit = {
    //  建立和Spark框架的连接
    val sparkConf = new SparkConf().setMaster("local").setAppName("WordCount")
    val sparkContext = new SparkContext(sparkConf)

    //  执行业务操作

    //  关闭连接
    sparkContext.stop()

  }
}
