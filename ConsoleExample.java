import java.io.*;
import java.io.Console; 
public class ConsoleExample {
    public static void main(String args[]){
        Console con=System.console();
        System.out.println("What your name");
        String str=con.readLine();
        System.out.println("welcome "+ str + " to the java world");
        System.out.println("Enter the password: ");   
        char[] ch=con.readPassword();   

        String pass = String.valueOf(ch);   
        System.out.println("Password is: " + pass);   


    }
    
}