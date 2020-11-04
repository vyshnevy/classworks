package PRfrom9to11;
//Створення 3-го масиву як конкатенація 2-х масивів різної довжини»
//
//Аналогія - список 2-х груп і з них утворюємо загальний список.
public class PR101 {
    public static void main(String[] args) {
        int[] r = new int[10];
        for (int i = 0, n = r.length; i < n; i++) {
            r[i] = (int) (Math.random() * 100 * Math.pow(-1, i));}
        for(int i =0,n=r.length;i<n;i++) {
            System.out.print(r[i]+", ");}
        System.out.println();
        int[] t = new int[10];
        for (int i = 0, n = t.length; i < n; i++) {
            t[i] = (int) (Math.random() * 100 * Math.pow(-1, i));}
            for(int i =0,n=t.length;i<n;i++) {
                System.out.print(t[i]+", ");}
      //  System.out.println(r.length);
      //  System.out.println(t.length);



        int[] m = new int [r.length+t.length];
        for(int i=0, n=r.length;i<n;i++){
            m[i]=r[i];
        }
        for(int i=r.length;i<(r.length+t.length);i++){
           m[i]=t[i-r.length];
        }
        for(int i =0,n=m.length;i<n;i++) {
            System.out.println(m[i]);
        }
    }
}
