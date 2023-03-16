package HW_04;

public class Program {
    public static void main(String[] args) {
        Integer[] array = new Integer[] { 12, 21, 13, 23, 45, 7, 4, 42, 1, 3, 78 };

        Array array2 = new Array<>(array);
        System.out.printf("Длинна массива: %d", array2.getSize());
        System.out.printf("\nПоиск произведения элементов массива: %d", array2.getMulti());
        System.out.printf("\nПоиск суммы элементов массива: %d", array2.getSum());
        System.out.printf("\nПоиск максимума: %d", array2.getMax());
        System.out.printf("\nПоиск min: %d", array2.getMin());

        array2.bubbleSort();
        System.out.println();
        array2.printArr();

    }
}
