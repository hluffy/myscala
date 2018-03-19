package day4

import scala.io.Source

class RichFile(val file: String) {
    def read():String = {
        Source.fromFile(file).mkString
    }

}

object RichFile {
    def main(args:Array[String]):Unit={

        //显式调用
//        val file = "/Users/rikka/data.csv"
//        val str = new RichFile(file).read()
//
//        println(str)


//        隐式转换
        import day4.MyPredef.fileToRichFile
        val file = "/Users/rikka/data.csv"
        val content = file.read()

        println(content)
    }
}
