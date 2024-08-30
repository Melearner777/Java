import java.util.*;
public class FullName {
    public static void main(String args[]){
        String firstName = "Tony";
        String lastName = "Stark";
        String combine = firstName + " " + lastName;
        System.out.println(combine.length());
        for(int i = 0; i < combine.length(); i++){
            System.out.println(combine.charAt(i));
        }
    }
}
