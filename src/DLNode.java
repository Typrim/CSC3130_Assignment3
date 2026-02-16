public class DLNode {
    private Song song;
    private DLNode previous;
    private DLNode next;

    public DLNode(Song song) {
        this.song = song;
        previous = null;
        next = null;
    }

    public DLNode getPrevious() {
        return previous;
    }

    public void setPrevious(DLNode previous) {
        this.previous = previous;
    }

    public DLNode getNext() {
        return next;
    }

    public void setNext(DLNode next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return song.toString();
    }
}
