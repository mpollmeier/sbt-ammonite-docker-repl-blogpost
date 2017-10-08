package tutorial

object cpg {
  def classes = Classes(List("ClassA", "ClassB"))
}

case class Classes(values: List[String]) {
  def methods = Methods(List("methodA", "methodB"))
}

case class Methods(values: List[String]) {
  def arguments = Arguments(List("argumentA: Integer", "argumentB: String"))
}

case class Arguments(values: List[String])
