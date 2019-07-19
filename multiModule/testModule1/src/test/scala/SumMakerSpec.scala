import java.io.File

import org.scalatest.{FlatSpec, Matchers}

class SumMakerSpec extends FlatSpec with Matchers{

  behavior of "SumMaker"

  it should "get correct sum from parameters" in {
    val sum = (new SumMaker(2, 3)).c
    val expectedSum = 5
    val whereIAm = new File(".").getCanonicalPath()
    println(whereIAm)

    expectedSum shouldEqual sum
  }

}
