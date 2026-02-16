public class AList<T> {
    //array to store elements
    T[] array;
    //maximum size of the array
    int maxSize;
    //number of elements in the list
    int size;

    public AList() {
        maxSize = 0;
        size = 0;
        array = (T[]) new Object[maxSize];
    }

    public void addy(T p) {
        //if the array is full
        if (size >= maxSize) {
            //move elements to a larger array
            T[] newArray = (T[]) new Object[++maxSize];
            for (int index = 0; index < size; index++) {
                newArray[index] = array[index];
            }
            array = newArray;
        }
        //insert song
        array[size++] = p;
    }

    public void removy(int pos) {
        //deleting an element at the end
        if (pos == size - 1) {
            size--;
        } else if (pos >= size || pos < 0) {
            //deleting at an invalid index
            throw new IllegalArgumentException("Invalid index");
        } else {
            //deleting an element not at the end
            for (int index = pos + 1; index < size; index++) {
                array[index - 1] = array[index];
            }
            size--;
        }
    }

    @Override
    public String toString() {
        StringBuilder contents = new StringBuilder();
        //adds only valid elements
        for (int index = 0; index < size; index++) {
            contents.append(array[index] + "\n");
        }
        return contents.toString();
    }
}
