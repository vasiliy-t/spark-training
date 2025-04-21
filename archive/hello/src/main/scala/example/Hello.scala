package example

import org.apache.spark.SparkContext
import org.apache.spark.SparkConf

object Hello extends Greeting {
  def main(args: Array[String]) {
    val conf = new SparkConf().setAppName("Hello Spark app")
    val sc = new SparkContext(conf)
    println(greeting)
  }
}

trait Greeting {
  lazy val greeting: String = "hello"
}
