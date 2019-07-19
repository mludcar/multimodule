object Launcher extends App with JsonReader {

  val reader = new FileReader("/Users/n294101/Development/gitPersonal/multiModule/testModule1/src/main/resources")

  val trial = reader.print
  val myString =
    """
      |{
      | "name": "Niño Melon",
      | "age": 18,
      | "padre": "Jese Rodriguez"
      |}
    """.stripMargin

  val newBoy = getFlowConfig[Person](myString)
  println(s"Nombre: ${newBoy.name} Edad: ${newBoy.age}")
  // println(reader.print)
}
