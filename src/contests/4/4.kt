package contests.`4`

fun tip(bill: Int, percentage: Int = 10): Int {
    return bill * percentage / 100
}

fun getVolume(a: Int, b: Int = 1, c: Int = 1): Int{
    return a * b * c
}

fun concatenate(s1: String, s2: String, s3: String, separate: String = " "): String {
    return s1 + separate + s2 + separate + s3
}

fun polynomial(x: Int, c: Int, b: Int = 0, a: Int = 0): Int {
    return a * x * x + b * x + c
}

fun checkSpeed(speed: Int, limit: Int = 60): String {
    if (speed <= limit) {
        return "Within the limit"
    } else {
        return "Exceeds the limit by ${speed - limit} kilometers per hour"
    }
}

fun getLastDigit(num: Int) = if (num > 0) num % 10 else -num % 10

fun printLife(age: Int) {
    when  {
        age < 18 -> println("Minor")
        age < 65 -> println("Adult")
        else -> println("Senior")
    }
}

fun carPrice(old: Int = 5, kilometers: Int = 100_000, maximumSpeed: Int = 120, automatic: Boolean = false)  {
    var price = 20_000
    price -= old * 2_000
    val speedDifference = maximumSpeed - 120
    price += speedDifference * 100
    price -= (kilometers / 10_000) * 200
    price += if (automatic) 1500 else 0
    println(price)
}

fun percent(startingAmount: Int = 1000, yearPercent: Int = 5, year: Int = 10) : Int {
    var total_percent = 1f
    for (i in 1..year) total_percent *= 1 + yearPercent / 100f
    return (startingAmount * total_percent).toInt()
}

fun solve12() {
    val n = readln().toInt()

    var prev = 0
    var best = 0
    var cur = 0

    for (i in 1..n) {
        val x = readln().toInt()

        if (prev <= x) ++cur
        else {
            best = if (best < cur) cur else best
            cur = 1
        }

        prev = x
    }

    println(if (best < cur) cur else best)
}

fun solve13() {
    val n = readln().toInt()

    var is_sorted = true
    var prev = -1
    for (i in 1..n) {
        val x = readln().toInt()
        if (prev > x) is_sorted = false
        prev = x
    }

    println(if (is_sorted) "YES" else "NO")
}

fun solve15() {
    val n = readln().toInt()

    var max1 = 0
    var max2 = 0

    for (i in 1..n) {
        val x = readln().toInt()

        if (x >= max1) {
            max2 = max1
            max1 = x
        } else if (x > max2) {
            max2 = x
        }
    }

    println(max1 * max2)
}

fun solve17() {
    val a = readln().toInt()
    val b = readln().toInt()

    var prod = 1L
    for (i in a until b) prod *= i
    println(prod)
}

fun solve18() {
    var best = -1e9.toInt()
    var index = -1
    var cur = 1

    while (true) {
        val line = readLine() ?: break
        val x = line.trim().toInt()
        if (best < x) {
            best = x
            index = cur
        }

        ++cur
    }

    println("$best $index")
}

fun solve19() {
    var input = 1
    while (true) {
        input = readln().toInt()
        if (input <= 0) break

        for (i in 1..input) {
            print("#")
        }
        println()
    }
}

fun solve20() {
    val n = readln().toInt()
    var size = 0
    var cur = 1

    while (size < n) {
        for (j in 1..cur) {
            print("$cur ")
            ++size

            if (size == n) break
        }

        ++cur
    }
}

fun solve21() {
    var n = readln().toInt()

    while (n != 1) {
        print("$n ")
        if (n % 2 == 0) n /= 2
        else n = 3 * n + 1
    }

    print("1")
}

fun solve22() {
    val s = readln()

    val freq = mutableMapOf<Char, Int>()
    for (c in s) {
        freq[c] = (freq[c] ?: 0) + 1
    }

    val res = freq.count { it.value == 1 }
    println(res)
}

fun main() {
    solve22()
}