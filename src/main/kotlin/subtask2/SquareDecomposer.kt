package subtask2
import kotlin.math.sqrt

class SquareDecomposer {

    fun decomposeNumber(number: Int): Array<Int>? {
        if (number < 5)
            return null

        var sqr_numb = sqr(number.toLong())

        var tempList = mutableListOf<Int>()

        var temp: Long = sqr_numb - sqr(number.toLong() - 1)
        tempList.add(number - 1)

        do {
            var res = sqrt(temp.toDouble()).toInt()
            tempList.add(res)
            temp -= sqr(res.toLong())
        } while (temp > 0)

        tempList.reverse()
        return tempList.toTypedArray()
    }

    fun sqr(x: Long): Long = x * x
}
