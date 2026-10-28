package contests.`3`
import kotlin.math.sqrt

fun solve1() {
    val (a, b, c) = readln().split(" ").map { it.toInt() }
    println(a != b && b != c && a != c)
}

fun solve2() {
    val a = readln().toInt()
    println(a < 10)
}

fun solve4() {
    val (a, b, c) = readln().split(" ").map { it.toInt() }
    println(a + b + c)
}

fun solve6() {
    val (a, b, h) = readln().split(" ").map { it.toInt() }

    if (h < a) {
        println("Deficiency")
    } else if (h > b) {
        println("Excess")
    } else {
        println("Normal")
    }
}

fun solve16() {
    val a = readln().toInt()

    for (i in 1..a) {
        print(a)
    }
}

fun solve17() {
    val n = readln().toInt()
    var good = 0
    var bad = 0
    var bigger = 0

    for (i in 1..n) {
        val type = readln().toInt()

        good += if (type == 0) 1 else 0
        bad += if (type == -1) 1 else 0
        bigger += if (type == 1) 1 else 0
    }

    println("$good $bigger $bad")
}

fun solve19() {
    var n = readln().toInt()
    val lst = readln().split(" ").map { it.toInt() }

    for (purchase in lst) {
        if (n < purchase) {
            println("Error, insufficient funds for the purchase. Your balance is $n, but you need $purchase.")
            n = -1
            break
        }

        n -= purchase
    }

    if (n != -1) {
        println("Thank you for choosing us to manage your account! Your balance is $n.")
    }
}

fun solve20() {
    var n = readln().toDouble()

    var cnt = 0
    while (n <= 700000) {
        n *= 1.071
        cnt++
    }

    println(cnt)
}

fun solve23() {
    val s: String? = readln()

    println(s?.length ?: -1)
}

fun solve24() {
    val dir = readln().toInt()

    when (dir) {
        1 -> println("move up")
        2 -> println("move down")
        3 -> println("move left")
        4 -> println("move right")
        0 -> println("do not move")
        else -> println("error!")
    }
}

fun solve_triangle() {
    val a = readln().toDouble()
    val b = readln().toDouble()
    val c = readln().toDouble()

    val p = (a + b + c) / 2
    println(sqrt(p * (p - a) * (p - b) * (p - c)))
}

fun solve_rectangle() {
    val a = readln().toDouble()
    val b = readln().toDouble()

    println(a * b)
}

fun solve_circle() {
    val a = readln().toDouble()
    val pi = 3.14

    println(pi * a * a)
}

fun solve25() {
    val type = readln()

    when (type) {
        "triangle" -> solve_triangle()
        "rectangle" -> solve_rectangle()
        "circle" -> solve_circle()
    }
}

fun solve27() {
    val data = readln().split(" ")

    val a = data[0].toLong()
    val op = data[1]
    val b = data[2].toLong()

    when (op) {
        "+" -> println(a + b)
        "*" -> println(a * b)
        "/" -> println(if (b != 0L) a / b else "Division by 0!")
        "-" -> println(a - b)
        else -> println("Unknown operator")
    }
}

fun solve28() {
    val n = readln().toInt()

    when {
        n < 1 -> println("no army")
        n < 5 -> println("few")
        n < 10 -> println("several")
        n < 20 -> println("pack")
        n < 50 -> println("lots")
        n < 100 -> println("horde")
        n < 250 -> println("throng")
        n < 500 -> println("swarm")
        n < 1000 -> println("zounds")
        else -> println("legion")
    }
}

fun solve30() {
    val n = readln().toInt()

    when (n) {
        12, 1, 2 -> println("winter")
        3, 4, 5 -> println("spring")
        6, 7, 8 -> println("summer")
        9, 10, 11 -> println("fall")
    }
}

fun solve31() {
    val s1 = readln()
    val op = readln()
    val s2 = readln()

    when (op) {
        "equals" -> println(s1 == s2)
        "plus" -> println(s1 + s2)
        "endsWith" -> println(s1.endsWith(s2))
    }
}

fun main() {
    solve31()
}