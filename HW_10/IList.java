package HW_10;

public interface IList<T> extends ICollection<T>  {
    void push(T item);
    T get(int index);
    void insert(int index, T item);

    void addToBegin(T item);

    void removeByIndex(int index);

}
