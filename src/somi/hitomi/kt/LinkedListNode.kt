package somi.hitomi.kt

import kotlin.math.abs

/**
 *
 * <p/>
 * @author Hitomi Takanashi
 * @date 2019/6/4
 */

/**
 * 单向链表
 */
open class LinkedListNode(
    /**
     * 后继节点
     */
    var nextNode: LinkedListNode? = null,
    /**
     * 值
     */
    var value: String = ""
) {
    override fun toString(): String {
        return "LinkedListNode ${hashCode()} with value = $value"
    }
}

class DoubleLinkedListNode(
    /**
     * 后继节点
     */
    nextNode: DoubleLinkedListNode? = null,
    /**
     * 值
     */
    value: String = "",
    /**
     * 前驱节点
     */
    var prevNode: DoubleLinkedListNode? = null
) : LinkedListNode(nextNode, value) {
    override fun toString(): String {
        return "DoublyLinkedListNode ${hashCode()} with value = $value"
    }
}

/**
 * 测试 单向链表
 */
fun testLinkedList() {
    val list: Array<LinkedListNode>
    var nextNode: LinkedListNode
    for (i in 0..10) {
        nextNode = LinkedListNode(value = i.toString())

    }
}

/**
 * 测试 双向链表
 */
fun testDoublyLinkedList() {

}

fun main() {
    testLinkedList()
    testDoublyLinkedList()

}