package lesson04;

import java.util.Iterator;

public class SimpleIterator<T> implements Iterator<T> {
    private T[] items;
    private int index;

    public SimpleIterator(T[] items) {
        this.items = items;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < items.length;
    }

    @Override
    public T next() {
        return items[index++];
    }
}
