package PractiseWork1;

public class Main2 {
    public static void main(String[] args) {
        int[] mass = new int[100];
        for(int i = 0;i<=mass.length-1;i++){
            if (i==0){mass[i]=1;
            }else{
            mass[i] +=mass[i-1]+ 1;
            System.out.println(mass[i]);}
        }
        for(int i=0; i<=mass.length-1;i++){
            if((mass[i] % 7)==0){
                System.out.print(mass[i]  + ", ");

            }else if((mass[i] % 11)==0){
                System.out.print(mass[i]  + ", ");

            }
        }

    }
}
