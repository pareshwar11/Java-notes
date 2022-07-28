import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        int first=0;
        int second=1;
        for(int i=0;i<n;i++){
            if(i==0){
                System.out.print("0 ");
            }
            else if(i==1){
                System.out.print("1 ");
            }else{
                int sum=first+second;
                System.out.print(sum+" ");
                first=second;
                second=sum;

            }
        }
    }
}
