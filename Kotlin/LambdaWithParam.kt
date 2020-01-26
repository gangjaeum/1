package chap03.section3

fun main() {
    Param{a ->"HelloWorld! $a"}

    withArgs("Arg1", "Arg2", {a,b -> "Hello World! $a $b"})
    withArgs("Arg1", "Arg2") {a,b ->"HelloWorld! $a $b"}
}

fun Param(out: (String)->String) = println(out("OneParam"))

fun withArgs(a: String, b: String, out: (String, String) -> String) {
    println(out(a,b))
}
