package lesson04;

import java.util.Iterator;

public class SimpleLinkedList<E> implements SimpleLinked<E>{
    private int size;
    private Node<E> first;
    private Node<E> last;

    // Конструктор класса SimpleLinkedList:
    public SimpleLinkedList() {
        this.size = 0;
    }

    /**
     Метод, который добавляет элемент в пустой SimpleLinkedList
     */
    private void addToNull(E e){
        Node<E> newItem = new Node<>(e);
        newItem.setNext(null);
        newItem.setPrev(null);
        first = newItem;
        last = newItem;
    }

    @Override
    public void addLast(E e) {
        if (first == null){
            addToNull(e);
        }
        else {
            Node<E> newItem = new Node<>(e); // Полю item узла присваиваем значение e
            last.setNext(newItem); // Полю next узла last присваиваем значение newItem
            newItem.setPrev(last); // Полю prev узла last присваиваем значение last
            last = newItem;
        }
        size++;
    }

    @Override
    public void addFirst(E e) {
        if (first == null){
            addToNull(e);
        }
        else{
            Node<E> newItem = new Node<>(e);
            first.setPrev(newItem);
            newItem.setNext(first);
            first = newItem;
        }
        size++;
    }

    @Override
    public int size() {
        return this.size;
    }

    /**
     Метод, который ищет узел (node) по индексу:
     */
    private Node<E> getNodeByIndex(int index){
        // Создаем экземпляр класса Node и передаем в него first (первый элемент SimpleLinkedList):
        Node<E> result = first;
        // В цикле проходим и с каждой новой итерацией в result передаём следующий элемент списка SimpleLinkedList:
        for(int i = 0; i < index; i++){
            if (size == 1) return result;
            result = result.getNext();
        }
        return result;
    }

    @Override
    public E getElementByIndex(int index) {
        // Создаем экземпляр класса Node и передаем в него метод getNodeByIndex():
        Node<E> result = getNodeByIndex(index);
        // Возвращаем искомый элемент:
        return result.getItem();
    }

    @Override
    public void printList() {
        System.out.print("[");
        for(int i = 0; i < this.size(); i++){
            System.out.print(this.getElementByIndex(i));
            if (i != this.size()-1) System.out.print(", ");
        }
        System.out.println("]");
    }

    @Override
    public void addMiddleIndex(E e, int index) {
        if (index == this.size()){
            addLast(e);
        }
        else if (index == 0){
            addFirst(e);
        }
        else {
            Node<E> newItem = new Node<>(e);
            if (first == null) {
                addToNull(e);
            } else {
                Node<E> oldItem = this.getNodeByIndex(index);
                Node<E> oldPrev = oldItem.getPrev();
                if (oldItem != first) {
                    // Установим новые связи:
                    oldItem.setPrev(newItem);
                    newItem.setPrev(oldPrev);
                    oldPrev.setNext(newItem); // Ошибка
                    newItem.setNext(oldItem);
                } else {
                    // Установим новые связи:
                    oldItem.setPrev(newItem);
                    newItem.setNext(oldItem);
                    newItem.setPrev(null);
                    first = newItem;
                }
            }
            size++;
        }
    }

    @Override
    public void clear() {
        first = null;
        last = null;
        size = 0;
    }

    @Override
    public boolean checkElement(E e) {
        Node<E> result = first;
        for(int i = 0; i < this.size(); i++){
            if (result.getItem() == e) return true;
            result = result.getNext();
        }
        return false;
    }

    @Override
    public int findIndex(E e){
        int index = -1; // Возвращает -1, если элемента нет в SimpleLinkedList
        Node<E> result = first;
        for(int i = 0; i < this.size(); i++){
            if (result.getItem() == e){
                return i;
            }
            result = result.getNext();
        }
        return index;
    }

    @Override
    public void findElemetsBetweenIndex(int indexFirst, int indexSecond) {
        int firstIndex = indexFirst;
        int secondIndex = indexSecond;
        if(secondIndex < firstIndex){
            firstIndex = indexSecond;
            secondIndex = indexFirst;
        }

        Node<E> temp = first;
        SimpleLinkedList<E> result = new SimpleLinkedList<>();
        for(int i = 0; i < this.size(); i++){
            if (i >= firstIndex && i <= secondIndex){
                result.addLast(temp.getItem());
            }
            temp = temp.getNext();
        }
        result.printList();
    }

    @Override
    public boolean checkListNull() {
        return size == 0;
    }

    @Override
    public void deleteElementByIndex(int index) {
        Node<E> oldItem = getNodeByIndex(index);

        if (index == 0) {
            Node<E> oldNext = oldItem.getNext();
            // Установим новые связи:
            oldNext.setPrev(null);
            first = oldNext;
        }
        if (index == this.size()-1){
            Node<E> oldPrev = oldItem.getPrev();
            // Установим новые связи:
            oldPrev.setNext(null);
            last = oldPrev;
        }
        if (index != 0 && index != this.size()-1){
            Node<E> oldNext = oldItem.getNext();
            Node<E> oldPrev = oldItem.getPrev();
            // Установим новые связи:
            oldPrev.setNext(oldNext);
            oldNext.setPrev(oldPrev);
        }
        size--;
    }

    @Override
    public void deleteElement(E e) {
        int index = findIndex(e);
        if (index == -1) System.out.println("Такого элемента нет в SimpleLinkedList");
        else{
            deleteElementByIndex(index);
        }
    }

    /**
     Класс узла (node)
     */
    private static class Node<E>{
        private E item;
        private Node<E> next;
        private Node<E> prev;

        // Конструктор класса Node:
        public Node(E item) {
            this.item = item;
        }
        // Добавим Getter:
        public E getItem() {
            return item;
        }

        public Node<E> getNext() {
            return next;
        }

        public Node<E> getPrev() {
            return prev;
        }

        // Добавим Setter:
        public void setItem(E item) {
            this.item = item;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }

        public void setPrev(Node<E> prev) {
            this.prev = prev;
        }
    }


}
