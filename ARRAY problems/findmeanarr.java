import java.util.Scanner;

public class findmeanarr {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        double sum=0;
        for(int i=0;i<n;i++){
           sum+=a[i];
        }
        double ans=sum/n;
        System.out.printf("The quantum mean of the array is %.2f ",ans);
        
    }
    
}
