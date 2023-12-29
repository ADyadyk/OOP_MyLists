***Содержимое пакета lesson04:***
<br> (Домашняя работа см. пп. 6 и 7)
<br/>

**My Iterator**
1. Создал класс **SimpleIterator.java** использовав Generics.
2. Создал класс **CheckSimpleIterator.java** где проверил работоспособность интератора

**My ArrayList**
3. Создадал интерфейс **SimpleArray.java**, в котором написал методы, которые должны будут реализовываться в нашем **SimpleArrayList**
4. Создадал класс **SimpleArrayList.java**, в котором реализовал все методы из интерфейса **SimpleArray.java**
5. Создал класс **CheckSimpleArrayList.java**, в котором проверил работоспособность **SimpleArrayList**

**My LinkedList**
6. Создал интерфейс **SimpleLinked.java**, в котором написал методы, которые должны будут реализоваться в нашем **SimpleLinkedList**

|                    **Название метода**                    | <p align="center">**Краткое описание**</p>                                                       |
|:---------------------------------------------------------:|:-------------------------------------------------------------------------------------------------|
|                       addLast(E e)                        | Добавляет новый элемент в конец SimpleLinkedList                                                 |
|                       addFirst(E e)                       | Добавляет новый элемент в начало SimpleLinkedList                                                |
|                          size()                           | Определяет количество элементов в SimpleLinkedList                                               |
|               getElementByIndex(int index)                | Находит элемент по индексу в нашем SimpleLinkedList                                              |
|                        printList()                        | Печатает в консоль весь SimpleLinkedList                                                         |
|                     addMiddleIndex()                      | Добавляет элемент в середину SimpleLinkedList по индексу                                         |
|                          clear()                          | Удаляет все элементы из нашего SimpleLinkedList                                                  |
|                     checkElement(E e)                     | Определяет есть ли данный элемент в нашем SimpleLinkedList                                       |
|                      checkListNull()                      | Определяет не пустой ли наш SimpleLinkedList (если пустой, то возвращает true                    |
|              deleteElementByIndex(int index)              | Удаляет элемент по индексу в нашем SimpleLinkedList                                              |
|                      findIndex(E e)                       | Возвращает индекс элемента в нашем SimpleLinkedList (если такого элемента нет, то возвращает -1) |
|                    deleteElement(E e)                     | Удаляет элемент из нашего SimpleLinkedList                                                       |
| findElementsBetweenIndex(int indexFirst, int indexSecond) | Находит все элементы между заданными индексами в нашем SimpleLinkedList и выводит их в консоль   |

7. Создал класс **SimpleLinkedList.java**, в котором реализовал все методы из интерфейса **SimpleLinked**
8. Создал класс **CheckSimpleLinkedList.java**, в котором проверил работоспособность **SimpleLinkedList**