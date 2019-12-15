package at.htl.priority.model;

public class Node implements Comparable<Node> {

    private Node next;
    private String data;
    private int priority;

    //region Constructors
    public Node() {
    }

    public Node(String data, int priority, Node next) {
        this.data = data;
        this.priority = priority;
        this.next = next;
    }
    //endregion

    //region Getters and Setters
    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }
    //endregion


    @Override
    public String toString() {
        return String.format("Node: %s (priority %s)", getData(), getPriority());
    }

    /**
     * is not necessary with the existing implementation
     * @param o
     * @return
     */
    @Override
    public int compareTo(Node o) {
      //  return priority < o.priority ? -1 : priority > o.priority ? 1 : 0;
        return Integer.compare(priority, o.priority);
    }
}
