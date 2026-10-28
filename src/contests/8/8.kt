package contests.`8`

fun solve4() {
    val lst = readln().split(" ")
    val input = readln()
    println(lst.count { it == input })
}

fun solve5() {
    val lst = readln().split(" ")
    val input = readln()

    for (i in lst.indices) {
        if (lst[i] == input) {
            print("$i ")
        }
    }
}

fun names(namesList: List<String>) : List<String> {
    val cnt = mutableMapOf<String, Int>()

    for (name in namesList) {
        cnt[name] = cnt.getOrDefault(name, 0) + 1
    }

    val result = mutableListOf<String>()
    for (name in cnt.keys) {
        result.add("The name $name is repeated ${cnt[name]} times")
    }

    return result
}

fun solve11() {
    val lst = readln().split(", ")
    val res = names(lst)

    for (name in res) {
        println(name)
    }
}

fun solve13() {
    val firstList = readln().split(" ")
    val secondList = readln().split(" ")
    val thirdList = mutableListOf<String>()

    for (name in firstList) {
        thirdList.add(name)
    }

    for (name in secondList) {
        thirdList.add(name)
    }

    println(thirdList.joinToString(", "))
}

fun solve14() {
    val numbers = readln().split(" ").map { it.toInt() }.toMutableList()
    numbers.addFirst(numbers.sum())
    numbers.removeAt(numbers.lastIndex - 1)
    println(numbers.joinToString(" "))
}

fun solve15() {
    val beyondTheWall = readln().split(", ").toMutableList()
    val backToTheWall = readln().split(", ").toMutableList()
    val res = mutableListOf<String>()

    for (name in beyondTheWall) {
        if (!backToTheWall.contains(name)) res.add(name)
    }

    println(res.isEmpty())
}

fun solve16() {
    val backToTheWall = readln().split(", ").toMutableList()
    val returnedWatchman = readln()
    backToTheWall.add(returnedWatchman)
    println(backToTheWall.joinToString(", "))
}
//
//fun solution(numbers1: Set<Int>, numbers2: Set<Int>): Int {
//    var res = 0
//
//    for (number in numbers1) {
//        if (!numbers2.contains(number)) {
//            ++res
//        }
//    }
//
//    return res
//}

fun solve18() {
    println(
        solution(readln().split(" ").map { it.toInt() }.toSet(),
        readln().split(" ").map { it.toInt() }.toSet())
    )
}

fun findByIndex(names: Set<String>): String {
    var cur = 0
    var first = 0
    var second = 0

    for (name in names) {
        if (name == "Alice") {
            first = cur
        } else if (name == "Victor") {
            second = cur
        }

        ++cur
    }

    return "$first, $second"
}
fun solve19() {
    println(findByIndex(readln().split(", ").toSet()))
}

fun solution(first: Set<String>, second: MutableList<String>): Boolean {
    for (s in second) {
        if (!first.contains(s)) { return false }
    }
    return true
}

fun solve20(){
    println(
        solution(
            readln().split(" ").toSet(),
            readln().split(" ").toMutableList()
        )
    )
}

fun solution(first: Set<Int>, second: Set<Int>) {
    val res = mutableSetOf<Int>()
    for (s in first) {
        if (s % second.size == 0) res.add(s)
    }

    println(res.joinToString(" "))
}
fun main() {
    solution(
        readln().split(" ").map { it.toInt() }.toSet(),
        readln().split(" ").map { it.toInt() }.toSet()
    )
}