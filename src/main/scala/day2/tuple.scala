package day2

class tuple {

}

object tuple{
  def main(args:Array[String]):Unit={
    val t = ("scala",1,"spark",(1,2))
    println(t)

    println(t._1)
    println(t._4._1)

    val arr = Array(("scala",1),("java",2),("python",3))
    println(arr.toMap)

    val arr1 = Array("scala","java","spark")
    val arr2 = Array(1,2,3)
    val arr3 = arr1 zip arr2
    println(arr3.toMap)
  }
}
