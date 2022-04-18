public class index {
    public static void main(String[] args) {
        int totalMarks = 59;
        /*Tests the value of tatalMarks and accordingly transfers control to the else if statement*/
        if (totalMarks>=90){
            System.out.println("Grade=A+");
        }else if (totalMarks>=60){
            System.out.println("Grage=A");
        }else if (totalMarks>=40){
            System.out.println("Grage=B");
        }else if (totalMarks>=30){
            System.out.println("Grage=C");
        }else{
            System.out.print("Fail");
        }
      }
    }
