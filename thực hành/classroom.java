public class classroom {
    private int classid;
    private String classname;

    public classroom(int classid,String classname){
        this.classid=classid;
        this.classname=classname;
    }
    public int getClassid(){
        return classid;
    }
    public String getClassname(){
        return classname;
    }

    @Override
    public String toString() {
        return "classroom{" +
                "classid=" + classid +
                ", classname='" + classname + '\'' +
                '}';
    }
}
