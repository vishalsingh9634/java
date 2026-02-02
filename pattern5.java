public class pattern5 {
    public static void pattern(int n){
        for(int i=1;i<=n;i++){
            
            if(i%2==1){
                for(int j=1;j<=i;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
            
        }
    }
    public static void main(String[] args) {
        pattern(10);
    }
}
