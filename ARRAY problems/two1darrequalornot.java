import java.util.Scanner;

public class two1darrequalornot {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        int b[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
         for(int i=0;i<n;i++){
            b[i]=s.nextInt();
        }
        int c=0;
        for(int i=0;i<n;i++){
            if(a[i]==b[i]){
                c++;
            }
        }
        if(c>0)
            System.out.println("Match Found!");
        else
            System.out.println("No Match Found!");

    }
    
}
