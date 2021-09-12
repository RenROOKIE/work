import java.util.Random;
public class f {
    public static void main(String[]args) {
        Random r = new Random();
        int[]a=new int[20];
        for(int i=0;i<20;i++){
            a[i]=r.nextInt(382)+77;
        }
        System.out.println("生成的二十个随机数为:");
        for(int i=0;i<20;i++){
            System.out.print(a[i]+" ");
        }
        int b=a[0];
        for(int i=1;i<20;i++){
            if(b<a[i])b=a[i];
        }
        int c=a[0];
        for(int i=1;i<20;i++){
            if(c>a[i])c=a[i];
        }
        int d,e=0;
        for(int i=0;i<20;i++){
            e+=a[i];
        }
        d=e/a.length;
        System.out.print("\n");
        System.out.println("最大值为"+b+"最小值为"+c+"平均数为"+d);
    }
}