package day2

/**
  * for循环
  */
class dayfor {

}

object dayfor{
  def main(args: Array[String]): Unit = {
//    println(1 to 10)
//    println(1 until 10)
//
//    for(i <- 1 to 10){
//      println(i)
//    }
//
//    for(i <- 1 until 10){
//      println(i)
//    }

    var arr = Array("java","scala","python")
    for(i <- arr) println(i)

//    双层for循环
    for(i <- 1 to 3;j <- 1 to 3 if(i!=j)) println(i,j)

    val res = for(i <- 1 to 10) yield i
    println(res)

  }
}
