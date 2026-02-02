import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number: ");
        int num=sc.nextInt();
        int i=1;
        while(i<=10){
            int mul=i*num;
            System.out.println(mul);
            i++;
        }
    }

}
