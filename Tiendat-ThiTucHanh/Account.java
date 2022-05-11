import java.util.Scanner;
public class Account {
    private String customerCode;
    private String customerName;
    private int accNumber;
    private long amount=0;
        public void input(){
            Scanner s1 = new Scanner(System.in);
            do {
                System.out.println("costomerCode: ");
                customerCode = s1.nextLine();
                System.out.println("costomerName: ");
                customerName = s1.nextLine();
                System.out.println("accNumber: ");
                accNumber = s1.nextInt();
                System.out.println("amount: ");
                amount = s1.nextLong();
            } while (accNumber<100000 || accNumber > 101000|| customerCode.length() < 5 );
        }
        public void depositAndWithdraw(){
            long money;
            int type;
            Scanner s1 = new Scanner(System.in);
            System.out.println("What service do you want:");
            System.out.println("0.Deposit money");
            System.out.println("1.Withdraw money");
            type = s1.nextInt();
            System.out.println("Enter money: ");
            money = s1.nextLong();
            if (type == 0){
                System.out.println("You send"+ money+ " into accout");
                System.out.println("Success");
                amount = money + amount;
                System.out.println("Amount: "+ amount);
            }
            if (type == 1){
                if (money > amount){
                    System.out.println("Not enough money");
                }
                else if (money < amount) {
                    System.out.println("You have withdrawn "+ money +" from your accout");
                    System.out.println("Success");
                    amount = amount - money;
                    System.out.println("Amount: "+ amount);
                }
            }
            System.out.println("=====");
        }
        @Override
        public String toString() {
            return "Account: \nCode: "+ customerCode+"\nName: "+customerName+"\nAccount number: "+accNumber+"\nAmount: "+amount;
   }
}

