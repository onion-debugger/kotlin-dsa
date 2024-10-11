interface SimpleList {
    fun get(index: Int): Any?
    fun set(index: Int, value: Any?)
    fun remove(index: Int): Any?
    fun add(index: Int, value: Any?)
}