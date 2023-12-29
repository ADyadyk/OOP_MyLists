package lesson04;

public class CheckSimpleLinkedList {
    public static void main(String[] args) {
        SimpleLinkedList<String> strings = new SimpleLinkedList<>();
        // Проверка - есть ли элементы в нашем SimpleLinkedList
        System.out.println(strings.checkListNull()); // true
        // Добавим элемент в конец нашего SimpleLinkedList
        strings.addLast("aaaa");
        // Проверим - пустой ли наш SimpleLinkedList
        System.out.println(strings.checkListNull()); // false
        // Добавим элементы в наш SimpleLinkedList (в начало и в конец)
        strings.addLast("bbbb");
        strings.addLast("cccc");
        strings.addFirst("0000");
        strings.addFirst("1111");
        strings.addLast("dddd");
        // Добавим элемент в середину нашего SimpleLinkedList
        strings.addMiddleIndex("-------", 3);
//        strings.clear(); // Удалим все элементы
        // Определи количество элементов в нашем SimpleLinkedList
        System.out.println("Длина SimpleLinkedList - " + strings.size());
        // Распечатаем наш SimpleLinkedList
        strings.printList();
        // Проверим есть ли элемент в нашем SimpleLinkedList
        System.out.println(strings.checkElement("0000"));
        // Удалим элемент по индексу из нашего SimpleLinkedList
        strings.deleteElementByIndex(6);
        // Определи количество элементов в нашем SimpleLinkedList
        System.out.println("Длина SimpleLinkedList - " + strings.size());
        // Распечатаем наш SimpleLinkedList
        strings.printList();
        // Удалим элемент из нашего SimpleLinkedList
        strings.deleteElement("1111");
        // Распечатаем наш SimpleLinkedList
        strings.printList();
        // Удалим элемент по индексу из нашего SimpleLinkedList
        strings.deleteElementByIndex(0);
        // Распечатаем наш SimpleLinkedList
        strings.printList();
        // Найдем все элементы между определенными индексами в нашем SimpleLinkedList
        strings.findElemetsBetweenIndex(1,2);
        // Добавим еще элементов в наш SimpleLinkedList
        strings.addLast("bbbb");
        strings.addLast("cccc");
        strings.addFirst("0000");
        strings.addFirst("1111");
        strings.addLast("dddd");
        // Распечатаем наш SimpleLinkedList
        strings.printList();
        // Найдем все элементы между определенными индексами в нашем SimpleLinkedList
        strings.findElemetsBetweenIndex(6,1);
    }
}
