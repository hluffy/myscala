package matchcase

import scala.util.Random

/**
  * 匹配字符串
  */
object MatchStr{
    def main(args:Array[String]):Unit={
        val arr = Array("张三","李四","王五","赵六")

        val name = arr(Random.nextInt(arr.length))

        println(name)

        name match{
            case "张三" => println("张三")
            case "李四" => println("李四")
            case "王五" => println("王五")
            case "赵六" => println("赵六")
            case _ => println("李狗蛋")
        }
    }
}
