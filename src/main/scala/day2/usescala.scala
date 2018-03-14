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

    //将Iterator转换成list
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

    //并行计算求和
    val arr = Array(1,2,3,4,5,6,7,8,9,10)

//    val res = arr.sum
    //并行执行，和线程有关，每个线程计算一部分
//    val res = arr.par.sum
//    println(res)

    //按照特定的顺序进行聚合
//    val res = arr.reduce(_ + _)

    //并行执行
    val res = arr.par.reduce(_ + _)
    println(res)

    //折叠，有初始值，无特定顺序
    val res1 = arr.par.fold(10)(_ + _)
    println(res1)

    //折叠，有初始值，有特定顺序
//    val res2 = arr.fold(10)(_ + _)
    val res2 = arr.foldLeft(10)(_ + _)
    println(res2)

    //聚合
    val list7 = List(List(1,2,3),List(3,4,5),List(2),List(0))
//    val res3 = list7.flatten.reduce(_ + _)
    val res3 = list7.aggregate(0)(_+_.sum,_+_)
    println(res3)

    val l1 = List(5,6,4,7)
    val l2 = List(1,2,3,4)

    //求并集
    val res4 = l1 union l2
    println(res4)

    //求交集
    val res5 = l1 intersect l2
    println(res5)

    //求差集
    val res6 = l1 diff l2
    println(res6)
    println(l2 diff l1)

  }
}
