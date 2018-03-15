package objectorient

/**
  * 特质，抽象类，继承，重写，实现
  */
object ClassDemo {
    def main(args:Array[String]):Unit={
        val h = new Human
        println(h.name)
        println(h.fight)
        h.fly

    }
}

/**
  * 特质
  */

trait Flyable{
    //声明一个没有值的字段
    val distance : Int

    //声明一个没有实现的方法
    def fight:String

    //声明一个有实现的方法
    def fly:Unit = {
        println("I can fly")
    }
}

/**
  * 抽象类
  */

abstract class Animal{
    //声明一个没有赋值的字段
    val name:String

    //声明一个没有实现的方法
    def run:String

    //声明一个有实现的方法
    def climb : String = {
        "I can climb"
    }
}

class Human extends Animal with Flyable {
    //重写没有实现的方法
    override val name: String = "张三"

    override def run: String = "I can run"

    override val distance: Int = 1000

    override def fight: String = "with 棒子"


    //重写已经实现的方法
    override def climb: String = "override climb"
}
