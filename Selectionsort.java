public class Selectionsort {
    public static void swap(int arr[],int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    public static void main(String args[]){
        int a[]={2,4,7,5,1};
        int min=0;
        for(int i=0;i<a.length;i++){
            min=i;
            for(int j=i+1;j<a.length;j++){
                if(a[j]<a[min]){
                    min=j;
                    
                }
                

            }
            swap(a,i,min);
        }
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+", ");
        }
    }
    
}
