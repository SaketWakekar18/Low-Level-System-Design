package models;

public interface IState {
    void insertAmount(VendingMachine machine, double amount);

    void pressButton(VendingMachine machine, int slotNumber);

    void dispenseProduct(VendingMachine machine, int slotNumber);
}
