package models;

public class NoMoneyInsertedState implements IState{

    public VendingMachine machine;

    public NoMoneyInsertedState(VendingMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertAmount(VendingMachine machine, double amount) {
        System.out.println("Amount is inserted");
        machine.setState(machine.getMoneyInsertedState());
    }

    @Override
    public void pressButton(VendingMachine machine, int slotNumber) {

    }

    @Override
    public void dispenseProduct(VendingMachine machine, int slotNumber) {

    }
}
