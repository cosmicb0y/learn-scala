import scala.io.Source

class countchars1 extends App {
  if (args.length > 0) {

    for (line <- Source.fromFile(args(0)).getLines())
      println(line.length + " " + line)
  }
  else
    Console.err.println("Pleas enter filename")
}