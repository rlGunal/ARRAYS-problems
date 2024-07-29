import java.util.Scanner;

public class arrindexvaldel {
     public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        int de=s.nextInt();
        System.out.println("Array after deletion is");
        for(int i=0;i<n;i++){
            if(i!=de-1){
                 System.out.println(a[i]);
            }
        }
    }
}
