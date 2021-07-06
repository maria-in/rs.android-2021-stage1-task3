package subtask3

import java.util.*
import kotlin.collections.ArrayList

class TelephoneFinder {

    // TODO: Complete the following function
    fun findAllNumbersFromGivenNumber(number: String): Array<String>? {
        if(number.toInt() < 0)
            return null
        var numbers: MutableList<String> = mutableListOf()
        val number_array: ArrayList<Array<Char>> =
            arrayListOf(
                arrayOf('8'),
                arrayOf('2', '4'),
                arrayOf('1', '5', '3'),
                arrayOf('2', '6'),
                arrayOf('1', '5', '7'),
                arrayOf('2', '4', '6', '8'),
                arrayOf('3', '5', '9'),
                arrayOf('4', '8'),
                arrayOf('7', '5', '9', '0'),
                arrayOf('6', '8')
            )

        for(i in 0..number.length-1){
            var temp:MutableList<Char> = mutableListOf()
            for(i in 0..number.length-1)
                temp.add(number.get(i))
            val k: Int = number[i].toString().toInt()
            for (j in 0..number_array[k].size-1){
                temp[i] = number_array[k][j]
                val str = temp.toString()
                numbers.add(str)
            }
        }

        for (i in 0..numbers.size-1){
            numbers[i] = numbers[i].replace(", ", "")
        }

        var answer: Array<String> = Array(numbers.size, {i -> " "})
        for (i in 0..numbers.size-1) {
            answer.set(i, numbers[i].substring(1, numbers[i].length - 1))
        }
        return answer
    }
}
