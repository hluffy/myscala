package matchcase

import scala.util.Random

/**
  * 匹配类型
  */
object MatchType {
    def main(args: Array[String]): Unit = {
        val arr = Array("abcd",100,3.14,true,new MatchTest)

        val element = arr(Random.nextInt(arr.length))

        println(element)

        element match{
            case str:String => println(s"match String $str")
            case int:Int => println(s"match Int $int")
            case bool:Boolean => println(s"match Boolean $bool")
            case matchTest:MatchTest => println(s"match MatchTest $matchTest")
            case _ => println(s"match nothing")

        }
    }

}

class MatchTest{

}
