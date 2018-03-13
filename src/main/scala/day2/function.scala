package day2


class function {

}

object function{
  def main(args:Array[String]): Unit ={
    val x = sum(1,2)
    println(x)


    //  定义函数
    val m = (x:Int,y:Int) => x + y
    println(m(2,3))

    val f = m2(m)
    println(f)


  //    将方法转化为函数
    val f3 = m3 _
    println(f3(3,4))

    println(m2(f3))
    println(m2(m3))

  }

  //  定义方法
  def sum(x:Int,y:Int):Int= x + y


  def m2(f: (Int,Int) => Int) = f(3,4)

  def m3(x:Int,y:Int):Int = x + y


}
