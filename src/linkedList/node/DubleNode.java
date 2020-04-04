package linkedList.node;

//Node for double link lists
public class DubleNode<T> {

    private T value;
    private Node next;
    private Node prev;

    public DubleNode(T value, Node next, Node prev) {
        this.value = value;
        this.next = next;
        this.prev = prev;
    }

    public DubleNode() {
        this.value = null;
        this.next = null;
        this.prev = null;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
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
}
