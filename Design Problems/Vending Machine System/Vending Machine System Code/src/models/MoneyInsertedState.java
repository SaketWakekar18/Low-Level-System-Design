package models;

public class MoneyInsertedState implements IState {

    public VendingMachine machine;

    public MoneyInsertedState(VendingMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertAmount(VendingMachine machine, double amount) {

    }

    @Override
    public void pressButton(VendingMachine machine, int slotNumber) {
        System.out.println("Product number is entered");
        machine.setState(machine.getDispenseProductState());
    }

    @Override
    public void dispenseProduct(VendingMachine machine, int slotNumber) {

    }
}
