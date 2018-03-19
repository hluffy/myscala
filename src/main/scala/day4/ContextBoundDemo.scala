package day4

/**
  * [B : A] ContextBound
  * @param ev$1
  * @tparam T
  */
class ContextBoundDemo[T:Ordering] {
    def select(first:T,second:T):T = {
        val ord:Ordering[T] = implicitly[Ordering[T]]
        if (ord.gt(first,second)) first else second
    }

}

object ContextBoundDemo {
    def main(args: Array[String]): Unit = {
        import MyPredef.OrderingGirl

        val contextBoundDemo = new ContextBoundDemo[Girl]

        val g1 = new Girl("han",12,33)
        val g2 = new Girl("ll",13,33)

        val girl = contextBoundDemo.select(g1,g2)
        println(girl)
    }
}
