public class demo {
    public static void main(String[] args) {
        int number1 = 98; // Khai báo biến int number1 và gán giá trị 98
        int number2 = 5; // Khai báo một biến int number2 và gán giá trị 5
        int sum,difference,product,quotient,remainder; // Khai báo 5 biến int để giữ kết quả
        // Thực hiện các phép toán số học
        sum = number1 + number2;
        difference = number1 - number2;
        product = number1 * number2;
        quotient = number1 / number2;
        remainder = number1 % number2;
        // In ra kết quả
        System.out.print("The sum,difference,product,quotient and remainder of"); // In mô tả
        System.out.print(number1); // In ra giá trị của biến
        System.out.print("and");
        System.out.print(number2);
        System.out.print("are");
        System.out.print(sum);
        System.out.print(",");
        System.out.print(difference);
        System.out.print(",");
        System.out.print(product);
        System.out.print(",");
        System.out.print(quotient);
        System.out.print(",and");
        System.out.println(remainder);

        ++number1; //Tăng giá trị lưu trữ trong biến "number1" lên 1
        //Tương tự như "number1 = number1 + 1"
        --number2; // Giảm giá trị lưu trữ trong biến "number2" đi 1
        //Tương tự như "number2 = number2 - 1"
        System.out.println("number1 after increment is " + number1);
        System.out.println("number2 after decrement is " + number2);
        quotient = number1 / number2;
        System.out.println("The new quotient of"   + number1 +   "and"   + number2 +   "is"  + quotient);
    }
}
