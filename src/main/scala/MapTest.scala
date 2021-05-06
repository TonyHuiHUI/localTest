import java.nio.charset.StandardCharsets

import scala.collection.mutable.ListBuffer
import scala.util.matching.Regex
import wangzx.scala_commons.sql._

/**
  * @author hui
  *         2019/7/5 0005 10:14 
  **/
object MapTest {

  def main(args: Array[String]): Unit = {
    /*    val str = "Channel\u8fde\u63a5\u5173\u95ed:[id: 0x8ae80647, L:/172.22.0.3:9096 ! R:/172.22.0.1:37440],"
        println(new String(str.getBytes("UTF-8")))*/




//    val condition = if (true) {
//      sql"current_id = current_id + 1, updated_at = now() "
//    } else {
//      sql" current_id = min_id "
//    } + sql" where rule_code = 1"
//
//    println(condition)


//    val reg = "[A-Z]".r
//    val str = "locaLTest"
//
//    val strReg = reg.replaceAllIn(str, m => m.matched match {
//      case x => "_" + x.toLowerCase
//    })
//
//    println(strReg)
//
//
//    Option.apply(new Test) match {
//      case Some(x) if x.a == 1 => println("11111 " + x.a)
//      case Some(x) => println(x.b)
//      case _ => Unit
//    }
//
//    var temp = genIdByBatch(1010, 1000).to[ListBuffer]
//
//    println("temp size :" + temp.size)
//
//    while (temp.nonEmpty) {
//      val id = temp.head
//      println("--------" + id)
//      temp -= id
//    }


  }

  def genIdByBatch(step: Long, limit: Long, temp: List[Long] = List.empty): List[Long] = {
    println(" step: " + step + " limit: " + limit)
    if (step - limit > 0) {
      val firstId = 1L
      val lastId = firstId + limit - 1L
      genIdByBatch(step - limit, limit, temp ::: firstId.to(lastId).toList)
    } else {
      val firstId = 1001L
      val lastId = firstId + step - 1L
      temp ::: firstId.to(lastId).toList
    }
  }

  class Test {
    val a = 2
    val b = 3
  }


}
