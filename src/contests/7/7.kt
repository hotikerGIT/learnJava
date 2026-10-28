package contests.`7`

import jdk.internal.ffi.generated.kqueue.kevent.data

fun solve1() {
    val numbers = listOf(2, 5, 25, 1089, 4)
    val value = with(numbers) {
        var numbers = this
        this.drop(5)
        numbers.lastOrNull()
    }

    println(value)
}

fun solve3() {
    val data = run {
        val day = readln()
        val month = readln()
        val year = readln()
        "$day.$month.$year"
    }

    // Do not change the code below. This println(data) line is strongly required!
    println(data)
}

//data class Musician(var name: String = "", var band: String = "", var role: String = "") {
//}

fun solve4() {
    val musician = Musician(readln(), readln(), readln())
    val num = musician.run {
        println(this)
        name.length
    }.run {
        val length4 = this / 4
        println(length4)
        length4
    }.run {
        this + 10
    }

    println(num)
}

//data class Musician(var name: String = "", var band: String = "", var role: String = "") {
//}

//fun solve5() {
//    val musician = Musician()
//
//    musician.apply {
//        name = readln()
//        band = readln()
//        role = readln()
//    }.also {
//        println("Name: ${it.name}")
//        println("Band: ${it.band}")
//        println("Role: ${it.role}")
//    }
//}

fun solve6() {
    val resultMap = readln()
        .split(" ")
        .let { urls ->
            println(urls.size)
            urls.map { it.lowercase() }
        }
        .associateWith { url ->
            listOf(url.length)
        }

    println(resultMap)
}

fun solve7() {
    val poet = readln()

    val coolScope = poet.let {
        println("Our poet is $it")
        it.lowercase().count { c -> c == 'a' }
    }

    println(coolScope)
}

data class Musician(var name: String, var instrument: String = "Guitar", var band: String = "Radiohead")

fun solve8() {
    val musician = Musician("Jonny Greenwood").apply {
        instrument = "Banjo"
    }
    print(musician)
}

fun solve11() {
    var a = readln()
    val b = a.also {
        a = readln()
    }

    println(a)
    println(b)
}

fun solve12() {
    val heroesList = mutableListOf("John Snow", "Daenerys Targaryen")
    println("Old heroes list: ${heroesList.joinToString()}")

    val newList = heroesList.run {
        add(readln())
        this
    }

    println("New heroes list: ${newList.joinToString()}")
}

data class Movie(
    var name: String = "The Knack ...and How to Get It",
    var link: String = "https://",
    var dataBaseName: String = "IMDB"
)

fun solve13() {
    val movie = Movie()
    val data = readln().split(" ")
    movie.apply {
        link = data[1]
        dataBaseName = data[0]
    }

    println(movie)
}

fun solve14() {
    var a = 10
    var b = 15
    a = b.also {b = a}
    print(b - a)
}

data class TextField(
    var text: String = "Hello!",
    var textSize: Int = 12,
    var fontFamily: String = "Roboto"
)

fun main() {
    val textField = TextField()

    val valuesMap = mapOf<String, Int>(
        "Cancel" to 12,
        "Button" to 14,
        "Submit" to 13
    )

    val input = readln()

    textField.apply {
        text = input
        textSize = valuesMap[input]!!
    }

    println("New settings: $textField")
}