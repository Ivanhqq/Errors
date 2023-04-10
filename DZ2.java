import java.util.Arrays;

public class DZ2 {

    public static void main(String[] args) {

        int[] array1 = new int[10]; // длина 1 массива
        for (int i = 0; i < array1.length; i++) {
            array1[i] = getRandomNumber();
        }

        int[] array2 = new int[5]; // длина 2 массива
        for (int i = 0; i < array2.length; i++) {
            array2[i] = getRandomNumber();
        }
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));

        arrayLength(array1, array2);

        int[] res = merge(array1, array2);
        System.out.println(Arrays.toString(res));

    }

    public static int[] merge(int[] arr1, int[] arr2) {

        int[] result = new int[arr1.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = arr1[i] + arr2[i];
        }
        return result;

    }

    public static void arrayLength(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            System.out.println("Длины массивов не равны!");
            System.exit(1);
        }

    }

    // Генерация случайных чисел
    private static int getRandomNumber() {
        double x = (Math.random() * 99);
        int num = (int) x;
        return num;
    }
}