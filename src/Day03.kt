fun main() {

    fun findCommon(input: List<String>, index: Int): Int {

        val count = input.sumOf {
            if (it[index] == '0') -1 else 1 as Int
        }
        return if (count < 0) 0 else 1
    }


    val input = readInput("Day03")
    val testInput = readInput("Day03_test")

    val size = input[0].length

    val epsilon = StringBuilder()
    val gamma = StringBuilder()

    for (pos in 0 until size) {
        val char = findCommon(input, pos)
        epsilon.append(char)
        gamma.append(if (char == 0) '1' else '0')
    }
    val epsilonValue = Integer.parseInt(epsilon.toString(), 2)
    val gammaValue = Integer.parseInt(gamma.toString(), 2)
    println(epsilonValue * gammaValue)


}
