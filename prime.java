public class prime {
    public static boolean prime_no(int n){
        if(n==2){
            return true;
        }
        for(int i=2;i<=n-1;i++){
            if(n%i==0){
                return false;
            }
                    
        }
        return true;
    }

    public static boolean prime_num(int n){
        if(n==2){
            return true;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
        

    public static void main(String[] args) {
        System.out.println(prime_no(12));
        System.out.println(prime_num(5));
    }
}
