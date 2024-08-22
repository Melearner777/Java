import java.util.*;
public class input {

    public static void main(String args[]){
        Scanner x=new Scanner (System.in);
        int age =x.nextInt();
        if (age>=18){
            System.out.println("Adult");

        } 
        else{
            System.out.println("Not Adult");
        }
    }

}
