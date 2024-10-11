fun main() {
    val list = SimpleArrayList(arrayOf(1, 5))
    println(list.values.contentToString())
    println(list.size())
    list.add(1, null)
    println(list.values.contentToString())
    println(list.size())
    println(list.add(3, "Test"))
    println(list.values.contentToString())
    println(list.size())
    println(list.add(-1, "Nope"))
}