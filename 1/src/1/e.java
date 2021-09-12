public class e {
    public static void main(String[] args) {
        System.out.println("13，45，89,45,22,65中大于平均值的是");
        int[] a = {13, 45, 89, 45, 22, 65};
        int b = 0;
        for (int i = 0; i < a.length; i++) {
            b = b + a[i];
        }
        int c = b / a.length;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > c) System.out.print(a[i]+" ");
        }
    }
}
