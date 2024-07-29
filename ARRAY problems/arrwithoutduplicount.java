import java.util.Arrays;
import java.util.Scanner;

public class arrwithoutduplicount {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
       int c=0;
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        Arrays.sort(a);
        for(int i=0;i<n-1;i++){
            if(a[i]==a[i+1]){
            c++;
        }
        
        }
        System.out.println("with repeated count:");
        System.out.println(n-c);
        
    }
}
    

