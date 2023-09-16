import kotlin.math.sqrt

// task_12

fun isLeapYear(year: Int): Boolean {
    return year % 400 == 0 || year % 4 == 0 && year % 100 != 0
}

// task_13

fun countEmployees(vararg names: String): Int {
    return names.size
}

// task_14

fun getEmployeeInfo(fullName: String, position: String) {
    println("ФИО: $fullName")
    println("Возраст: неизвестен")
    println("Должность: $position")
    println("Семейное положение: неизвестно")
}

fun getEmployeeInfo(fullName: String, age: Int, position: String) {
    println("ФИО: $fullName")
    println("Возраст: $age")
    println("Должность: $position")
    println("Семейное положение: неизвестно")
}

fun getEmployeeInfo(fullName: String, familyStatus: String, position: String) {
    println("ФИО: $fullName")
    println("Возраст: неизвестен")
    println("Должность: $position")
    println("Семейное положение: $familyStatus")
}

fun getEmployeeInfo(fullName: String, age: Int, position: String, familyStatus: String) {
    println("ФИО: $fullName")
    println("Возраст: $age")
    println("Должность: $position")
    println("Семейное положение: $familyStatus")
}

// task_15

val showArray = { arr: Array<String> ->
    for (i in arr) println(i)
}

// task_16

fun Double.getSquareRoot() = sqrt(this)