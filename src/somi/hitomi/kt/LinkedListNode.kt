package somi.hitomi.kt

/**
 *
 * <p/>
 * @author Hitomi Takanashi
 * @date 2019/6/4
 */

/**
 * 单向链表
 */
open class LinkedList(
    /**
     * 后继节点
     */
    var nextNode: LinkedList? = null,
    /**
     * 值
     */
    var value: String = ""
)

class DoubleLinkedList(
    /**
     * 后继节点
     */
    nextNode: DoubleLinkedList? = null,
    /**
     * 值
     */
    value: String = "",
    var prevNode: DoubleLinkedList? = null
) : LinkedList(nextNode, value) {

}

/**
 * 测试 单向链表
 */
fun testLinkedTable() {

}

/**
 * 测试双向链表
 */
fun testDoublyLinkedList() {

}

fun main() {
    testLinkedTable()
    testDoublyLinkedList()
}