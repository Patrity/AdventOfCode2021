fun main() {

    fun part1(input: List<Int>) {
        var increased = 0
        var lastDepth = 0
        for ((i, value) in input.withIndex()) {
            print("$value ")
            if (lastDepth == 0)
                println("(N/A - no previous measurement)")
            else
                if (value > lastDepth) {
                    println("(increased)")
                    increased++
                } else
                    println("(decreased)")
            lastDepth = value
        }
        println(increased)
    }

    fun part2(input: List<String>):List<Int>{
        return input.map(String::toInt).windowed(3).map(List<Int>::sum)
    }

    val input = readInput("Day01")
    val intInput = input.map(String::toInt)
    part1(intInput)
    part1(part2(input))
}
