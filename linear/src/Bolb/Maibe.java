package Bolb;

public class Maibe {
    public static void main(String[] args) {
        double sum = 0;
        int j = 0;
        int[] m = new int[15];
        int minI = 0;
        int maxI = 0;
        int min = (int) Double.POSITIVE_INFINITY;
        int max = (int) Double.NEGATIVE_INFINITY;
        for (int i = 0, n = m.length; i < n; i++) {
            m[i] = 154+(int) (Math.random() * 32);
            System.out.println(m[i]);
        j++; sum+= m[i];}
        for (int i = 0, n = m.length; i < n; i++) {
            if (min > m[i]) {
                min = m[i];
                minI=i;


            }
            if (max < m[i]) {
                max = m[i];
                maxI = i;
            }
        }
        double g = sum/j;
        System.out.println("Minimal: "+ min+", Index: "+minI+"\nMaximal: "+max+", Index: "+maxI);
        System.out.println("Середнє арифметичне: "+g);
    }
}
