package goshadudar

class NewClass:MainProvider() {
    override val db: String
        get() = "Db not connected"

    override val info: String
        get() = "Новый метод из класса наследника"

    override fun printInfo(user: User) {
        super.printInfo(user)
        println("Выводится текст из класса наследника")
    }
}