package subtask1

class Combinator {

    fun checkChooseFromArray(array: Array<Int>): Int? {
        val m:Long = array[0].toLong()
        val n = array[1].toLong()
        var f_n:Long = factor(n)
        for(i:Long in 1..m) {
            if(n - i <= 0)
                return null
            if(m == f_n/(factor(n - i) * factor(i))) {
                val result = i.toInt()
                return result
            }
        }
        return null
    }

    fun factor(numb: Long): Long{
        var result:Long = 1
        for (i in 1..numb){
           result *= i
        }
        return result
    }
}
