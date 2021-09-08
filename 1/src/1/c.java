import java.util.Scanner;
public class c {
    public static void main(String[] args){
    System.out.println("请输入两个整数以求最大公因数(先大后小)");
    Scanner sc=new Scanner(System.in);
    int a= sc.nextInt();
    int b= sc.nextInt();
    int c;
    while (true){
        if (a%b==0){
            System.out.println(b);break;
        }
        else{
            c=a%b;a=b;b=c;
        }
    }
    }
}
