import java.util.*;

public class Factorial {
    public static void printFactorial(int a){
        if(a<0){
            System.out.println("Invalid output");
        }
        int factorial =1;
        for(int i=a;i>=1;i--){
            factorial=factorial*i;

        }
        System.out.println(factorial);
        return;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        printFactorial(a);
    }
}
