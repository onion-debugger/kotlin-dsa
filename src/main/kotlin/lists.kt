class SimpleArrayList(private var items: Array<Any?>): SimpleList {

    val values get() = items

    // O(1)
    override fun get(index: Int): Any? {
        // validating the parameter passed
        require(index in values.indices) {
            "$index is not valid for this list"
        }
        return values[index]
    }

    // O(1)
    override fun set(index: Int, value: Any?) {
        require(index in values.indices) { "$index does not exist" }
        values[index] = value
    }

    // O(N) as N grows as the size of the list
    override fun remove(index: Int): Any? {
        require(index in values.indices) { "$index in not valid for this array" }
        // removing an element reduces the array's size
        val newArray = Array<Any?>(values.size - 1) {  } // This is called [memory allocation]
        val toReturn = values[index]

        // copy stuff from the old array to the newArray
        // but skip the element to be deleted
        var originIndex = 0
        for (i in newArray.indices) {
            if (originIndex == index) {
//                originIndex++
                // continue can be used to skip the element
                continue
            }
            newArray[i] = values[originIndex]
            originIndex++
        }
        items = newArray
        return toReturn
    }

    override fun add(index: Int, value: Any?) {
        require(index >= 0) { "$index is not valid for this list" }
        val newArray = Array<Any?>(values.size + 1) {  }
        for (i in values.indices) {
            if (i == index) {
                newArray[index] = value
                newArray[i+1] = values[index]
            } else {
                newArray[i] = values[i]
                newArray[index] = value
            }
        }
        items = newArray
    }

    fun size() = values.size

    override fun toString() = values.contentToString()

}