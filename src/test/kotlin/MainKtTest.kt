import org.junit.Test

import org.junit.Assert.*

class MainKtTest {

    @Test
    fun countComissionMastercardMaestro_more150000() {
        val amount = 1_000
        val totalAmountOfMonth = 0
        val totalAmountOfDay = 200_000
        val expected = "В операции отказано. Превышен лимит суммы за день"

        val result = countComissionMastercardMaestro(
            amount = amount,
            totalAmountOfMonth = totalAmountOfMonth,
            totalAmountOfDay = totalAmountOfDay
        )
        assertEquals(expected, result)
    }

    @Test
    fun countComissionMastercardMaestro_more600000() {
        val amount = 1_000
        val totalAmountOfMonth = 700_000
        val totalAmountOfDay = 10_000
        val expected = "В операции отказано. Превышен лимит суммы за месяц"

        val result = countComissionMastercardMaestro(
            amount = amount,
            totalAmountOfMonth = totalAmountOfMonth,
            totalAmountOfDay = totalAmountOfDay
        )
        assertEquals(expected, result)
    }

    @Test
    fun countComissionMastercardMaestro_less75000() {
        val amount = 1_000
        val totalAmountOfMonth = 0
        val totalAmountOfDay = 0
        val expected = "Комиссия за перевод отсутствует"

        val result = countComissionMastercardMaestro(
            amount = amount,
            totalAmountOfMonth = totalAmountOfMonth,
            totalAmountOfDay = totalAmountOfDay
        )
        assertEquals(expected, result)
    }

    @Test
    fun countComissionMastercardMaestro_75000_150000() {
        val amount = 1_000
        val totalAmountOfMonth = 80_000
        val totalAmountOfDay = 0
        val expected = "Комиссия за перевод составит 26.0 руб."

        val result = countComissionMastercardMaestro(
            amount = amount,
            totalAmountOfMonth = totalAmountOfMonth,
            totalAmountOfDay = totalAmountOfDay
        )
        assertEquals(expected, result)
    }

    @Test
    fun countComissionVisaMir_more150000() {
        val amount = 1_000
        val totalAmountOfMonth = 0
        val totalAmountOfDay = 200_000
        val expected = "В операции отказано. Превышен лимит суммы за день"

        val result = countComissionVisaMir(
            amount = amount,
            totalAmountOfMonth = totalAmountOfMonth,
            totalAmountOfDay = totalAmountOfDay
        )
        assertEquals(expected, result)
    }

    @Test
    fun countComissionVisaMir_more600000() {
        val amount = 1_000
        val totalAmountOfMonth = 700_000
        val totalAmountOfDay = 10_000
        val expected = "В операции отказано. Превышен лимит суммы за месяц"

        val result = countComissionVisaMir(
            amount = amount,
            totalAmountOfMonth = totalAmountOfMonth,
            totalAmountOfDay = totalAmountOfDay
        )
        assertEquals(expected, result)
    }

    @Test
    fun countComissionVisaMir_more4700() {
        val amount = 5_000
        val totalAmountOfMonth = 0
        val totalAmountOfDay = 0
        val expected = "Комиссия за перевод составит 37.5 руб."

        val result = countComissionVisaMir(
            amount = amount,
            totalAmountOfMonth = totalAmountOfMonth,
            totalAmountOfDay = totalAmountOfDay
        )
        assertEquals(expected, result)
    }

    @Test
    fun countComissionVisaMir_less4700() {
        val amount = 1_000
        val totalAmountOfMonth = 0
        val totalAmountOfDay = 0
        val expected = "Комиссия за перевод составит 35 руб."

        val result = countComissionVisaMir(
            amount = amount,
            totalAmountOfMonth = totalAmountOfMonth,
            totalAmountOfDay = totalAmountOfDay
        )
        assertEquals(expected, result)
    }

    @Test
    fun countComissionVkPay_more15000() {
        val amount = 1_000
        val totalAmountOfMonth = 0
        val totalAmountOfDay = 16_000
        val expected = "В операции отказано. Превышен лимит суммы за день"

        val result = countComissionVkPay(
            amount = amount,
            totalAmountOfMonth = totalAmountOfMonth,
            totalAmountOfDay = totalAmountOfDay
        )
        assertEquals(expected, result)
    }

    @Test
    fun countComissionVkPay_more40000() {
        val amount = 1_000
        val totalAmountOfMonth = 50_000
        val totalAmountOfDay = 0
        val expected = "В операции отказано. Превышен лимит суммы за месяц"

        val result = countComissionVkPay(
            amount = amount,
            totalAmountOfMonth = totalAmountOfMonth,
            totalAmountOfDay = totalAmountOfDay
        )
        assertEquals(expected, result)
    }

}