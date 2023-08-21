package CaseStudy.demo;

public class Employee {
    private String employeeCode;
        private String fullName;
        private String dateOfBirth;
        private String gender;
        private String idNumber;
        private String phoneNumber;
        private String email;
        private String qualification;
        private String position;
        private double salary;

        public Employee(String employeeCode, String fullName, String dateOfBirth, String gender, String idNumber,
                        String phoneNumber, String email, String qualification, String position, double salary) {
            this.employeeCode = employeeCode;
            this.fullName = fullName;
            this.dateOfBirth = dateOfBirth;
            this.gender = gender;
            this.idNumber = idNumber;
            this.phoneNumber = phoneNumber;
            this.email = email;
            this.qualification = qualification;
            this.position = position;
            this.salary = salary;
        }

    public String getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    // Các phương thức khác
}
