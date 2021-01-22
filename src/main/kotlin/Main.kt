fun main() {
    countComission("Maestro", 80_000, 5_000, 1_000)
}

fun countComission(
    cardType: String = "Vk Pay",
    totalAmountOfMonth: Int = 0,
    totalAmountOfDay: Int = 0,
    amount: Int
) {
    when (cardType) {
        "Mastercard", "Maestro" -> println(countComissionMastercardMaestro(amount, totalAmountOfMonth, totalAmountOfDay))
        "Visa", "Мир" -> println(countComissionVisaMir(amount, totalAmountOfMonth, totalAmountOfDay))
        "Vk Pay" -> println(countComissionVkPay(totalAmountOfMonth, totalAmountOfDay))
    }
}

fun countComissionMastercardMaestro(
    amount: Int,
    totalAmountOfMonth: Int = 0,
    totalAmountOfDay: Int = 0,
): String =
    when {
        totalAmountOfDay > 150_000 -> "В операции отказано. Превышен лимит суммы за день"
        totalAmountOfMonth > 600_000 -> "В операции отказано. Превышен лимит суммы за месяц"
        totalAmountOfMonth > 75_000 -> "Комиссия за перевод составит ${amount * 0.006 + 20.00} руб."
        else -> "Комиссия за перевод отсутствует"
    }


fun countComissionVisaMir(
    amount: Int,
    totalAmountOfMonth: Int = 0,
    totalAmountOfDay: Int = 0,
): String =
    when {
        totalAmountOfDay > 150_000 -> "В операции отказано. Превышен лимит суммы за день"
        totalAmountOfMonth > 600_000 -> "В операции отказано. Превышен лимит суммы за месяц"
        amount * 0.0075 < 35 -> "Комиссия за перевод составит 35 руб."
        else -> "Комиссия за перевод составит ${amount * 0.0075} руб."
    }


fun countComissionVkPay(
    amount: Int,
    totalAmountOfMonth: Int = 0,
    totalAmountOfDay: Int = 0,
): String =
    when {
        totalAmountOfDay > 15_000 -> "В операции отказано. Превышен лимит суммы за день"
        totalAmountOfMonth > 40_000 -> "В операции отказано. Превышен лимит суммы за месяц"
        else -> "Комиссия за перевод отсутствует"
    }
