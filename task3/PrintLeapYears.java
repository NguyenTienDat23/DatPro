public class PrintLeapYears {
    public static void main(String[] args) {
        int year1 = 999;
        int year2 = 2010;
        int count = 0;
        int sum = 0;
        while (year1<=year2) {
            if(year1%4==0) {
                count++;
            }
            year1++;
        }
        System.out.println(
                "SO Nam Nhuan "+ count);
    }
}
