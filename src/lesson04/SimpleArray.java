package lesson04;

public interface SimpleArray<E> extends Iterable<E>{
    /**
     Добавление элемента в SimpleArrayList
     */
    boolean add(E e);

    /**
     Удаление по индексу элемента в SimpleArrayList
     */
    void delete(int index);

    /**
     Получение элемента по индексу в SimpleArrayList
     */
    E get(int index);

    /**
     Получение размера SimpleArrayList
     */
    int size();

    /**
     Обновление значения по индексу в SimpleArrayList
     */
    void update(int index, E e);
}
