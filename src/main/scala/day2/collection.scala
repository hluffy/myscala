package day2

import scala.collection.mutable
import scala.collection.mutable.ListBuffer

class collection {

}

object collection{
  def main(args:Array[String]):Unit={
//    list
    val list1 = List(1,2,3)
    val list2 = 0::list1
    println(list2)

    val list3 = list1 .:: (0)
    println(list3)

    val list4 = List(4,5,6)

    val list5 = list1 ++ list4
    println(list5)

    val list6 = list4 ::: list1
    println(list6)


    val lb1 = ListBuffer(1,2,3)
    lb1 += 4
    println(lb1)

    lb1.append(5,6)
    println(lb1)


    val lb2 = ListBuffer(1,2,3)
    val list7 = List(4,5)
    val lb3 = lb2 ++= list7
    println(lb3)


    println("-----------------------")

//    set
    val set1 = new mutable.HashSet[Int]()
    val set2 = set1 + 1
    println(set2)

    val set3 = Set(2,3,4,5,6)
    val set4 = set2 ++ set3
    println(set4)
    set4.add(7)
    println(set4)

    println(set4 -= 1)


    println("-------------------")
//    map
    val map1 = new mutable.HashMap[String,Int]()
    map1("scala") = 1
    map1 += (("java",2),("python",3))
    println(map1)

    map1 -= "java"
    println(map1)

    map1.remove("python")
    println(map1)

  }
}
