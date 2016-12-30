val args: Array[String] = Array("Uno", "Due", "Tre")

println(args.toList)
args.toList reduceLeft( _+"\n"+_ )
args.toList reduceRight( _+"\n"+_ )
(args.toList foldLeft ("\n")) (_+"\n"+_)
(args.toList foldRight "") (_+"\n"+_)
(List[String]() foldRight "\n") (_+"\n"+_)
