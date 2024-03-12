fun main() {
    var myField = Array(10) { Array(10) { 0 } }
    var pcField = Array(10) { Array(10) { 0 } }
    var number1 = 1
    val letterArray = charArrayOf('А', 'Б', 'В', 'Г', 'Д', 'Е', 'Ж', 'З', 'И', 'К')

    topLine(letterArray)

    for (row in myField) {

        if (number1 < 10) {
            print("${number1++} |")
        } else {
            print("$number1|")
        }

        print(" ")
        for (line in row) {

            print("$line ")
        }
        println()

    }


//while ()

    var random1_1 = (0..9).random()
    var random1_2 = (0..9).random()

    if (myField[random1_1 - 1][random1_2 - 1] == 0) {
        if (myField[random1_1 - 1][random1_2] == 0) {
            if (myField[random1_1 - 1][random1_2 + 1] == 0) {
                if (myField[random1_1][random1_2 + 1] == 0) {
                    if (myField[random1_1 + 1][random1_2 + 1] == 0) {
                        if (myField[random1_1 + 1][random1_2] == 0) {
                            if (myField[random1_1 + 1][random1_2 - 1] == 0) {
                                if (myField[random1_1][random1_2 - 1] == 0) {

//                                } else continue
//                            }
                                }
                            }
                        }
                    }
                }
            }


            myField[random1_1][random1_2] = 1

        }
    }
}

fun getRandomA(): Int {
    var a = (0..9).random()
    return a
}

fun getRandomB(): Int {
    var b = (0..9).random()
    return b
}

fun topLine(letterArray: CharArray) {
    var number0 = 0
    print("    ")
    for (i in letterArray) {
        print(letterArray[number0++])
        print(" ")
    }
    println()
}
//    print(letterArray[1])
//    print(" ")
//    print(letterArray[2])
//    print(" ")
//    print(letterArray[3])
//    print(" ")
//    print(letterArray[4])
//    print(" ")
//    print(letterArray[5])
//    print(" ")
//    print(letterArray[6])
//    print(" ")
//    print(letterArray[7])
//    print(" ")
//    print(letterArray[8])
//    print(" ")
//    print(letterArray[9])
//    println()
//}