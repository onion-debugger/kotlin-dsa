class SimpleLinkedList(values: Array<Any?>): SimpleList {
    private inner class Item(
        var value: Any?,
        var next: Item?
    )

    private var start: Item? = null
    private var size: Int = 0

    init {
        for (i in values.indices.reversed()) {
            add(0, values[i])
        }
    }

    fun size() = size

    override fun get(index: Int): Any? {
        TODO("Not yet implemented")
    }

    override fun set(index: Int, value: Any?) {
        TODO("Not yet implemented")
    }

    override fun remove(index: Int): Any? {
        TODO("Not yet implemented")
    }

    override fun add(index: Int, value: Any?) {
        require(index == 0) {
            "Non-zero add not supported"
        }
        start = Item(value, start)
        size += 1
    }

}