public class SLNode {
    private Song song;
    private SLNode next;

    public SLNode(Song song) {
        this.song = song;
        next = null;
    }

    public SLNode(Song song, SLNode next) {
        this.song = song;
        this.next = next;
    }

    public SLNode getNext() {
        return next;
    }

    public void setNext(SLNode next) {
        this.next = next;
    }
}
