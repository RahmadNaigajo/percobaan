import java.io.File
import java.io.BufferedReader

fun main(args: Array<String>) {
    val bufferedReader: BufferedReader = File("/inst/extdata/raw/p1_DipolDipol_SW-NE.dat").bufferedReader()
    val inputString = bufferedReader.use { it.readText() }
    println(inputString)
}