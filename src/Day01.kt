fun main() {

    fun part1(input: List<String>) {
        for (i in input.indices) {
            print("${input[i]} ")
            if (i == 0)
                println("(N/A - no previous measurement)")
            else
                if (input[i] > input[i - 1])
                    println("(increased)") else println("(decreased)")
        }
    }

    fun part2(input: List<String>): Int {
        return input.size
    }

    val input = readInput("Day01")
    part1(input)
    //println(part2(input))
}
