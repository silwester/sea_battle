fun main() {
    var myField = Array(10) { Array(10) { 0 } }
    var pcField = Array(10) { Array(10) { 0 } }
    var number1 = 1
    val letterArray = charArrayOf('А', 'Б', 'В', 'Г', 'Д', 'Е', 'Ж', 'З', 'И', 'К')

    topLine(letterArray)

    for (i in myField) {

        if(number1 < 10) {
            print("${number1++} |")
        } else {
            print("$number1|")
        }

        print(" ")
        for (j in i) {

            print("$j ")
        }
        println()



    }







}

fun topLine(letterArray: CharArray) {
    print("    ")
    print(letterArray[0])
    print(" ")
    print(letterArray[1])
    print(" ")
    print(letterArray[2])
    print(" ")
    print(letterArray[3])
    print(" ")
    print(letterArray[4])
    print(" ")
    print(letterArray[5])
    print(" ")
    print(letterArray[6])
    print(" ")
    print(letterArray[7])
    print(" ")
    print(letterArray[8])
    print(" ")
    print(letterArray[9])
    println()
}