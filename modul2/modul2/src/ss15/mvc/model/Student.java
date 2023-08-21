package ss15.mvc.model;

public class Student extends Person {
    private int codeClass;

    public Student() {
    }


    public int getCodeClass() {
        return codeClass;
    }

    public void setCodeClass(int codeClass) {
        this.codeClass = codeClass;
    }

    public Student(int i, String s, String s1, String s2, String s3, String s4) {
    }

    public Student(double grade) {
        this.codeClass = getCodeClass();
    }

    public Student(int code, String name, String dateOfBirth, String isMale, int telephoneNumber) {
        super(code, name, dateOfBirth, isMale, telephoneNumber);
        this.codeClass = getCodeClass();
    }

    public String toString() {
        return "Mã: " + super.getCode() + ", Tên: " + super.getName() + ",Ngày sinh:" + super.getDateOfBirth() + ",Giới tính: " + super.getIsMale();
    }
}
