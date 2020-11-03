package PRfrom9to11;

public class PR93 {
    public static void main(String[] args) {
        int sum = 0;
        int ar = 0;
        int c =0;
        int[] r = new int[10];
        for (int i = 0, n = r.length; i < n; i++) {
            r[i] = (int) (Math.random() * 100 * Math.pow(-1, i));}
        for(int i = 0,l= r.length;i<l;i++){System.out.print(r[i]+", ");}
        for(int i = 0,l= r.length;i<l;i++){sum+=r[i];c++;}
        ar = sum/c;
        for(int i = 0,l= r.length;i<l;i++){
            if(r[i]>ar){
                System.out.println(r[i]);
            }
        }


    }
}
