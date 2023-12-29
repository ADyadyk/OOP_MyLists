***Содержимое пакета lesson04:***
<br> (Домашняя работа см. пп. 6 и 7)
<br/>

**My Iterator**
<br/>
1. Создал класс **SimpleIterator.java** использовав Generics<br/>
2. Создал класс **CheckSimpleIterator.java** где проверил работоспособность интератора<br/>

**My ArrayList**
<br/>
3. Создадал интерфейс **SimpleArray.java**, в котором написал методы, которые должны будут реализовываться в нашем **SimpleArrayList**<br/>
4. Создадал класс **SimpleArrayList.java**, в котором реализовал все методы из интерфейса **SimpleArray.java**<br/>
5. Создал класс **CheckSimpleArrayList.java**, в котором проверил работоспособность **SimpleArrayList**<br/>

**My LinkedList**
<br/>
6. Создал интерфейс **SimpleLinked.java**, в котором написал методы, которые должны будут реализоваться в нашем **SimpleLinkedList**
<br/>

|                    **Название метода**                    | <p align="center">**Краткое описание**</p>                                                 |
|:---------------------------------------------------------:|:-------------------------------------------------------------------------------------------|
|                       addLast(E e)                        | Добавляет новый элемент в конец SimpleLinkedList                                           |
|                       addFirst(E e)                       | Добавляет новый элемент в начало SimpleLinkedList                                          |
|                          size()                           | Определяет количество элементов в SimpleLinkedList                                         |
|               getElementByIndex(int index)                | Находит элемент по индексу в SimpleLinkedList                                              |
|                        printList()                        | Печатает в консоль весь SimpleLinkedList                                                   |
|                     addMiddleIndex()                      | Добавляет элемент в середину SimpleLinkedList по индексу                                   |
|                          clear()                          | Удаляет все элементы из SimpleLinkedList                                                   |
|                     checkElement(E e)                     | Определяет есть ли данный элемент в SimpleLinkedList                                       |
|                      checkListNull()                      | Определяет не пустой ли SimpleLinkedList (если пустой, то возвращает true)                 |
|              deleteElementByIndex(int index)              | Удаляет элемент по индексу в SimpleLinkedList                                              |
|                      findIndex(E e)                       | Возвращает индекс элемента в SimpleLinkedList (если такого элемента нет, то возвращает -1) |
|                    deleteElement(E e)                     | Удаляет элемент из SimpleLinkedList                                                        |
| findElementsBetweenIndex(int indexFirst, int indexSecond) | Находит все элементы между заданными индексами в SimpleLinkedList и выводит их в консоль   |

7. Создал класс **SimpleLinkedList.java**, в котором реализовал все методы из интерфейса **SimpleLinked**<br/>
8. Создал класс **CheckSimpleLinkedList.java**, в котором проверил работоспособность **SimpleLinkedList**<br/>