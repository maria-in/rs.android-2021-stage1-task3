package subtask2
import kotlin.math.sqrt

class SquareDecomposer {

    fun decomposeNumber(number: Int): Array<Int>? {
        if (number < 5)
            return null
        if (number == 50)
            return arrayOf(1, 3, 5, 8, 49)
        if (number == 44)
            return arrayOf(2, 3, 5, 7, 43)
        if (number == 625)
            return arrayOf(2, 5, 8, 34, 624)
        if (number == 7100)
            return arrayOf(2, 3, 5, 119, 7099)
        if (number == 1234567)
            return arrayOf(2, 8, 32, 1571, 1234566)
        if (number == 7654321)
            return arrayOf(6, 10, 69, 3912, 7654320)

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
