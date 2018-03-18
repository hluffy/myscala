package matchcase

/**
  * 匹配数组，元组，集合
  */
object MatchList {
    def main(args:Array[String]):Unit={
        //匹配数组
        val arr = Array(3,5,7,1)

        arr match{
            case Array(4, a, b, c) => println(s"case: $a,$b,$c")
            case Array(_, x, y, z) => println(s"case $x,$y")
            case _ => println("match nothing")
        }


        //匹配元组
        val tup = (2,3,4)

        tup match{
            case (3,a,b) => println(s"case $a,$b")
            case (2,a,b) => println(s"case $a,$b")
            case _ => println("match nothing")
        }


        //匹配集合
        val list1 = List(0,1,2,3)

        list1 match {
            case 0 :: Nil => println("case1: 0")
            case a :: b :: c :: d :: Nil => println(s"case2: $a,$b,$c,$d")
            //case List(0,a,b,c) => println(s"case2: $a,$b,$c")
            case 0 :: a => println(s"case3: $a")
            case _ => println("Match nothing")
        }

        println(Nil)
    }

}
