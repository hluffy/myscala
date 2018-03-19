package day4

/**
  * 范型，上界，UpperBound
  */
class UpperBoundDemo[T <: Comparable[T]] {
    def select(first: T,second: T):T = {
        if (first.compareTo(second) > 0) first else second
    }

}

object UpperBoundDemo {
    def main(args: Array[String]): Unit = {
        val u = new UpperBoundDemo[Godess]

        val g1 = new Godess("han",33)
        val g2 = new Godess("ll",22)

        val godess = u.select(g1,g2)
        println(godess)

    }
}

class Godess(val name:String, var faceValue:Int) extends Comparable[Godess]{
    override def compareTo(o: Godess): Int = {
        this.faceValue - o.faceValue
    }

    override def toString: String = name+" : "+faceValue
}
