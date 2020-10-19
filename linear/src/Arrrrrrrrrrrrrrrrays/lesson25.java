package Arrrrrrrrrrrrrrrrays;

public class lesson25 {
    public static void main(String[] args) {
       /* String[] names ={"hg","gh"};
        int[] numb = new int[9];
        numb[0]=2;*/
        int[] n = {3, 6, 9, 9, 0, 0, 7, 5, 6543, 643, 5, 324, 1, 23, 312, 43, 32, 54, 35, 4, 6, 5, 6, 5};
        for (int i = 0, a = n.length; i < a; i++) {
            System.out.println(n[i]);
        }
        int sum = 0;
        for (int i = 0, a = n.length; i < a; i++) {
            sum +=n[i];
            System.out.println(n[i]);
        }
        System.out.println(sum);
        int s = sum/n.length;
        System.out.println(s);
    }
}
