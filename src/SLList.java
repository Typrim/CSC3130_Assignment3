public class SLList<T> {
    private SLNode<T> head;
    private int size;

    public SLList() {
        head = null;
        size = 0;
    }

    public void addy(T t) {
        //no song passed
        if (t == null) {
            return;
        }

        SLNode<T> newNode = new SLNode<>(t);

        //there is not a head node
        if (head == null) {
            head = newNode;
        } else {
            //there is a head node
            //go to the last node
            SLNode<T> node = head;
            while (node.getNext() != null) {
                node = node.getNext();
            }
            //append new node to the end of the list
            node.setNext(newNode);
        }

        size++;
    }

    public void removy(int pos) {
        //invalid position passed
        if (pos >= size || pos < 0) {
            return;
        }

        int index = 0;
        SLNode<T> previousNode = null;
        SLNode<T> currentNode = head;
        //remove the start of the list
        if (pos == 0) {
            SLNode<T> removedNode = head;
            head = head.getNext();
            removedNode.setNext(null);
        } else {
            //remove an element not at the start of the list
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

        size--;
    }

    public String toString() {
        StringBuilder contents = new StringBuilder();
        SLNode<T> node = head;
        while (node != null) {
            contents.append(node + "\n");
            node = node.getNext();
        }
        return contents.toString();
    }
}
