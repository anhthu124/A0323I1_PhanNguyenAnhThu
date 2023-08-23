package ss5.Demo;

public class Student {
    private int codeStudent;
    private String nameStudent;
    private String dateOfBirth;
    static String nameClass;
    static {
        nameClass="A0922I";
    }
    public  int getCodeStudent(){return  this.codeStudent;}
    public void setCodeStudent(int codeStudent){this.codeStudent=codeStudent;}
    public static void setNameClass(String temp){ nameClass=temp;}
    public void  setNameStudent(String nameStudent){this.nameStudent=nameStudent;}


    public Student(){

    }

    public Student(int codeStudent,String nameStudent,String dateOfBirth){
        this.codeStudent=codeStudent;
        this.nameStudent=nameStudent;
        this.dateOfBirth=dateOfBirth;
    }

    public static void main(String[] args) {
        setNameClass(" A0522I1");
        Student.nameClass="A0123I1";
        Student.setNameClass("A0423I1");
    }
    private  class User {
        private  String username;
        private String password;
    }
}
