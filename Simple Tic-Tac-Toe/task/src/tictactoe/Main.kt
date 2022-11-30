package tictactoe

import java.lang.Exception
import kotlin.math.abs

fun main() {
    val grid = readln().replace("_", " ")
    val board = makeBoard(grid)

    showBoard(board)

    var move = ""

    while (!validateMove(move, board)) {
        move = readln()
    }

    val (a,b) = move.split(" ").map() { it.toInt()}
    board[a - 1][b - 1] = 'X'
    showBoard(board)

    /*
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
    */
}

fun makeBoard(grid: String): MutableList<MutableList<Char>> {
    return mutableListOf(
        mutableListOf<Char>(grid[0], grid[1], grid[2]),
        mutableListOf<Char>(grid[3], grid[4], grid[5]),
        mutableListOf<Char>(grid[6], grid[7], grid[8])
    )
}

fun showBoard(board:MutableList<MutableList<Char>>): Unit {
    println("""
    ---------
    | ${board[0][0]} ${board[0][1]} ${board[0][2]} |
    | ${board[1][0]} ${board[1][1]} ${board[1][2]} |
    | ${board[2][0]} ${board[2][1]} ${board[2][2]} |
    ---------
    """.trimIndent())
}

fun validateMove(move: String, board: MutableList<MutableList<Char>>): Boolean {
    var selected = Character.MIN_VALUE

    try {
        val (a, b) = move.split(" ").map() { it.toInt() }
        selected = board[a - 1][b - 1]

    } catch (e: NumberFormatException) {
        println("You should enter numbers!")
        return false
    } catch (e: IndexOutOfBoundsException) {
        println("Coordinates should be from 1 to 3!")
        return false
    }

    if(selected != ' ') {
        println("This cell is occupied! Choose another one!")
        return false
    }
    return true
}
