package objectorient

/**
  * private关键字
  * 类名前加private[包名]官架子是指包访问权限
  * 构造器前加private时值伴生对象的权限，只有伴生对象才可以访问
  */
private[objectorient] class PrivateDemo private(val gender:Int,var faceValue:Int) {
    private val name:String = "han"

    private[this] var age : Int = 18

    private def sayHello = {
        println(s"han age is $age")
    }

}

object PrivateDemo{
    def main(args: Array[String]): Unit = {
        val p = new PrivateDemo(1,1)
        p.sayHello
    }
}

object test3{
    def main(args: Array[String]): Unit = {
        //运行会报错
//        val p = new PrivateDemo(1,2)
//        println(p.gender)
//        println(p.faceValue)
    }
}
