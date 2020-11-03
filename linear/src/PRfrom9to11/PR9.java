package PRfrom9to11;

public class PR9 {
    public static void main(String[] args) {
        int[] m = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int min = (int) Double.POSITIVE_INFINITY;
        int max = (int) Double.NEGATIVE_INFINITY;
        for (int i = 0, n = m.length; i < n; i++) {
            if (min > m[i]) {
                min = m[i];

            }
            if (max < m[i]) {
                max = m[i];

            }
        }
        System.out.println("Minimal: "+ min+"\nMaximal:"+max);
    }

}
