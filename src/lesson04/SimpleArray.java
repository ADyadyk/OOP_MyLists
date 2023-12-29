package lesson04;

public interface SimpleArray<E> extends Iterable<E>{
    /**
     Добавление элемента
     */
    boolean add(E e);

    /**
     Удаление элемента по индексу
     */
    void delete(int index);

    /**
     Получение элемента по индексу
     */
    E get(int index);

    /**
     Получение размера списка
     */
    int size();

    /**
     Обновление значения элемента по индексу
     */
    void update(int index, E e);
}
