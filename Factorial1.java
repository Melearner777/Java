import java.util.*;

public class Factorial1 {
    public static void main(String args[]){
        int n=5;
        int fact=1;        
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        System.out.println("Factorial of a number "+n+":"+ fact);


    }    
}


