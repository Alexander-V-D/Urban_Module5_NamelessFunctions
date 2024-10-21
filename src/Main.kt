fun main() {

    //Задача 1
    val congratulation = fun(name: String, year: Int) = "$name! Поздравляю с наступающим новым $year годом!"
    println("Пример выполнения решения задачи 1: ${congratulation("Иван", 2025)}")

    //Задача 2
    val array = arrayOf(1, 2, 3, 4, 5)
    val isEven = fun(n: Int) = n % 2 == 0
    fun checkArrayElement(array: Array<Int>, isEven: (Int) -> Boolean): Boolean {
        array.forEach { if (!isEven(it)) return false }
        return true
    }
    println("Пример выполнения решения задачи 2: ${checkArrayElement(array, isEven)}")

    //Задача 3
    val concat = fun(str1: String, str2: String) = str1 + str2
    println("Пример выполнения решения задачи 3: ${concat("Привет, ", "как дела?")}")
}

