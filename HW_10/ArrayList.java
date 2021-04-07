package HW_10;

public class ArrayList<T> implements IList<T> {

    private static final int CAPACITY = 10;
    // обощенный массив
    private T[] elements;

    private int count;

    public ArrayList() {
        this.elements = (T[])new Object[CAPACITY];
        this.count = 0;
    }


    @Override
    public int count() {
        return count;
    }

    @Override
    public void push(T item) {
        if (count == elements.length) {
            resize();
        }

        elements[count++] = item;

    }

    @Override
    public void remove(T item) {
        for (int i = 0; i < count; i++) {
            if (item.equals(elements[i])) {
                for (int j = i + 1; j < count; j++) {
                    elements[j - 1] = elements[j];
                }
                count --;
            }
        }
    }

    @Override
    public boolean contains(T item) {
        for (int i = 0; i < count; i++) {
            if (item.equals(elements[i]))
                return true;
        }
        return false;
    }

    @Override
    public IIterator<T> iterator() {
        return new ArrayListIterator();
    }

    @Override
    public T get(int index) {
        if (index >= 0 && index < count) {
            return elements[index];
        } else {
            return null;
        }
    }

    @Override
    public void insert(int index, T item) {
        if (count == elements.length) {
            resize();
        }
        moveArray(index, item);
        count ++ ;
    }

    @Override
    public void addToBegin(T item) {
        if (count == elements.length) {
            resize();
        }
        moveArray(0, item);
        count ++ ;

    }

    @Override
    public void removeByIndex(int index) {
        if (index >= 0 && index < count)
        for (int j = index + 1; j < count; j++) {
            elements[j - 1] = elements[j];
        }
        elements[--count] = null;
    }
    
    private void resize() {
        T newElements[] = (T[])new Object[elements.length + elements.length / 2];
        for (int i = 0; i <  count; i++) {
            newElements[i] = elements[i];
        }
        this.elements = newElements;
    }

    private void moveArray(int index, T value) {
        T newElements[] = (T[])new Object[elements.length];
        for (int i = 0; i < index; i++) {
            newElements[i] = elements[i];
        }
        newElements[index] = value;
        for (int i = index; i < count; i++) {
            newElements[i + 1] = elements[i];
        }
        this.elements = newElements;
    }


    private class ArrayListIterator implements IIterator<T> {
        private int currentPosition;

        @Override
        public T next() {
            T nextValue = elements[currentPosition];
            currentPosition++;
            return nextValue;
        }

        @Override
        public boolean hasNext() {
            return currentPosition < count;
        }
    }

}
