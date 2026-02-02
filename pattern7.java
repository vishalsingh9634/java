public class pattern7 {
    public static void piramid(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("b");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*"+"b");
            }
            System.err.println();
        }

    }
    public static void main(String[] args) {
        piramid(5);
    }
}
