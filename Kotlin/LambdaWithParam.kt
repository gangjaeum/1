package chap03.section3

fun main() {
    Param{a ->"Hello $a World!"}

    withArgs("Happy", "Arg2", {a,b -> "Hello $a World! $b"})
    withArgs("Happy", "Arg2") {a,b ->"Hello $a World! $b"}
    
    twoLambda({a -> "Hello $a World"}, {b -> "Happy $b Smile"})
}

fun Param(out: (String)->String) = println(out("Happy"))

fun withArgs(a: String, b: String, out: (String, String) -> String) {
    println(out(a,b))
}

fun twoLambda(out1: (String)->String, out2: (String) -> String) {
    println(out1("Happy"))
    println(out2("Lucky"))
}
