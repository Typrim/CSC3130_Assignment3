public class DLList<T> {
    private DLNode<T> head;
    private int size;

    public DLList() {
        head = null;
        size = 0;
    }

    public void addy(T t) {
        //no song passed
        if (t == null) {
            return;
        }

        DLNode<T> newNode = new DLNode<>(t);

        //there is not a head node
        if (head == null) {
            head = newNode;
        } else {
            //there is a head node
            //go to the last node
            DLNode<T> node = head;
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
        DLNode<T> previousNode = null;
        DLNode<T> currentNode = head;
        DLNode<T> nextNode = null;
        if (currentNode != null) {
            nextNode = currentNode.getNext();
        }
        //remove the only element of the list
        if (pos == 0 && nextNode == null) {
            head = null;
        } else if (pos == 0) {
            //remove the start of the list if it has multiple elements
            DLNode<T> removedNode = head;
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
        DLNode<T> node = head;
        while (node != null) {
            contents.append(node + "\n");
            node = node.getNext();
        }
        return contents.toString();
    }
}
