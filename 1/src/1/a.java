import java.util.Scanner;
public class a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入出生年份");
        int year = sc.nextInt();
        int a=0;
        for (int i=year;i<=year+100;i++) {
        if((i%4==0)&(i%100!=0)) a++;
        else if (i%400==0) a++;
        }
        System.out.println("他一生活一百岁的话能度过"+a+"个闰年");
    }
}