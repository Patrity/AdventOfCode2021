fun main() {

    fun movement(input: List<String>) {
        var horizontal = 0
        var depth = 0
        var aim = 0

        input.forEachIndexed { i, value ->
            val command = value.split(" ")
            val distance = command[1].toInt()
            when(command[0]) {
                "forward" -> {
                    horizontal += distance
                    depth += (distance * aim)
                }
                "up" -> {
                    aim -= distance
                }
                "down" -> {
                    aim += distance
                }
            }
        }
        println("depth: $depth")
        println("horizontal: $horizontal")
        println("total distance: ${depth * horizontal}")
    }

    val input = readInput("Day02")
    val testInput = readInput("Day02_test")

    //part1(testInput)
    movement(input)



}