public class day2_5 {
    public static void main(String[] args) {
        int n = 9;
        int a = 0;
        int b = 1;
        System.out.print(a + " " + b + " ");
        for(int i=2;i<=n;i++){
            int c =a + b;
            a = b;
            b = c;
            System.out.print(c + " ");
        }
    }
}
