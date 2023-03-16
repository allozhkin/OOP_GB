package HW_04;

import java.util.ArrayList;
import java.util.List;

public class Array<E> {
    private E[] e;
    private List arr;
    private int size;

    public Array() {
        this.arr = new ArrayList<>();
    }

    public Array(E[] e) {
        this.e = e;
        this.arr = new ArrayList<>();
        addAll();
    }

    private void addAll() {
        for (E obj : e) {
            arr.add(obj);
        }
        this.size = size;
    }
    // 1. Вставка в массив

    public void add(Object obj) {
        arr.add(obj);
    }

    // 2. Удаление элемента по индексу
    public void remove(int index) {
        arr.remove(index);
    }

    // 3. Удаление всех элементов с заданным значением
    public void removeElement(E e) {
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).equals(e)) {
                arr.remove(i);
                i--;
            }
        }
    }

    // 4. Поиск минимума
    public int getMin() {
        int min = 0;
        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i) instanceof Integer && arr.get(i - 1) instanceof Integer) {
                if ((int) arr.get(i) < (int) arr.get(i - 1)) {
                    min = (int) arr.get(i);
                }
            }
        }
        return min;
    }

    // 5. Поиск максимума
    public int getMax() {
        int max = 0;
        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i) instanceof Integer && arr.get(i - 1) instanceof Integer) {
                if ((int) arr.get(i) > (int) arr.get(i - 1)) {
                    max = (int) arr.get(i);
                }
            }
        }
        return max;
    }

    // 6. Поиск суммы элементов массива
    public int getSum() {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) instanceof Integer) {
                sum += (int) arr.get(i);
            }
        }
        return sum;
    }

    // 7. Поиск произведения элементов массива
    public int getMulti() {
        int multi = 1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) instanceof Integer) {
                multi *= (int) arr.get(i);
            }
        }
        return multi;
    }
    // 8. Поиск индекса заданного элемента в массиве,
    // если такого элемента в массиве нет то возвращать -1

    public int findIndex(E e) {

        for (int i = 0; i < arr.size(); i++) {
            if (this.arr.get(i).equals(e)) {
                return i + 1;
            }

        }
        return -1;
    }

    // 9. Проверка наличия элемента в массиве. Возвращает true,
    // если элемент в массиве есть, false – нет.
    public boolean findElement(E e) {

        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).equals(e)) {
                return true;
            }
        }
        return false;
    }

    // 10. Пузырьковая сортировка
    public void bubbleSort() {
        this.arr = arr;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = 1; j < size - i - 1; j++) {
                if (arr.get(j) instanceof Integer && arr.get(j - 1) instanceof Integer) {
                    if ((Integer) arr.get(j + 1) < (Integer) arr.get(j)) {
                        var temp = arr.get(j);
                        arr.set(j, arr.get(j + 1));
                        arr.set(j + 1, temp);
                    }
                }
            }
        }
    }

    // 11. Сортировка простыми вставками
    public void selectSort() {
        Integer min = 0;
        int temp = 0;
        int index = 0;
        int size = arr.size();
        for (int i = 0; i < size; i++) {
            if (arr.get(i) instanceof Integer) {
                min = (Integer) arr.get(i);
            }
            for (int j = i; j < size; j++) {
                if (arr.get(j) instanceof Integer) {
                    if (min > (Integer) arr.get(j)) {
                        temp = (Integer) arr.get(j);
                        index = j;
                    }
                }
            }
            int temp1 = (int) arr.get(i);
            arr.add(i, temp);
            arr.remove(index + 1);
            temp = 1;
            index = 1;

        }
    }

    // 13. Получение элемента массива по индексу
    public E getElement(int index) {
        E result = (E) arr.get(index);
        return result;
    }

    // 14. Задание значения элементу массива с заданным индексом
    public void setIndex(E e, int index) {
        arr.remove(index);
        arr.add(index, e);
    }

    // 15. Печать массива на экран
    public void printArr() {
        for (Object object : arr) {
            System.out.print(object + " ");
        }
    }

    // 16. Длинна массива
    public int getSize() {
        return arr.size();
    }
}
