package contests.`9`

interface IIndex {
    fun print()
    val index: Int
}

interface IValue {
    fun print()
    val value: Int
}

class IndexData(override val index: Int) : IIndex {
    override fun print() = print(index)
}

class ValueData(override val value: Int) : IValue {
    override fun print() = print(value)
}

fun getDateTime() = "13-05-2025-11:33"

class LogDataCollector(index: IIndex, value: IValue) : IIndex by index, IValue by value {
    override fun print() = print("[${getDateTime()}]: $index, $value")
}

interface A {
    fun printA() = println("It's A")
    val msg: String
}

class B : A {
    override fun printA() = println(msg)
    override val msg: String = "It's B"
}

class C : A {
    override val msg: String = "it's C"
}

class D(base: A) : A by base {
    override val msg = "It's D"
    fun printB() = println(msg)
}

val lazyValue: String by lazy {
    print("Computed! ")
    "I am Lazy!"
}

// ILogHolder is an interface that defines methods for printing and collecting logs,
// and a property for holding the current log
interface ILogHolder {
    fun printLog()
    fun collectLog(log: String)
    var curLog: String
}

// Logger is a class that implements the ILogHolder interface
class Logger : ILogHolder {
    // Print the current log
    override fun printLog() {
        println(curLog)
    }

    // Collect a log message and add it to the current log
    override fun collectLog(log: String) {
        curLog += "\n> $log"
    }

    // Initialize the current log
    override var curLog: String = "> Logger initialized."
}
/* Do not change the code above */

// Introduce the delegate here, following the argument declaration
class ErrorHandler(base: ILogHolder): ILogHolder by base// Your code here
{
    var errorMessage: String = "" // Current error message

    // Get an error message and log it
    fun getErrorMessage(msg: String) {
        errorMessage = msg
        logErrorMessage()
    }
    // Implement here logErrorMessage() that adds the error message to the log
    fun logErrorMessage() {
        collectLog(errorMessage)
    }
}

// Function to simulate some operations and generate error messages
fun doSomething(handler: ErrorHandler) {
    handler.getErrorMessage("Access denied")
    handler.getErrorMessage("Out of memory")
    handler.getErrorMessage("I'm not an error")
}

interface ICounter {
    var count: Int
    fun increaseCount()
    fun getCurrentCount(): Int
}

class Counter(override var count: Int) : ICounter {
    // In case we need to count differently, this function can be altered
    override fun increaseCount() {
        count++
    }

    override fun getCurrentCount(): Int = count
}

// Do not change the code above

class Iterator(base: ICounter) : ICounter by base // Your code here
{
    fun next() {
        increaseCount()
    }
}

// Do not change the code below

//interface MyInterface {
//    fun print()
//    var msg: String
//}

//class MyImplementation : MyInterface {
//    override fun print() { println(msg) }
//    override var msg: String = "To be, or not to be, that is the question:"
//
//    fun updateMsg(newMsg: String) { msg = newMsg }
//}

//class CharacterInfoFormatter(base: MyInterface) : MyInterface by base {
//
//    var start: String = ""
//    var end: String = ""
//
//    override fun print() {
//        println("$msg [${msg.length} characters]")
//    }
//}

class AdditionPrinter : MyInterface {
    override fun print() { for (i in 1..amount) print("*") }
    override val amount: Int = 3 + 7 // 10
}

class SubtractionPrinter : MyInterface {
    override fun print() { for (i in 1..amount) print("*") }
    override val amount: Int = 23 - 15 // 8
}

class MultiplicationPrinter : MyInterface {
    override fun print() { for (i in 1..amount) print("*") }
    override val amount: Int = 3 * 4 // 12
}

interface MyInterface {
    fun print()
    val amount: Int
}

// Write the correct class here

class Printer(base: MyInterface) : MyInterface by base {
    override fun print() {
        for (i in 1..(amount + 2)) print("*")
    }
}

fun main() {

    // Your code here
    val p = Printer(SubtractionPrinter())

    // Do not change the code below
    p.print()
}