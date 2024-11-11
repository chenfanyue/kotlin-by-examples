fun rentPrice(standardDays: Int, festivityDays: Int, specialDays: Int) {  //1

    val dayRates = object {                                                     //2
        val standard: Int = 30 * standardDays
        val festivity: Int = 50 * festivityDays
        val special: Int = 100 * specialDays
    }

    val total = dayRates.standard + dayRates.festivity + dayRates.special       //3

    print("Total price: $$total")                                               //4

}

fun main() {
    rentPrice(10, 2, 1)                                                         //5
}
