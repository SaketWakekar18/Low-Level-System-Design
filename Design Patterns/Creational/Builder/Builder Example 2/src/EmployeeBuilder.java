class EmployeeBuilder {
    private String name;
    private long empId;
    private String email;
    private long contactNumber;

    public EmployeeBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public EmployeeBuilder setEmpId(long empId) {
        this.empId = empId;
        return this;
    }

    public EmployeeBuilder setEmail(String email) {
        this.email = email;
        return this;
    }

    public EmployeeBuilder setContactNumber(long contactNumber) {
        this.contactNumber = contactNumber;
        return this;
    }

    public Employee build(){
        return new Employee(name, empId, email, contactNumber);
    }

}
