// task_12

fun isLeapYear(year: Int): Boolean {
    return year % 400 == 0 || year % 4 == 0 && year % 100 != 0
}