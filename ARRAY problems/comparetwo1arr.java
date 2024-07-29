import java.util.Scanner;

public class comparetwo1arr {
     public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int input=s.nextInt();
        int[] bob=new int[input];
        int[] alice=new int[input];
        int count=0;
        for(int i=0;i<input;i++)
        {
            bob[i]=s.nextInt();
        }
         for(int i=0;i<input;i++)
        {
            alice[i]=s.nextInt();
        }
        for(int i=0;i<input;i++)
        {
            if(bob[i]>=alice[i])
            {
                count++;
            }
            
        }
        if(count==input)
        {
            System.out.println("Compatibility Achieved!");
        }
        else
        {
            System.out.println("Incompatibility Detected!");
        }
    
    }
}
