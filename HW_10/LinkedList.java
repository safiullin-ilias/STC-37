package HW_10;

public class LinkedList<T> implements IList<T> {

    private static class Item<T2> {
        T2 value;
        Item<T2> next;

        Item(T2 value) {
            this.value = value;
        }
    }

    private Item<T> first;
    private Item<T> last;

    private int count;


    @Override
    public int count() {
        return count;
    }

    @Override
    public void push(T item) {
        Item<T> newNode = new Item<>(item);
        if (first == null) {
            first = newNode;
        } else {
            last.next = newNode;
        }
        last = newNode;
        count++;
    }

    @Override
    public boolean contains(T item) {

        IIterator<T> iterator = iterator();

        while (iterator.hasNext()) {
            T fetcher = iterator.next();
            if (fetcher.equals(item))
                return true;
        }

        return false;
    }

    @Override
    public IIterator<T> iterator() {
        return new LinkedListIterator();
    }

    @Override
    public T get(int index) {
        if (index >= 0 && index < count) {
            Item<T> current = first;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            return current.value;
        } else {
            return null;
        }

    }

    @Override
    public void insert(int index, T item) {
        if (index == 0)
            addToBegin(item);
        else
            if (index >= count)
                push(item);
        else {
            if (index > 0 && index < count) {
                Item<T> current = first;
                for (int i = 0; i < index; i++) {
                    current = current.next;
                }
                Item<T> newNode = new Item<>(item);
                newNode.next = current.next;
                current.next = newNode;
            }
        }
    }

    @Override
    public void addToBegin(T item) {
        if (count == 0) {
            push(item);
            return;
        }

        Item<T> newNode = new Item<>(item);
        first.next = first;
        first = newNode;

        count++;
    }

    @Override
    public void remove(T item) {
        if (first.value.equals(item)) {
            first = first.next;
            count --;
            return;
        }
        else {
            int index = 0;
            if (index < count) {
                Item<T> current = first;
                for (int i = 0; i < count - 1; i++) {
                    if (current.next.value.equals(item)) {
                        current.next = current.next.next;
                        count --;
                        return;
                    }
                    else
                        current = current.next;
                }
            }
        }
    }

    @Override
    public void removeByIndex(int index) {
        remove(get(index));
    }
    
    private class LinkedListIterator implements IIterator<T> {

        // ссылка на текущий узел итератора
        private Item<T> current;

        LinkedListIterator() {
            this.current = first;
        }

        @Override
        public T next() {
            T nextValue = current.value;
            // сдвигаем указатель на следующий узел
            current = current.next;
            return nextValue;
        }

        @Override
        public boolean hasNext() {
            // если следующего узла нет - не идем дальше
            return current != null;
        }
    }

}