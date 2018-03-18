package matchcase

/**
  * 柯里化
  */
//object Context{
//    implicit val a = "java"
//    implicit val b = "python"
//}

object CurryingDemo {
    def m1(str:String)(implicit name:String) ={
        str+" "+name
    }

    def main(args:Array[String]):Unit={
//        m1("Hi~")
//        val func = m1("Hi~") _
//        println(func)

//        import Context.b

        import matchcase.Context.b
        println(m1("Hi~"))

    }

}
