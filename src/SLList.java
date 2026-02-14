public class SLList {
    private SLNode head;

    public SLList() {
        head = null;
    }

    public void addy(Song s) {
        SLNode newNode = new SLNode(s);
        //there is not a head node
        if (head == null) {
            head = newNode;
        } else {
            //there is a head node
            //go to the last node
            SLNode node = head;
            while (node.getNext() != null) {
                node = node.getNext();
            }
            //append new node to the end of the list
            node.setNext(newNode);
        }
    }

    public void removy(int pos) {
        int index = 0;
        SLNode previousNode = null;
        SLNode currentNode = head;
        //remove the start of the list
        if (pos == 0) {
            SLNode removedNode = head;
            head = head.getNext();
            removedNode.setNext(null);
        } else {
            //go to node at removing index
            while (index < pos) {
                previousNode = currentNode;
                currentNode = currentNode.getNext();
                index++;
            }
            //remove node
            previousNode.setNext(currentNode.getNext());
            currentNode.setNext(null);
        }
    }

    public String toString() {
        StringBuilder contents = new StringBuilder();
        SLNode node = head;
        while (node != null) {
            contents.append(node + "\n");
            node = node.getNext();
        }
        return contents.toString();
    }
}
