import interfaces.MyInterface
import interfaces.A
import interfaces.B

fun main(args:Array<String>){

    var v1: MyInterface = A()
    var v2: MyInterface = B()

    v1.fun1()
    v2.fun1()
}