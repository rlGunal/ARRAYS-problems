import java.util.Scanner;

public class equalscheckarr {
     public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        int c=0;
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        int res=s.nextInt();
        for(int i=0;i<n;i++){
            if(res==a[i]){
                c++;
            }
        }
        if(c==1){
            System.out.println("Elusive Artifact Found!");
        }
        else{
            System.out.println("Elusive Artifact Not Found!");
        }
    }
    
}
