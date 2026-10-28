package contests.`5`

val solve8: (Int, Int) -> Int = { a, b -> if (a < b) b else a }

fun compose(g: (Int) -> Int, h: (Int) -> Int): (Int) -> Int {
    return { i -> g(h(i)) }
}

// solve 10
// val a = readln().toInt()
// val b = readln().toInt()
// val c = readln().toInt()
// val lambda: (Int) -> Int = { x -> a * x * x + b * x + c}

val originalPredicate: (Char) -> Boolean = { x -> x in 'a'..'m' }

val notPredicate: (Char) -> Boolean = { x -> !originalPredicate(x) }

// solve 12
//val p1 = readln().toLong()
//val p2 = readln().toLong()
//val lambda: (Long, Long) -> Long = { a, b ->
//    var prod = 1L
//    for (i in p1..p2) prod *= i
//    prod
//}

fun check() {
    val positiveNumbers = readln()
        .split(" ")
        .filter {
            var good = true
            for (c in it) {
                if (c !in '0'..'9') good = false
            }
            good
        }
        .map { it.toInt() }
        .filter { it > 4 }
    println(positiveNumbers)
}

fun bigFunction(a: Int, f: (Int, Int) -> Int): (Int) -> Int {
    return { i -> f(a, i) }
}

fun applyTransformation(numbers: List<Int>, f: (Int) -> Int): List<Int> {
    return numbers.map { f(it) }
}

// Ваш код тут
fun main() {
    val f = { x: Int -> x*100 }
    println(applyTransformation(readln().split(" ").map{it.toInt()}, f))
}