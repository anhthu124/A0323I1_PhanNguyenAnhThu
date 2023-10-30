package btMVC.model;

public class Student extends Person {
    private double grade;

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }
 public Student(){

 }
    public Student(int code, String name, String dateOfBirth, double grade) {
        super(code, name, dateOfBirth);
        this.grade = grade;
    }
public String toString(){
        return "Mã: "+super.getCode()+", Tên: "+super.getName()+", ngày sinh: "+super.getDateOfBirth()+", điểm: "+grade;
}

}
