import java.io.{File, FileInputStream}

class FileReader(file: String) {

  def print = {
    val path = if (file.startsWith("/")) file else s"/$file"
    val newFile = new File(path)


    val files = recursiveListFiles(newFile).filter(_.isFile)

    val string = files.map(x => scala.io.Source.fromInputStream(new FileInputStream(x)).mkString)
    string.mkString(" ")
  }

  private def recursiveListFiles(f: File): Array[File] = {
    val files = f.listFiles
    files ++ files.filter(_.isDirectory).flatMap(recursiveListFiles)
  }

}
