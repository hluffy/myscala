package day4

//object ImplicitContext{
//    implicit object OrderingGirl extends Ordering[Girl]{
//        override def compare(x: Girl, y: Girl): Int = if (x.faceValue > y.faceValue) 1 else -1
//    }
//}

//class Girl(val name:String,var faceValue:Int){
//    override def toString: String = name + " : " + faceValue
//}

//class Goddess[T:Ordering](val v1:T,val v2:T){
//    def choose ()(implicit ord:Ordering[T]) = if(ord.gt(v1,v2)) v1 else v2
//}

object Goddess {
//    def main(args: Array[String]): Unit = {
//        import ImplicitContext.OrderingGirl

//        val g1 = new Girl("han",14)
//        val g2 = new Girl("ll",15)
//
//        val godess = new Goddess(g1,g2)
//
//        val res = godess.choose
//        println(res)
//    }

}