public class Main {
    private static int countEvenNumbersInArray(int[] array) {
        if (array.length == 0) {
            return 0;
        }

        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                count++;
            }
        }

        return count;
    }

    private static int diffBeetweenMaxAndMin(int[] array) {
        if (array.length == 0) {
            return 0;
        }

        int min = array[0];
        int max = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            } else if (array[i] > max) {
                max = array[i];
            }
        }

        return max - min;
    }

    private static boolean isTwoNeighborsEqualZero(int[] array) {
        if (array.length == 0) {
            return false;
        }

        boolean bool = false;

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == 0 && array[i+1] == 0) {
                bool = true;
            }
        }

        return bool;
    }

    public static void main(String[] args) {
        System.out.println(countEvenNumbersInArray(new int[] {1, 3, 5}));
        System.out.println(diffBeetweenMaxAndMin(new int[] {1, 3, 5}));
        System.out.println(isTwoNeighborsEqualZero(new int[] {1, 3, 5}));
    }
}
