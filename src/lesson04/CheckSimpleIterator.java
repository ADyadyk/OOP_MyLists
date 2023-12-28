package lesson04;

public class CheckSimpleIterator {
    public static void main(String[] args) {
        Integer[] integers = new Integer[3];
        integers[0] = 1;
        integers[1] = 200;
        integers[2] = 3000;

        // Создадим итератор для массива integers:
        SimpleIterator<Integer> forIntegers = new SimpleIterator<>(integers);

        // Выведем в консоль все элементы массива integers, использовав его итератор:
        while (forIntegers.hasNext()){
            System.out.println(forIntegers.next());
        }
    }
}
