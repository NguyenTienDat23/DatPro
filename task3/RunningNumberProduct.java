public class RunningNumberProduct {
    public static void main(String[] args) {
        int i = 1;
        int tich = 1;
        while (i<=10) {
            tich*=i;
            i+=1;
        }
        System.out.println(tich);
    }
}
