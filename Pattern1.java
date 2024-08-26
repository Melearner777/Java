import java.util.*;
public class Pattern1 {
    public static void main(String args[]){

        Scanner scanner=new Scanner(System.in);

        System.out.print("Enter the number of rows(n): ");
        int n =scanner.nextInt();
        
        System.out.print("Enter the number of columns(m): ");
        int m =scanner.nextInt();
        
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        scanner.close();
    }
    
}
