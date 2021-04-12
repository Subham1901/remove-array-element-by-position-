import java.util.*;
public class Test{
    public void find(int n,int a[],int index){
        for(int i =index; i < a.length -1; i++){
            a[i] = a[i + 1];
          }
        for(int i=0;i<n-1;i++){
            System.out.print(a[i]+" ");
        }     
    }
        public static void main(String arg[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        int a[]=new int[n];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        int index=sc.nextInt();
            Example e=new Example();
            e.find(n, a, index);
    }
}
