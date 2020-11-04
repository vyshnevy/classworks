package PRfrom9to11;

public class PR11 {
    public static void main(String[] args) {
        int p = 0;
        int n = 0;
        int[] r = new int[20];
        for (int i = 0, l = r.length; i < l; i++) {
            r[i] = (int) (Math.random() * 100 * Math.pow(-1, i));}
        for (int i = 0, l = r.length; i < l; i++) {
            if(r[i]<0){n++;}
            if(r[i]>=0){p++;}
        }
        int[] pos = new int[r.length-n];
        int[] neg = new int[r.length-p];
        for (int i = 0, l = r.length; i < l; i++) {
            if(r[i]<0){neg[i]=r[i];}
            if(r[i]>=0){pos[i]=r[i];}
        } for (int i = 0, l = pos.length; i < l; i++) {System.out.println();}
     for (int i = 0, l = neg.length; i < l; i++) {System.out.println();}
    }
}
