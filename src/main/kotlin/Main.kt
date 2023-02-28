import java.util.*

fun main(){
    print("Please enter the number of the day you want from 1 to 7 :")
    val  Day = readln()!!.toInt()

       when (Day) {
       1 -> {
         println("saturday")
           saturday()
      }

      2 -> {
           println("Sunday")
          Sunday_Monday()
      }

        3 -> {
            println("Monday")
            Sunday_Monday()
        }

       4 -> println("Tuesday")

       5 -> {
            println("Wednesday")
           Wednesday()
        }

        6 -> {
           println("Thursday")
           Thursday()
        }

        7 -> {
            println("Friday")
           friday()
        }
   }



    }
    fun saturday(){
        var row = 0
        while (row <= 6) {
            if (row == 2)
            {
                println()
                row++
            }
            for (columns in 6 - row downTo 1)
            {
                print(" ")
            }
            for (s in 1..row + (row - 1))
            {
                print("*")
            }
            println()
            row++
        }
    }
fun Sunday_Monday() {
    print("Enter the size of array = ")
    val size = readln()!!.toInt()
    println("Enter the elements of the array one by one ")
    val array = IntArray(size)
    for (i in 0 until size) {
        array[i] = readln()!!.toInt()
    }
    val length = array.size
    var sum = 0
    for (i in array.indices) {
        sum += array[i]
    }
    val average = sum / length
    println("Average of array : $average")
}
fun Wednesday() {
    print("Enter 2D array size : ")
    val rows = readln()!!.toInt()
    val columns = readln()!!.toInt()
    println("Enter array elements : ")
    val twoD = Array(rows) { IntArray(columns) }
    for (i in 0 until rows) {
        for (j in 0 until columns) {
            twoD[i][j] =readln()!!.toInt()
        }
    }
    println(
        "Array you entered"
    )
    for (x in twoD) {
        for (y in x) {
            print("$y    ")
        }
        println()
    }
}

fun Thursday() {
    val array = intArrayOf(1, 2, 3, 4)
    add5(array)
    for (i in array.indices) {
        println("Numbers = " + array[i])
    }
}
fun add5(array: IntArray) {
    for (i in array.indices) {
        array[i] += 5
    }
}
fun friday() {
    fr(5)
    fr(2.0f)
    fr("y")
}

fun fr(n: Int) {
    for (i in 0 until n step 1)  {
        println("OOP")
    }
}
fun fr(x: Float) {
    val y = x * 3
    println(+y)
}
fun fr(F: String) {
    println("Hello $F")
}











































