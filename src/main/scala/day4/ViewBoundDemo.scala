package day4

/**
  * [B <% A] ViewBound
  */
class ViewBoundDemo[T <% Ordered[T]] {
    def select(first:T,second:T):T={
        if (first > second) first else second
    }
}

object ViewBoundDemo{
    def main(args: Array[String]): Unit = {

        import MyPredef.selectGirl

        val viewBoundDemo = new ViewBoundDemo[Girl]

        val g1 = new Girl("han",11,33)
        val g2 = new Girl("ll",12,33)

        val girl = viewBoundDemo.select(g1,g2)
        println(girl)
    }
}
