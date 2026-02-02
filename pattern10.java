public class pattern10 {
    public static void pattern(int n) {
        int count=0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(++count%10 +" ");
                
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pattern(5);
    }
}
