public class Node<T> {

    private Node next;
    private Node prev;
    private T item;

    public Node() {
        this.next = null;
        this.prev = null;
    }

    public Node(Node prev) {
        this.next = null;
        this.prev = prev;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getPrev() {
        return prev;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}