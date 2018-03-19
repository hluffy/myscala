package day4

object MyPredef {
    implicit def fileToRichFile(file:String) = new RichFile(file)

    implicit val selectGirl = (g:Girl) => new Ordered[Girl]{
        override def compare(that: Girl): Int = {
            if (g.faceValue == that.faceValue){
                that.age - g.age
            }else{
                g.faceValue - that.faceValue
            }
        }
    }

    implicit object OrderingGirl extends Ordering[Girl] {
        override def compare(x: Girl, y: Girl): Int = {
            if (x.faceValue == y.faceValue){
                y.age - x.age
            }else{
                x.faceValue - y.faceValue
            }
        }
    }
}


