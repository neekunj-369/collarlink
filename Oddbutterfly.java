public class Oddbutterfly {
    public static void main(String args []){
        for(int i=0;i<8;i++){
            if (i%2==0){
                continue;
            }else{
                for(int j=0;j<i;j++){
                    System.out.print("*");
                }
                for(int j=0;j<8-i-1;j++){
                    System.out.print("  ");
                }
                for(int j=0;j<i;j++){
                    System.out.print("*");
                }
            }System.out.println();
        }
        for(int i=8;i>0;i--){
            if(i%2==0){
                continue;
            }else{
                for(int j=0;j<i;j++){
                    System.out.print("*");
                }
                for(int j=0;j<8-i-1;j++){
                    System.out.print("  ");
                }
                for(int j=0;j<i;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
