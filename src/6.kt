fun main() {
    println("Введите потери:")
    val poteri = readLine()?.toDoubleOrNull()
    println("Введите прибыль:")
    val plus = readLine()?.toDoubleOrNull()
    if (poteri == null || plus == null) {
        println("Некорректный ввод. Пожалуйста, введите числовые значения.")
        return
    }
    val res = plus - poteri
    if (res > 0) {
        println("Ваша прибыль составила: $res")
    } else if (res < 0) {
        println("Ваши убытки составили: ${-res}")
    } else {
        println("Сальдо нулевое, никаких потерь или прибыли.")
    }
}
