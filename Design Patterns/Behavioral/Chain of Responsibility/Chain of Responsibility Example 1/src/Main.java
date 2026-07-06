public class Main {
    public static void main(String[] args) {
        Approver director = new Director(null);
        Approver manager = new Manager(director);
        Approver hr = new HR(manager);
        hr.approve(8);
    }
}