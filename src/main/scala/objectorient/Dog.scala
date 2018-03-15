package objectorient

/**
  * 伴生对象
  * 类和其伴生对象之间可以相互访问私有属性和方法
  */
class Dog {
    private var name : String = "二哈"

    def printName() : Unit = {
        //在dog类中访问其伴生对象私有属性
        println(Dog.CONSTANT +":"+ name)
    }

}

object Dog {
    private val CONSTANT = "汪汪汪"

    def main(args:Array[String]):Unit={
        val dog = new Dog
        println(dog.name)

        dog.name = "旺财"
        dog.printName()
    }

}
