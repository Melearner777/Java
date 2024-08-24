import java.util.*;
public class average {   
    public static void main(String args[]){
        float avg,sum=0;
        int ages[]={20,25,50,36,44};
        int x=ages.length;
        for(int i=0;i<ages.length;i++){
            sum+=ages[i];
        }
        avg=sum/x;
        System.out.println("Average of ages is :"+avg);
    }
}
