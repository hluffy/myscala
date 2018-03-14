package objectorient

/**
  * 面向对象
  * 声明类时不需要加public关键字
  * 默认时public
  * 一个类文件可以声明多个类
  */
class Person {
  //用val修饰的变量时只读的，相当于只有get方法，没有set方法
  val id : String = "100"

  //用var修饰的变量，相当于既有get方法，又有set方法
  var name : String = _

  //用private修饰的属性，该属性属于对象私有变量，只有本类和伴生对象中才可以访问
  private var age : Int = _

  //用private[this]修饰的属性，该属性属于对象私有变量，只有本类才可以访问，伴生对象也不可以访问
  private[this] val gender : String = "男"


}

object Person{
  def main(args: Array[String]): Unit = {
    val p = new Person

    //用val修饰的属性不可以修改
//    p.id = "123"
    println(p.id)

    println(p.name)
    println(p.age)

    p.name = "han"
    p.age = 18
    println(p.name,p.age)
  }
}

object Test{

}
