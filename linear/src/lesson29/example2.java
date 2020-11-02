package lesson29;

public class example2 {
    public static void main(String[] args) {
        int min = (int) Double.POSITIVE_INFINITY;
        int max = (int) Double.NEGATIVE_INFINITY;
        int minIndex = -1;
        int maxIndex = -1;
        int j = 0;
        int[] r = new int[10];
        for (int i = 0, n = r.length; i < n; i++) {
            r[i] = (int) (Math.random() * 100 * Math.pow(-1, i));}

        for (int i = 0, n = r.length; i < n; i++) {
            if (min > r[i]) {
                min = r[i];
                minIndex = i;
            }
            if (max < r[i]) {
                max = r[i];
                maxIndex = i;
            }
        }
        int[] x = new int[r.length - 2];
        for (int i = 0, n = r.length; i < n; i++) {
            if (i == minIndex | i == maxIndex) {
                j++;
            } else {
                x[i - j] = r[i];
            }
        }
        for (int temp : r) {
            System.out.print(" " + temp+"");
        }
        System.out.println();
        for (int temp : x) {
            System.out.print(" " + temp);
        }

    }
}
