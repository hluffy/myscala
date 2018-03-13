package day2

/**
  * lazy关键字，修饰变量，称为惰性变量，会实现延时加载
  * 惰性变量只能是不可变变量
  * 只有在调用的时候才会去实例化
  */
class scalalazy {

}

object scalalazy{
  def init():Unit={
    println("call init()!")
  }

  def main(args:Array[String]):Unit={
    // 没有用lazy关键字修饰
    val property1 = init()
    println("after init()")
    println(property1)


    //  使用lazy关键字修饰
    println("----------------------")
    lazy val property2 = init()
    println("after init()")
    println(property2)

  }
}
