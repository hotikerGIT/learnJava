package contests.`2`

fun solve3() {
    val a = readln().toInt()
    val b = readln().toInt()

    println(a / b)
}

fun solve4() {
    val a = readln().toLong()
    val b = readln().toLong()
    println(a + b)
}

fun solve5() {
    val a = readln()
    println("${a.toInt()} ${a.toDouble()} ${a.toBoolean()}")
}

fun solve7() {
    println("08:00 You have one billion dollars")
    println("08:30 You have two thousand dollars")
    println("09:10 You have no dollars!")
}

fun solve8() {
    println("O X X")
    println("O X O")
    println("X O X")
}

fun totalLembas(first: String, second: String) {
    print(first.toInt() + second.toInt())
}
fun solve9() {
    val breadFromFrodo = readln()
    val breadFromSam = readln()
    totalLembas(breadFromFrodo, breadFromSam)
}

fun solve11() {
    println("""{
    "firstName": "John",
    "lastName": "Smith",
    "age": 35,
    "phoneNumbers": [
        {
            "type": "mobile",
            "number": "123 567-7890"
        }
    ]
}""")
}

fun solve12() {
    val a = readln().toInt()
    val b = a / 2;
    println("The obtained value is $a and its Int representation after division by 2 is $b")
}

fun solve13() {
    val a = readln().toInt()
    val b = readln().toInt()
    println("$a $b")
}

fun solve14() {
    val a = readln().toBoolean()
    val b = readln().toBoolean()
    println(a && b)
}

fun solve15() {
    val a = readln().toBoolean()
    val b = readln().toBoolean()
    val c = readln().toBoolean()

    println(!(a && b) || c)
}

fun solve17() {
    var num = 0
    println(num++ + ++num)
}

fun solve18() {
    var a = 1
    ++a
    a--
    a++
    println(a--)
}

fun solve21() {
    val a = 10__0___0
}

fun solve22() {
    val h1 = readln().toInt()
    val m1 = readln().toInt()
    val s1 = readln().toInt()

    val h2 = readln().toInt()
    val m2 = readln().toInt()
    val s2 = readln().toInt()

    val t1 = h1 * 3600 + m1 * 60 + s1
    val t2 = h2 * 3600 + m2 * 60 + s1

    println(t2 - t1 + 1)
}

fun solve23() {
    var s = readln().toLong()
    s %= 3600 * 24
    val h = s / 3600
    s -= h * 3600
    val m = s / 60
    s -= m * 60

    println("$h:$m:$s")
}

fun main() {
    solve23()
}