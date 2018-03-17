public class Task1 {
    public static void main(String[] args) {
        int[] array = {34, 8, -43, 76, -4, 15, 96, 2, 10, -22};
        int max = array[0];
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) max = array[i];
            if (min > array[i]) min = array[i];
            System.out.print(array[i] + "  ");
        }
        System.out.println("\nmin value = " + min);
        System.out.println("max value = " + max);
        int a = 99;
        int b = 0;
        for (int i = 0; i < array.length; i++) {
            if (max == array[i]) array[i] = a;
            if (min == array[i]) array[i] = b;
            System.out.print(array[i] + "  ");
        }
    }
}
