package models;

public class DispenseProductState implements IState {

    public VendingMachine machine;

    public DispenseProductState(VendingMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertAmount(VendingMachine machine, double amount) {

    }

    @Override
    public void pressButton(VendingMachine machine, int slotNumber) {

    }

    @Override
    public void dispenseProduct(VendingMachine machine, int slotNumber) {
        System.out.println("Product is selected");
        machine.setState(machine.getNoMoneyInsertedState());
    }
}
