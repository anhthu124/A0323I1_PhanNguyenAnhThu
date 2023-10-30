package baiThi.model;

public  abstract class Person {
    private int code;
    private String name;
    private String dateOfBirth;
    private  String isMale;
    private int telephoneNumber;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getIsMale() {
        return isMale;
    }

    public void setIsMale(String isMale) {
        this.isMale= isMale;
    }


    public int getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(int telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public Person() {
    }

    public Person(int code, String name, String dateOfBirth, String isMale, int telephoneNumber) {
        this.code = code;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.isMale = isMale;
        this.telephoneNumber = telephoneNumber;
    }
}
