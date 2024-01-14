import java.util.Scanner;

public class Arraysize {
    
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter size");
        int size=s.nextInt();
        int a[]=new int[50];
        System.out.println("Enter elements");
        for(int i=0;i<size;i++){
            a[i]=s.nextInt();
        }
        System.out.println("enter position to insert");
        int pos=s.nextInt();
        
        for(int i=size;i>pos;i--){
            a[i+1]=a[i];
            System.out.println(a[i]);

        }a[pos]=s.nextInt();
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+", ");
        }




        s.close();



    }
}
