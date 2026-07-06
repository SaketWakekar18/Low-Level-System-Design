public class Main {
    public static void main(String[] args) {
        Employee emp = new EmployeeBuilder()
                .setName("Saket Wakekar")
                .setEmpId(12322788)
                .setEmail("saket@gmail.com")
                .setContactNumber(1234543212L)
                .build();

        System.out.println(emp);
    }
}