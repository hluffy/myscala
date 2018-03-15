package objectorient

import scala.collection.mutable.ArrayBuffer

/**
  * 单例对象
  */
object Single {
    def main(args:Array[String]):Unit={
        val factory = SessionFactory
        println(factory.getSession)
        println(factory.getSession.size)
        println(factory.getSession(0))
        println(factory.removeSession)

        println(factory.getSession)
        println(factory.getSession.size)
        println(factory.getSession(0))
    }

}

object SessionFactory{
    /**
      * 相当于java中的静态块
      */
    println("SessionFactory被执行了")

    var i = 5

    private val session = new ArrayBuffer[Session]()

    while(i > 0){
        session += new Session
        i -= 1
    }

    def getSession = session

    def removeSession:Unit={
        val s = session(0)
        session.remove(0)
        println("session被移除"+s)
    }
}

class Session{

}
