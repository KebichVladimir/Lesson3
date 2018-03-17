public class Task2 {
    public static void main(String[] args) {
        int[] array = {1, 55, 3, 9, 55, 7, 5, 12, 2, 12};
        int arrayLength = array.length;
        for (int i = 0; i < arrayLength; i++) {
            System.out.print(array[i] + "  ");
        }
        boolean repeats[] = new boolean[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            int count = 1;
            for (int j = i + 1; j < arrayLength; j++) {
                if (array[i] == array[j]) {
                    repeats[j] = true;
                    count++;
                }
            }
            if (count >= 2)
                System.out.print("\n[" + array[i] + "]" + " - повторений " + count);
        }
    }
}
