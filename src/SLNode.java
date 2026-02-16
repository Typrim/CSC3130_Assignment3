public class SLNode<T> {
    private T t;
    private SLNode<T> next;

    public SLNode(T t) {
        this.t = t;
        next = null;
    }

    public SLNode<T> getNext() {
        return next;
    }

    public void setNext(SLNode<T> next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return t.toString();
    }
}
