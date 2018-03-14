package day3

/**
  * 使用scala实现wordcount
  */
object wordcount {
  def main(args:Array[String]):Unit={
    val lines = List("hello java hello python","hello python","hello scala hello python")

    //切分并压平
    val words = lines.flatMap(_.split(" "))
    println(words)
//    List(hello, java, hello, python, hello, python, hello, scala, hello, python)

    //把每个单词生成一个一个tuple
    val tuples = words.map((_,1))
    println(tuples)
//    List((hello,1), (java,1), (hello,1), (python,1), (hello,1), (python,1), (hello,1), (scala,1), (hello,1), (python,1))

    //根据key进行分组
    val grouped = tuples.groupBy(_._1)
    println(grouped)
//    Map(scala -> List((scala,1)), java -> List((java,1)), hello -> List((hello,1), (hello,1), (hello,1), (hello,1), (hello,1)), python -> List((python,1), (python,1), (python,1)))

    //统计
    val sumed = grouped.mapValues(_.size)
    println(sumed)

    //排序
    val sorted = sumed.toList.sortBy(_._2)
    println(sorted)

    //反转，降序排列
    val res = sorted.reverse
    println(res)

    for(i <- 0 until res.size){
      println(res(i)._1+":"+res(i)._2)
    }
  }

}
