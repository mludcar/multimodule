import java.io.{File, FileInputStream}

import org.json4s.{DefaultFormats, Formats}
import org.json4s.native.JsonMethods.parse


trait JsonReader {

  def getFlowConfig[T: Manifest](jsonString: String): T = {
    implicit val defaultFormat: Formats = DefaultFormats
    val json = parse(jsonString)
    json.extract[T]
  }
}
