public class RunningNumberSquareSum {
    public static void main(String[] args) {
        int lowerbound = 1;
        int upperbound = 100;
        int sum = 0;
        int Multiplication = 1;
        int number = lowerbound;
        while (number<=upperbound) {
            Multiplication = number * number;
            sum+=Multiplication;
            number++;
        }
        System.out.println("The sum from " + lowerbound + " to " + upperbound + " is " + sum);
    }
}
