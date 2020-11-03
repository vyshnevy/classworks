package PRfrom9to11;
//Створення 3-го масиву як попарної суми елементів 2-х масивів однакової довжини

public class PR10 {
    public static void main(String[] args) {
        int[] r = new int[10];
        for (int i = 0, n = r.length; i < n; i++) {
            r[i] = (int) (Math.random() * 100 * Math.pow(-1, i));}
        int[] t = new int[10];
        for (int i = 0, n = t.length; i < n; i++) {
            t[i] = (int) (Math.random() * 100 * Math.pow(-1, i));}
    int[] s = new int[r.length];
        for(int i = 0,l= r.length;i<l;i++){
            s[i]=r[i]+t[i];
        }
        for(int i = 0,l= r.length;i<l;i++){
            System.out.println(s[i]);
        }
    }

}
