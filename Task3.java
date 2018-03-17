public class Task3 {
    public static void main(String[] args) {
        int[] array = {34, 8, -43, 76, -4, 15, 96, 2, 10, -22};
        int length = array.length;
        for (int i = 0; i < length; i++) {
            System.out.print(array[i] + "  ");
        }
        System.out.println("\nИнвертированный массив:");
        for (int i = 0; i < length / 2; i++) {
            int tmp = array[i];
            array[i] = array[length - 1 - i];
            array[length - 1 - i] = tmp;
        }
        for (int i = 0; i < length; i++) {
            System.out.print(array[i] + "  ");
        }
    }
}