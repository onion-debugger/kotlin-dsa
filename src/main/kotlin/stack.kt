class Stack<Any>(value: SimpleLinkedList) {
    private var size: Int = 0
    private var head: Node<Any>? = null

    fun peek(): Any? {
        return head?.value
    }

    fun push(item: Any) {

    }

    fun pop(): Any? {
        return null
    }
}

class Node<T>(
    var value: T,
    var previous: Node<T>
)