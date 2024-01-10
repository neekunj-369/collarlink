public class Insertion {
    public static void main(String[] args) {
        int a[]={4,5,6,3,2,1};
        for(int i=1;i<a.length;i++){
            int key=a[i];
            int j=i-1;
            while(j>=0 && a[j]>key){
                a[j+1]=a[j];
                j-=1;
            }
            a[j+1]=key;
        }
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+", ");
        }
    }
}
