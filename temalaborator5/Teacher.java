package temalaborator5;

public class Teacher extends Person {
    private String employeeId;


    public Teacher(String name, int age, String employeeId) {

        super(name, age);
        this.employeeId = employeeId;
    }


    public String getEmployeeId() {
        return employeeId;
    }


    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }
}
