package contests.`8`

import java.util.Scanner
import kotlin.reflect.typeOf

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

//fun solution(first: Set<String>, second: MutableList<String>): Boolean {
//    for (s in second) {
//        if (!first.contains(s)) { return false }
//    }
//    return true
//}
//
//fun solve20(){
//    println(
//        solution(
//            readln().split(" ").toSet(),
//            readln().split(" ").toMutableList()
//        )
//    )
//}

fun solution(first: Set<Int>, second: Set<Int>) {
    val res = mutableSetOf<Int>()
    for (s in first) {
        if (s % second.size == 0) res.add(s)
    }

    println(res.joinToString(" "))
}
fun solve22() {
    solution(
        readln().split(" ").map { it.toInt() }.toSet(),
        readln().split(" ").map { it.toInt() }.toSet()
    )
}

fun solution(setSource: Set<String>, listSource: MutableList<String>): MutableSet<String> {
    val res = mutableSetOf<String>()

    for (s in setSource) {
        res.add(s)
    }

    for (s in listSource) {
        res.add(s)
    }

    return res
}

fun solve23() {
    println(
        solution(
            readln().split(" ").toSet(),
            readln().split(" ").toMutableList()
        )
        .joinToString(" ")
    )
}

fun evenFilter(numbers: Set<Int>): Set<Int> {
    val res = numbers.toMutableSet().filter { it % 2 == 0 }.toSet()
    return res
}

fun solve24() {
    println(
        evenFilter(
            readln().split(" ").map { it.toInt() }.toSet(),
        ).joinToString(" ")
    )
}

fun solution(newSet: MutableSet<String>, oldSet: Set<String>): MutableSet<String> {
    for (s in oldSet) {
        if (s[0] == 'A' || s[0] == 'a') newSet.add(s)
    }

    return newSet
}

fun solve25() {
    println(
        solution(
            mutableSetOf<String>(),
            readln().split(" ").toSet(),
        ).joinToString(" ")
    )
}

fun checkHeight(iterator: Iterator<Int>) {
    while (iterator.hasNext()) {
        val height = iterator.next()

        if (height !in 145..210) {
            println("Sorry, not today")
        } else {
            println("You can go!")
        }
    }
}

fun solve28() {
    val list = readln().split(" ").map(Integer::parseInt).toList()
    checkHeight(list.iterator())
}

fun solve29() {
    var words = mutableListOf("Olga", "learns", "English")
    val iterator = words.listIterator()
    iterator.next()
    iterator.set("Maxim")
    iterator.next()
    iterator.next()
    iterator.set("Kotlin")
    println(words.joinToString(" "))
}

fun solve30() {
    val studentsMarks = mutableMapOf<String, Int>()

    while (true) {
        val key = readln()

        if (key == "stop") break

        val value = readln().toInt()

        if (studentsMarks.containsKey(key)) continue
        studentsMarks[key] = value
    }

    println(studentsMarks)
}

fun dropElements(collection: Collection<String>, word: String): MutableList<String> {
    val res = mutableListOf<String>()
    for (s in collection) {
        if (s != word) res.add(s)
    }
    return res
}

fun solve33() {
    val originalList = readln().split(" ")
    val originalSet = originalList.toSet()
    val word = readln()

    println(dropElements(originalList, word))
    println(dropElements(originalSet, word))
}

fun uniteBookLists(books1: MutableCollection<String>, books2: Collection<String>): Boolean {
    return books1.addAll(books2)
}

data class Person(val name: String, val age: Int)

fun solve35() {
    val people = listOf(
        Person("John", 25),
        Person("Sarah", 30),
        Person("David", 20),
        Person("Alice", 40)
    )

    val comparator = compareBy<Person> { -it.age }
    val sortedPeople = people.sortedWith(comparator)

    sortedPeople.forEach { println("${it.name}, ${it.age}") }
}

data class User(val name: String, val age: Int, val email: String)

class UserComparator : Comparator<User> {
    override fun compare(a: User, b: User): Int {
        if (a.age != b.age) return a.age.compareTo(b.age)
        return a.name.compareTo(b.name)
    }
}

fun solve36() {
    val list = listOf(
        User("Sam",20,"sam@dot.com"),
        User("Max",21,"max@name.com"),
        User("Alex",21,"alex@name.com"),
        User("Alex",19,"alex20@name.com"))
    println(list.sortedWith(UserComparator()))
}

class Book(val title: String, val author: String, val price: Double)

fun solve37() {
    val books = listOf(
        Book("The Great Gatsby", "F. Scott Fitzgerald", 12.99),
        Book("To Kill a Mockingbird", "Harper Lee", 10.99),
        Book("1984", "George Orwell", 8.99),
        Book("The Catcher in the Rye", "J.D. Salinger", 9.99)
    )

    val sortedBooks = books.sortedWith(Comparator {
        a: Book, b: Book -> a.price.compareTo(b.price)
    })

    sortedBooks.forEach { println("${it.title} - ${it.author} - ${it.price}") }
}

fun solve40() {
    val myList: MutableList<Int> = (readln().split(" ").map { it.toInt() }).toMutableList()
    val strList: MutableList<String> = mutableListOf()

    for (i in myList.indices) {
        strList.add(myList[i].toString())
    }

    println(strList.joinToString(", "))
}

fun solve41() {
    val rows = mutableListOf<Boolean>(true, true, true, true, true)
    val cols = mutableListOf<Boolean>(true, true, true, true, true)

    for (i in 1..3) {
        val (x, y) = readln().split(" ").map { it.toInt() }
        rows[y - 1] = false
        cols[x - 1] = false
    }

    val out_rows = mutableListOf<Int>()
    val out_cols = mutableListOf<Int>()

    for (i in 0..4) {
        if (rows[i]) { out_rows.add(i + 1) }
        if (cols[i]) { out_cols.add(i + 1) }
    }

    println(out_cols.joinToString(" "))
    println(out_rows.joinToString(" "))
}

data class Spell(val name: String, val power: Int)

fun solve42() {
    val input = readln().split(" ")
    val spells = input.map {
        val pair = it.split("-")
        pair[1].toInt()
    }.toList()
    val res = spells.fold(0, { a: Int, b: Int -> if (b >= 40) a + b else a })

    println(res)
}

fun solve43() {
    val list = readln().split(" ")
    val res = list.fold(0, { a: Int, b: String ->
        var add = 0
        if (list.indexOf(b) % 2 == 0) add += b.length
        a + add
    })

    println(res)
}

fun main() {
    val list = readln().split(" ")
    val res = list.toList().fold(mutableListOf<Int>(0), { a: MutableList<Int>, b: String ->
        a.add(
            b.length + a.last()
        )
        a
    })

    println(res)
}