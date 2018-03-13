package day2

object usescala {
  def main(args:Array[String]):Unit={
    //创建一个list
    val list0 = List(3,4,5,1,9,6,2,8,7)
    println(list0)

    //境list中每个元素乘以2生成一个新的集合
    val list1 = list0.map(_ * 2)
    println(list1)

    //将list中的偶数取出来生成一个新的集合
    val list2 = list0.filter(_ % 2 == 0)
    println(list2)

    //将list排序后生成一个新的集合
    val list3 = list0.sorted
    println(list3)

    //反转排序顺序
    val list4 = list3.reverse
    println(list4)

    //将list中的元素4个一组，类型为Iterator[List[Int]]
    val it = list0.grouped(4)
//    println(it.toBuffer)

    //境Iterator转换成list
    val list5 = it.toList
    println(list5.toBuffer)

    //将多个list压扁成一个list
    val list6 = list5.flatten
    println(list6)

    val lines = List("hello java hello scala","hello scala hello python","hello python")
    //先按空格切分，在压平
    val words = lines.map(_.split(" "))
    val flatWords = words.flatten
    println(flatWords)

    val result = lines.flatMap(_.split(" "))
    println(result)


  }
}
