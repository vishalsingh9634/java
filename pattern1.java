public class pattern1 {
    public static void simplepattern (int n) 
    {
     for(int i=1;i<=n;i++){
        for(int j=1;j<=n;j++){
            System.out.print("*"+" ");
        }
        System.err.println();
     }
    }
    public static void main(String[] args) {
        simplepattern(5);
    }
}
