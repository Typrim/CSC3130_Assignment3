public class DLList {
    private DLNode head;
    private int size;

    public DLList() {
        head = null;
        size = 0;
    }

    public void addy(Song s) {
        //no song passed
        if (s == null) {
            return;
        }

        DLNode newNode = new DLNode(s);

        //there is not a head node
        if (head == null) {
            head = newNode;
        } else {
            //there is a head node
            //go to the last node
            DLNode node = head;
            while (node.getNext() != null) {
                node = node.getNext();
            }
            //append new node to the end of the list
            node.setNext(newNode);
            newNode.setPrevious(node);
        }

        size++;
    }

    public void removy(int pos) {
        //invalid position passed
        if (pos >= size || pos < 0) {
            return;
        }

        int index = 0;
        DLNode previousNode = null;
        DLNode currentNode = head;
        DLNode nextNode = null;
        if (currentNode != null) {
            nextNode = currentNode.getNext();
        }
        //remove the only element of the list
        if (pos == 0 && nextNode == null) {
            head = null;
        } else if (pos == 0) {
            //remove the start of the list if it has multiple elements
            DLNode removedNode = head;
            head = head.getNext();
            head.setPrevious(null);
            removedNode.setNext(null);
        } else {
            //remove an element not at the start of the list
            //go to node at removing index
            while (index < pos) {
                previousNode = currentNode;
                currentNode = nextNode;
                nextNode = currentNode.getNext();
                index++;
            }
            //remove node
            previousNode.setNext(nextNode);
            currentNode.setPrevious(null);
            currentNode.setNext(null);
            nextNode.setPrevious(previousNode);
        }

        size--;
    }

    @Override
    public String toString() {
        StringBuilder contents = new StringBuilder();
        DLNode node = head;
        while (node != null) {
            contents.append(node + "\n");
            node = node.getNext();
        }
        return contents.toString();
    }
}
