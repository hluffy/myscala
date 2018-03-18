package matchcase

/**
  * 偏函数
  */
object PartialFunctionDemo {
    //String为参数类型，Int为返回值类型
    def m1: PartialFunction[String,Int] = {
        case "one" => {
            println("case 1")
            1
        }
        case "two" => {
            println("case 2")
            2
        }
    }

    def m2(num:String):Int = num match {
        case "one" => 1
        case "two" => 2
        case _ => 0
    }

    def main(args:Array[String]):Unit={
        println(m1("one"))
        println(m2("two"))
    }
}
