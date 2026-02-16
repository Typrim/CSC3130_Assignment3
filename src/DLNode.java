public class DLNode<T> {
    private T t;
    private DLNode<T> previous;
    private DLNode<T> next;

    public DLNode(T t) {
        this.t = t;
        previous = null;
        next = null;
    }

    public DLNode<T> getPrevious() {
        return previous;
    }

    public void setPrevious(DLNode<T> previous) {
        this.previous = previous;
    }

    public DLNode<T> getNext() {
        return next;
    }

    public void setNext(DLNode<T> next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return t.toString();
    }
}
