import java.util.Scanner;
public class b {
    public static void main(String[] args) {
        System.out.println("请输入n以求Fibonacci序列中第n个元素（n>=3）");
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int i=0,j=1,k,x=1;
        while (x<n){
            k=i+j;i=j;j=k;x++;
        }
    System.out.println(j);
    }
}
