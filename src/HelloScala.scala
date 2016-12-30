/**
  * Created by milko on 30/12/2016.
  */
object HelloScala extends scala.App {
  override def main(args: Array[String]): Unit = {
    // Hello
    println( "Hello World!\n" )

    // Show command arguments
    println( "Arguments: " + args.size )
//    for( arg <- args ) println( arg )
//    for {
//      arg <- args
//    } yield println( arg )
    println( (args.toList foldRight "") (_+"\n"+_) )
  }
}
