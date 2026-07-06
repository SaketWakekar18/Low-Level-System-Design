public class Employee {
    private String name;
    private long empId;
    private String email;
    private long contactNumber;

    public Employee(String name, long empId, String email, long contactNumber) {
        this.name = name;
        this.empId = empId;
        this.email = email;
        this.contactNumber = contactNumber;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", empId=" + empId +
                ", email='" + email + '\'' +
                ", contactNumber=" + contactNumber +
                '}';
    }
}
