fun main() {
    println("Введите три произвольных числа:")
    val a = readLine()?.toDoubleOrNull()
    val b = readLine()?.toDoubleOrNull()
    val c = readLine()?.toDoubleOrNull()

    if (a == null || b == null || c == null) {
        println("Некорректный ввод. Пожалуйста, введите числовые значения.")
        return
    }
    if (a == b && b == c){
        println("Ошибка")
    } else {
        val res = (a + b + c) / 3
        println("Среднее значение: $res")
    }
}
