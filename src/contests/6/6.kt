package contests.`6`

class Planet(val star: String = "Unknown Star", var mass: Double = 1.0, val numberOfSatellites: Int = 1)

class OperatingSystem(val name: String = "Android")
class DualBoot(val primaryOs: OperatingSystem = OperatingSystem(),
               val secondaryOs: OperatingSystem = OperatingSystem())

class Complex(var real: Double = 0.0, var image: Double = 0.0)

class Site(val address: String, val foundationYear: Int)

fun makeSite(): Site{
    return Site("example.com", 2000)
}

//class Car(val brand: String, val model: String, val year: Int)

class LewisCarrollBook {
    var name = ""
        get() {
            println("The name of the book is $field")
            return field
        }
        set(value) {
            field = value
            println("Now, a book called $field")
        }

    var author = "Lewis Carroll"
        get() {
            println("The author of the book is $field")
            return field
        }

    var price = 0
        get() {
            println("Putting a new price...")
            return field
        }
        set(value) {
            field = value
            println("The new price is $field")
        }
}

//class City(val name: String = "") {
//    var population: Int = 0
//        set(value) {
//            field = if (value < 0) 0 else value
//            field = if (value > 50_000_000) 50_000_000 else field
//        }
//
//
//}

class City(val name: String) {
    var degrees: Int? = 0
        set(value) {
            field = value
            if (field!! < -92 || field!! > 57) {
                when (name) {
                    "Moscow" -> field = 5
                    "Hanoi" -> field = 20
                    "Dubai" -> field = 30
                }
            }
        }
}

fun solve13() {
    val first = readln().toInt()
    val second = readln().toInt()
    val third = readln().toInt()
    val firstCity = City("Dubai")
    firstCity.degrees = first
    val secondCity = City("Moscow")
    secondCity.degrees = second
    val thirdCity = City("Hanoi")
    thirdCity.degrees = third

    if (firstCity.degrees!! < secondCity.degrees!! && firstCity.degrees!! < thirdCity.degrees!!) {
        println(firstCity.name)
    } else if (secondCity.degrees!! < thirdCity.degrees!! && secondCity.degrees!! < firstCity.degrees!!) {
        println(secondCity.name)
    } else if (thirdCity.degrees!! < firstCity.degrees!! && thirdCity.degrees!! < secondCity.degrees!!) {
        println(thirdCity.name)
    } else {
        println("neither")
    }
}

open class Plant(val name: String)

open class Flower(val color: String, name: String) : Plant(name)

class Flowerbed(color: String, name: String) : Flower(color, name) {
    fun print() {
        println("This flowerbed has many $color ${name}s")
    }
}

open class Animal(val name: String, val age: Int)

class Dog(name: String, age: Int) : Animal(name, age) {
    var breed = ""

    constructor(name: String, age: Int, breed: String) : this(name, age) {
        this.breed = breed
    }

    override fun toString(): String {
        return "Name: $name, age: $age, breed: $breed"
    }
}



open class Building(val height: Int) {
    constructor(height: Int, material: String) : this(height) {
    }
}

class House(height: Int, val rooms: Int) : Building(height) {
}

class Box(var height: Double, var width: Double, var length: Double) {
    fun getVolume(): Double {
        return height * width * length
    }
}

/*
 Insert your code here
*/
class ArithmeticOperations(val x: Int, val y: Int) {
    fun addition(): Int {
        return x + y
    }
    fun subtract(): Int {
        return x - y
    }
    fun subtraction(): Int {
        return x - y
    }
    fun multiplication(): Int {
        return x * y
    }
    fun division(): Int {
        return x / y
    }
}

interface InterfaceTask {
    fun taskFunction(variable: List<Int>)
}

class TaskClass : InterfaceTask {
    override fun taskFunction(variable: List<Int>) {
        println("${variable[0] + variable[1]}")
    }
}

//Do not fix this line
fun next(prev: Int): Int = prev * 1000 - 10

fun Int.nextValue(): Int {
    return next(this)
}

class Cat(var sleeping: Boolean) {
    fun wakеUp() {
        sleeping = false
    }
}

fun Cat.wakeUp() {
    this.sleeping = true
}

data class Floor(val area: Int, val building: String, val numberOfRooms: Int) {
    override fun equals(other: Any?): Boolean {
        return other is Floor && building == other.building &&
                area == other.area && numberOfRooms == other.numberOfRooms
    }
}

open class Drink(val cost: Int, val name: String) {
    override fun toString() = "cost=$cost, name=$name"
}

class Coffee(val coffeeType: String): Drink(13, "Coffee")

object PlayingField {
    object Size {
        var width: Int = 0
        var height: Int = 0
    }

    fun changeSize(width: Int, height: Int) {
        Size.width = width
        Size.height = height
    }
}

object Me {
    val CURRENT_AGE = 18
    val EYES_COLOR = "green"
    val HEIGHT = 188
}

class Vehicle(val name: String, val horsePower: Int) {
    inner class Engine(val horsePower: Int) {
        fun start() {
            println("RRRrrrrrrr....")
        }
        fun printHorsePower() {
            println("The $name vehicle has $horsePower horsepower.")
        }
    }
}

open class Wood(val age: Int) {
    fun getWoodInfo(): String {
        return "age $age"
    }
}

class Pine(val isSpiny: Boolean, age: Int) : Wood(age) {
    fun getPineInfo(): String {
        return getWoodInfo() + ", spiny $isSpiny"
    }
}

open class Car(val model: String, val speed: Int)

class Bus(val typeOfBus: String, model: String, speed: Int) : Car(model, speed) {
    fun printInfo() = println("Type of bus: $typeOfBus, model: $model, speed: $speed")
}


open class Fаcility(val floors: Byte) {
    fun аddFloors(num: Byte): Int = floors + num
}

open class Factory(floors: Byte, val employееs: Short, val roof: Byte) : Fаcility(floors) {
    fun buildRoof(): Int = super.аddFloors(roof)
    open fun employeesPerFloor(): Int = employееs / floors
}

open class FactoryWithRооf(floors: Byte, roof: Byte, employees: Short) : Factory(floors, employees, roof) {
    override fun employeesPerFloor(): Int = employееs / (floors + super.buildRoof())
}

// Do not change the code below.

data class Vector2(var x: Int, var y: Int)

interface Moving {
    var currentCoordinates: Vector2

    var speed: Int

    var direction: Vector2

    // Эта функция изменяет координаты X и Y
    // объекта на величину его скорости
    // (объект имеет одинаковую скорость по осям X и Y)
    // в соответствии с направлением движения объекта.
    fun move()

    // This function reduces the speed of an object
    // along X and Y axes, subtracting given amount.
    fun slowDown(subtractedSpeed: Int)

    // Эта функция уменьшает скорость объекта
    // по осям X и Y, вычитая заданную величину.
    fun speedUp(addedSpeed: Int)

    // Эта функция задаёт новое направление для объекта,
    // перезаписывая предыдущие значения.
    fun rotate(newDirection: Vector2)
}

// Do not change the code above.

class YourMovingObject(
    override var currentCoordinates: Vector2,
    override var speed: Int,
    override var direction: Vector2
) : Moving {

    override fun move() {
        currentCoordinates.x += speed * direction.x
        currentCoordinates.y += speed * direction.y
    }

    override fun slowDown(subtractedSpeed: Int) {
        speed -= subtractedSpeed
    }

    override fun speedUp(addedSpeed: Int) {
        speed += addedSpeed
    }

    override fun rotate(newDirection: Vector2) {
        direction = newDirection
    }
}

operator fun List<Int>.invoke(code: Int): Int {
    var res = 0

    for (num in this) {
        res += if (num % code == 0) num else 0
    }

    return res
}

operator fun String.div(divider: Int): Int {
    return this.toInt() / divider
}

fun main() {
    val str = readln()
    val input = readln().toInt()
    println(str / input)
}