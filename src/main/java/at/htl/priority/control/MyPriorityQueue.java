package at.htl.priority.control;

import at.htl.priority.model.Node;

import java.util.LinkedList;

/**
 * Priority Queue
 * <p>
 * 100 is the highest priority. The highest priority will be served first
 * 0 is the lowest priority (will be served last)
 * when the priority is equal the order of insertion counts (FIFO)
 */
public class MyPriorityQueue {

    /**
     * check whether the queue has no elements
     *
     * @return true (when empty) or false
     */
    public boolean isEmpty() {
        return true;
    }

    /**
     * insertWithPriority
     * add an element to the queue with an associated priority
     *
     * @param data     is a string
     * @param priority a number between 0 and 100; if the value is not between 0 and 100, the priority is 0
     */
    public void add(String data, int priority) {


        // when list is empty


        // when new element has highest priority


        // otherwise


    }

    /**
     * pullHighestPriorityElement
     * remove the element from the queue that has the highest priority, and return it
     *
     * @return the element with the highest priority; when the queue is empty, return null
     */
    public String remove() {
        return null;
    }

    /**
     * prints the actual content of the priority queue on the console
     * ie with 4 elements: "90 (sporteln)  80 (lernen)  15 (bingen)  5 (chillen)"
     * ie when no elements in the queue: "<empty>"
     */
    public void printToConsole() {

        System.out.println("not yet implemented");
    }

}
