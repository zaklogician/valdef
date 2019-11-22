package example;

object Main {
  var time: Int = 0
  def setTime(i: Int): Unit = { time = i; println("\n-- time is " + i) }


  val valAppendTime: String => String = {
    val t = time
    (x: String) => x + t
  }

  lazy val lazyValAppendTime: String => String = {
    val t = time
    (x: String) => x + t
  }

  def def1AppendTime: String => String = {
    val t = time
    (x: String) => x + t
  }

  def def2FunAppendTime(x: String): String = {
    val t = time
    x + t
  }

  def def2LamAppendTime: String => String = (x: String) => {
    val t = time
    x + t
  }
  

  def main(args: Array[String]): Unit = {
    println("-- program started")
      
    setTime(1)
    println("-- setting f functions")
    val fVal: String => String = valAppendTime
    val fLazyVal: String => String = lazyValAppendTime
    val fDef1: String => String = def1AppendTime
    val fDef2F: String => String = def2FunAppendTime
    val fDef2L: String => String = def2LamAppendTime
    
    setTime(2)
    println( fVal("fVal:") )
    println( fLazyVal("fLazyVal:") )
    println( fDef1("fDef1:") )
    println( fDef2F("fDef2F:") )
    println( fDef2L("fDef2L:") )

    setTime(3)
    println( fVal("fVal:") )
    println( fLazyVal("fLazyVal:") )
    println( fDef1("fDef1:") )
    println( fDef2F("fDef2F:") )
    println( fDef2L("fDef2L:") )

    setTime(4)
    println("-- setting g functions")
    val gVal: String => String = valAppendTime
    val gLazyVal: String => String = lazyValAppendTime
    val gDef1: String => String = def1AppendTime
    val gDef2F: String => String = def2FunAppendTime
    val gDef2L: String => String = def2LamAppendTime

    setTime(5)
    println( fVal("fVal:") )
    println( fLazyVal("fLazyVal:") )
    println( fDef1("fDef1:") )
    println( fDef2F("fDef2F:") )
    println( fDef2L("fDef2L:") )
    println( gVal("gVal:") )
    println( gLazyVal("gLazyVal:") )
    println( gDef1("gDef1:") )
    println( gDef2F("gDef2F:") )
    println( gDef2L("gDef2L:") )

    setTime(6)
    println( fVal("fVal:") )
    println( fLazyVal("fLazyVal:") )
    println( fDef1("fDef1:") )
    println( fDef2F("fDef2F:") )
    println( fDef2L("fDef2L:") )
    println( gVal("gVal:") )
    println( gLazyVal("gLazyVal:") )
    println( gDef1("gDef1:") )
    println( gDef2F("gDef2F:") )
    println( gDef2L("gDef2L:") )
  }

}
