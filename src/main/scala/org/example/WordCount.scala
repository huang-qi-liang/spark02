package org.example
import org.apache.spark.SparkConf
import org.apache.spark.rdd.RDD
object WordCount {
def main(args: Array[String]) : Unit={
  val conf=new SparkConf()
  conf.setAppName("Spark-WordCount")
  conf.setMaster("spark://centos01:7077")
}
}
