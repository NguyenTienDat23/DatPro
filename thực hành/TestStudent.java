public class TestStudent {
    public static void main(String[] args) {
        classroom ahTeck = new classroom(1,"T2109A");
        System.out.println(ahTeck);
        Student dummyStudent = new Student(1,"TienDat");
        System.out.println("Name is:"+dummyStudent.getName());
        System.out.println("RollNo is:" +dummyStudent.getRollNo());
        System.out.println("ID is:"+ dummyStudent.getClassroom().getClassid());
        System.out.println("Name is:"+ dummyStudent.getClassroom().getClassname());


    }
}
