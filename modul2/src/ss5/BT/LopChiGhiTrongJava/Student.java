package ss5.BT.LopChiGhiTrongJava;

public class Student {
    private String name;
    private String classes;

    Student() {
        this.name = "John";
        this.classes = "CO2";
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClasses() {
        return this.classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }
}
