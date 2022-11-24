package tictactoe

import kotlin.math.abs

fun main() {
    val grid = readln()

    val winConditions = mutableListOf(
        mutableListOf(0,1,2),
        mutableListOf(3,4,5),
        mutableListOf(6,7,8),
        mutableListOf(0,3,6),
        mutableListOf(1,4,7),
        mutableListOf(2,5,8),
        mutableListOf(0,4,8),
        mutableListOf(2,4,6)
    )

    var winX = 0
    var winO = 0
    var countX = 0
    var countO = 0
    var emptyCells = false
    var output = ""

    for (i in grid) {
        if (i == '_') emptyCells = true
        if (i == 'X') countX++
        if (i == 'O') countO++
    }

    for(row in winConditions) {
        val (a, b, c) = row
        if (grid[a] == 'X' && grid[a] == grid[b] && grid[a] == grid[c]) winX++
        if (grid[a] == 'O' && grid[a] == grid[b] && grid[a] == grid[c]) winO++
    }

    if (winX > 0 && winO > 0 || abs(countX - countO) > 1) {
        output = "Impossible"
    } else {
        if (winX == 0 && winO == 0 && emptyCells) output = "Game not finished"
        if (winX == 0 && winO == 0 && !emptyCells) output = "Draw"
        if (winX == 1) output = "X wins"
        if (winO == 1) output = "O wins"
    }

    println("""
    ---------
    | ${grid[0]} ${grid[1]} ${grid[2]} |
    | ${grid[3]} ${grid[4]} ${grid[5]} |
    | ${grid[6]} ${grid[7]} ${grid[8]} |
    ---------
    $output
    """.trimIndent())
}