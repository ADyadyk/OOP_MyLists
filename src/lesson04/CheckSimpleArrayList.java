package lesson04;

public class CheckSimpleArrayList {
    public static void main(String[] args) {
        // Создадим наш SimpleArrayList параметрозовав его String:
        SimpleArray<String> strings = new SimpleArrayList<>();
        // Добавим в него значения:
        strings.add("aaa");
        strings.add("bbb");
        strings.add("ccc");
        // Проверка методов:
        System.out.println(strings.get(1));
        System.out.println(strings.size());
        strings.update(2,"ddd");
        System.out.println(strings.get(2));
        strings.delete(1);
        System.out.println(strings.get(1));
    }
}
