fun main() {

    fun findCommon(input: List<String>, index: Int): Int {

        val count = input.sumOf {
            if (it[index] == '0') -1 else 1 as Int
        }
        return if (count < 0) 0 else 1
    }

    fun remove(input: MutableList<String>, index: Int, type: String) {
        val common = findCommon(input, index)

        when(type) {
            "oxygen" -> {
                input.removeIf {
                    it[index] == if (common == 1) '1' else '0'
                }
            }
            "co2" -> {
                input.removeIf {
                    it[index] == if (common == 1) '0' else '1'
                }
            }
        }
    }


    val input = readInput("Day03")
    val testInput = readInput("Day03_test")

    val oxygenList = input.toMutableList()
    val co2List = input.toMutableList()

    val size = input[0].length

    val epsilon = StringBuilder()
    val gamma = StringBuilder()

    for (pos in 0 until size) {
        if (oxygenList.size == 1 && co2List.size == 1) {
            break
        }
        if (oxygenList.size != 1) {
            remove(oxygenList, pos, "oxygen")
        }
        if (co2List.size != 1) {
            remove(co2List, pos, "co2")
        }

    }
    val oxygenValue = oxygenList.first().toInt(2)
    val co2Value = co2List.first().toInt(2)

    for (pos in 0 until size) {
        val char = findCommon(input, pos)
        epsilon.append(char)
        gamma.append(if (char == 0) '1' else '0')
    }
    val epsilonValue = Integer.parseInt(epsilon.toString(), 2)
    val gammaValue = Integer.parseInt(gamma.toString(), 2)
    println(epsilonValue * gammaValue)
    println(oxygenValue * co2Value)


}
