package day2

class map {

}

object map{
  def main(args:Array[String]):Unit={
    val map1 = Map("scala" -> 1, "java" -> 2, "python" -> 3)
    println(map1)

    val map2 = Map(("scala",1),("java",2),("python",3))
    println(map2)

    println(map1("scala"))

    //map1("scala") = 4报错

    import scala.collection.mutable._
    val map3 = Map("scala" -> 1,"java" -> 2,"python" -> 3)

    map3("scala") = 4
    println(map3)

    val value = map3.getOrElse("C#",-1)
    println(value)


  }
}
