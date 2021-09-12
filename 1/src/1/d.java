import java.util.Scanner;
public class d {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一串字符(限小写字母");
        String str= sc.next();
        int n[]=new int[26];
        for(int i=0;i<str.length();i++){
            char word=str.charAt(i);
            int a=word-97;
            n[a]++;
        }
        for(int i=0;i<n.length;i++){
            if(n[i]!=0)System.out.println("字母" +(char)(i+97)+
                    "出现次数为"+n[i]+"次");
        }
    }
}
