package day4

object MyPredef {
    implicit def fileToRichFile(file:String) = new RichFile(file)
}


