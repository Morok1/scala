object Reader extends Readable {
  override def read() = {
    println("Hello")
  }

  def main(args: Array[String]): Unit = {
    read()
  }
}
