package lesson04;

public interface SimpleLinked<E> {
    /**
     Метод, который добавляет элемент в конец SimpleLinkedList
     */
    void addLast(E e);

    /**
     Метод, который добавляет элемент в начало SimpleLinkedList
     */
    void addFirst(E e);

    /**
     Метод, который определяет длину SimpleLinkedList
     */
    int size();

    /**
     Метод, который находит элемент по индексу в SimpleLinkedList
     */
    E getElementByIndex(int index);

    /**
     Метод, который выводит в консоль SimpleLinkedList
     */
    void printList();

    /**
     Метод, который добавляет элемент в середину SimpleLinkedList по индексу
     */
    void addMiddleIndex(E e, int index);

    /**
     Метод, который удаляет все элементы SimpleLinkedList
     */
    void clear();

    /**
     Метод, который проверяет есть ли элемент в SimpleLinkedList
     */
    boolean checkElement(E e);

    /**
     Метод, который проверяет пустой ли SimpleLinkedList
     */
    boolean checkListNull();

    /**
     Метод, который удаляет элемент по индексу из SimpleLinkedList
     */
    void deleteElementByIndex(int index);

    /**
     Метод, который удаляет элемент из SimpleLinkedList
     */
    void deleteElement(E e);

    /**
     Метод, который находит индекс элемента
     */
    int findIndex(E e);

    /**
     Метод, который находит элементы между индексами indexFirst и indexSecond
     */
    void findElemetsBetweenIndex(int indexFirst, int indexSecond);
}
