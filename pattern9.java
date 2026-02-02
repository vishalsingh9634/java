public class pattern9 {
    public static void pattern(int n){
        for (int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.err.print(i);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pattern(5);
    }
}
