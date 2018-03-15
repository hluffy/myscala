package objectorient

/**
  * apply()和unapply()
  * @param name
  * @param age
  * @param faceValue
  */
class ApplyDemo(val name:String, var age:Int, var faceValue:Int) {

}

object ApplyDemo{
    def apply(name:String,age:Int,faceValue:Int):ApplyDemo = {
        new ApplyDemo(name,age,faceValue)
    }

    def unapply(applyDemo: ApplyDemo): Option[(String, Int, Int)] = {
        if (applyDemo == null){
            None
        }else{
            Some(applyDemo.name,applyDemo.age,applyDemo.faceValue)
        }

    }
}

object test2{
    def main(args: Array[String]): Unit = {
        val applyDemo = ApplyDemo("han",18,1)
        println(applyDemo.age)

        applyDemo match {
            case ApplyDemo("han",age,faceValue) => println(s"age: $age,faceValue: $faceValue")
            case _ => println("No match nothing")
        }
    }
}