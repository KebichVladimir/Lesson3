public class Task4 {
    public static void main(String[] args) {
        int number = 123123;
        String str = Integer.toString(number);
        boolean sequence = false;
        for (int i = 0; i < str.length() - 1; i++) {
            if ((str.charAt(i + 1) <= str.charAt(i))) {
                sequence = true;
                break;
            }
        }
        if (sequence)
            System.out.println("Цифры числа " + number + " не образуют строго возрастающую последовательность.");
        else
            System.out.println("Цифры числа " + number + " образуют строго возрастающую последовательность.");
    }
}
