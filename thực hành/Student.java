public class Student {
    private int RollNo;
    private String name;
    private classroom classroom;
    classroom myclass;
    public Student(int RollNo,classroom classroom ,String name,classroom myclass){
        this.RollNo = RollNo;
        this.name = name;
        this.classroom =myclass;

    }
    public int getRollNo(){
        return RollNo;
    }
    public String getName(){
        return name;
    }
    public classroom getClassroom(){
        return classroom;
    }


    public Student(int RollNo, String name){
        this.RollNo = RollNo;
        this.name = name;
        this.classroom = classroom;
        this.myclass = myclass;

    }


    @Override
    public String toString() {
        return "Student{" +
                "RollNo=" + RollNo +
                ", name='" + name + '\'' +
                ", myclass=" + myclass +
                '}';
    }
}