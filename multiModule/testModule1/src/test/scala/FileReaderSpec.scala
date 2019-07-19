import org.scalatest.{FlatSpec, Matchers}

class FileReaderSpec extends FlatSpec with Matchers{

  behavior of "FileReader"

  it should "get correct File" in {
    val expectedString = "Almendrero de Doraemon"

    val string = new FileReader("testModule1/src/test/resources/trial/myText.txt")

    string shouldEqual expectedString
  }
}
