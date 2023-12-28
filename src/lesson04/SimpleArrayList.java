package lesson04;

import java.util.Iterator;

public class SimpleArrayList<E> implements SimpleArray<E> {
    private E[] values;

    public SimpleArrayList() {
        this.values = (E[]) new Object[0];
    }

    @Override
    public boolean add(E e) {
        try{
            // Создадим новый массив temp, он будет ссылаться на тот же участок памяти что и values:
            E[] temp = values;
            //  Создадим новый массив длиннее на один элемент чем temp и дадим ссылку на него переменной values:
            values = (E[]) new Object[temp.length+1];
            // Скопируем все элементы из temp в values:
            System.arraycopy(temp, 0, values, 0, temp.length);
            // Добавим в конец массива values еще один элемент:
            values[values.length-1]=e;
            return true;
        } catch (ClassCastException ex){
            ex.printStackTrace();
        }
        return false;
    }

    @Override
    public void delete(int index) {
        try{
            // Создадим новый массив temp, он будет ссылаться на тот же участок памяти что и values:
            E[] temp = values;
            //  Создадим новый массив короче на один элемент чем temp и дадим ссылку на него переменной values:
            values = (E[]) new Object[temp.length-1];
            // Скопируем первую часть элементов из temp в values до элемента, который надо удалить:
            System.arraycopy(temp, 0, values, 0, index);
            // Скопируем вторую часть элементов из temp в values после элемента, который надо удалить:
            int amountElementAfterIndex = temp.length - index - 1;
            System.arraycopy(temp, index+1, values, index, amountElementAfterIndex);
        } catch (ClassCastException ex){
            ex.printStackTrace();
        }
    }

    @Override
    public E get(int index) {
        return values[index];
    }

    @Override
    public int size() {
        return values.length;
    }

    @Override
    public void update(int index, E e) {
        values[index] = e;
    }

    @Override
    public Iterator<E> iterator() {
        SimpleIterator<E> eSimpleIterator = new SimpleIterator<>(values);
        return eSimpleIterator;
    }
}
