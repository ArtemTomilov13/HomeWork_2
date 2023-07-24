import java.util.Arrays;
public class ArrayShift {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int n = 2;

        System.out.println("Original array: " + Arrays.toString(arr));
        cyclicShift(arr, n);
        System.out.println("Shifted array: " + Arrays.toString(arr));
    }

    public static void cyclicShift(int[] arr, int n) {
        int length = arr.length;
        n = n % length; // Обработка случая, когда n больше длины массива

        // Создание временного массива для сохранения сдвинутых элементов
        int[] temp = new int[length];

        // Сдвиг элементов на n позиций вправо
        for (int i = 0; i < length; i++) {
            temp[(i + n) % length] = arr[i];
        }

        // Копирование элементов из временного массива обратно в исходный массив
        System.arraycopy(temp, 0, arr, 0, length);
    }
}