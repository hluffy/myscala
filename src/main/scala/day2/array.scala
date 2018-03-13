package day2

import scala.collection.mutable.ArrayBuffer

class array {

}

object array{
  def main(args:Array[String]):Unit={
    //    定长数组
    val arr1 = new Array[Int](8)
    println(arr1)
    for(i <- arr1) println(i)
    println(arr1.toBuffer)

    val arr2 = Array("java","scala","python")
    for(i <- arr2) println(i)

    println(arr2(0))

    //    变长数组
    val arr3 = ArrayBuffer[Int]()
    arr3 += 1
    arr3 += 2
    arr3 += (3,4,5)

    arr3 ++= Array(6,7,8)

    arr3 ++= ArrayBuffer(9,10)

    println(arr3.toBuffer)

//    添加元素
    arr3.insert(0, -1, 0)
    arr3.insert(0,-2)

    println(arr3.toBuffer)


    arr3.remove(0,2)
    println(arr3.toBuffer)

    val arr = Array(1,2,3,4,5,6,7,8,9)
    for(i<-arr) println(i)
    for(i <- 0 until arr.length) println(i,arr(i))
    for(i <- (0 until arr.length).reverse) println(i,arr(i))

    println("-----------------")
    val res = for(i <- arr) yield i*10
    println(res.toBuffer)

    println(res.sum)
    println(res.max)

    val arr4 = Array(4,5,3,1)
    println(arr4.sorted.toBuffer)
    println(arr4.toBuffer)

  }

}
