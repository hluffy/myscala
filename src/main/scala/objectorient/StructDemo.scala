package objectorient

/**
  * 构造器
  * 主构造器的参数列表必须放在类名的后面
  * val构造的参数具有不可变性
  * val修饰的构造参数就有可变性
  */
class StructDemo(val name:String,var age:Int,faceValue:Int = 90) {
    var gender:String = _

    def getFaceValue():Int = {
//        faceValue = 100    该值时不可修改的，默认时val修饰的
        faceValue
    }

    //辅助构造器
    def this(name:String,age:Int,faceValue:Int,gender:String){
        this(name,age,faceValue) //辅助构造器第一行必须先调用主构造器
        this.gender = gender
    }


}

object StructDemo{
    def main(args:Array[String]):Unit={
        val s = new StructDemo("han",18,1)
        val s1 = new StructDemo("han",12)

        println(s.name)
        println(s.age)
        println(s1.getFaceValue())
        println(s.getFaceValue())
//        println(s.faceValue)


        val s2 = new StructDemo("han",12,22,"男")
        println(s2.gender)
    }
}
