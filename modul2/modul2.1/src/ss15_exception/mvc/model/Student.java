package ss15.mvc.model;

public class Student extends Person {
    private String codeClass;

    public Student() {
    }

    public String getCodeClass() {
        return codeClass;
    }

    public void setCodeClass(String codeClass) {
        this.codeClass = codeClass;
    }

    public Student(String codeClass) {
        this.codeClass = codeClass;
    }

    public Student(int code, String name, String dateOfBirth, String isMale, int telephoneNumber, String codeClass) {
        super(code, name, dateOfBirth, isMale, telephoneNumber);
        this.codeClass = codeClass;
    }

    public String toString() {
        return "Mã: " + super.getCode() + ", Tên: " + super.getName() + ",Ngày sinh:" + super.getDateOfBirth() + ",Giới tính: " + super.getIsMale();
    }
}
