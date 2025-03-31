fun main() {
    val a = 2
    val b = 6

    println("У вас есть числа: $a и $b")
    println("Выберите действие: 1. Добавить, 2. Отнять, 0. Ничего")

    val choice = readLine()?.toIntOrNull()

    when (choice) {
        1 -> {
            val result = a + b
            println("Результат: $result")
        }
        2 -> {
            val result = a - b
            println("Результат: $result")
        }
        0 -> println("Ничего, два числа $a и $b")
        else -> println("Некорректный ввод")
    }
}
