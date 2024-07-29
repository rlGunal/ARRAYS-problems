import java.util.Scanner;

public class sumofarrevenno {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        int sum=0,odd=0;
        for(int i=0;i<n;i++){
            if(a[i]%2==0){
                sum+=a[i];
            }
            else{
                odd+=a[i];
            }
        }
        System.out.println("Victory in the Number Quest Duel!");
        System.out.println("Sum of even numbers: "+sum+".");
        System.out.println("Sum of odd numbers: "+odd+".");
        
    }
}
    

