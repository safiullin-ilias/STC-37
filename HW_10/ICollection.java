package HW_10;

public interface ICollection<T> {
    int count();

    void addToBegin(T item);
    void push(T item);
    void insert(int index, T item);

    void remove(T item);
    void removeByIndex(int ​index);

    boolean contains(T item);

    IIterator<T> iterator();

}