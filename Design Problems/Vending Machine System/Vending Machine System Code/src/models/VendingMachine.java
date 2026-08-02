package models;

import java.util.List;

public class VendingMachine {
    NoMoneyInsertedState noMoneyInsertedState = new NoMoneyInsertedState(this);
    MoneyInsertedState moneyInsertedState = new MoneyInsertedState(this);
    DispenseProductState dispenseProductState = new DispenseProductState(this);

    private IState state;
    private int id;
    private List<Rack> racks;
    private double insertedAmount;
    private double collectedAmount;

    private static VendingMachine vendingMachineInstance = null;

    private VendingMachine() {

    }

    public void setState(IState state) {
        this.state = state;
    }

    public NoMoneyInsertedState getNoMoneyInsertedState() {
        return noMoneyInsertedState;
    }

    public MoneyInsertedState getMoneyInsertedState() {
        return moneyInsertedState;
    }

    public DispenseProductState getDispenseProductState() {
        return dispenseProductState;
    }

    public Product searchProduct(int slotId) {
        return null;
    }

    public Product selectProduct(int slotId) {
        return null;
    }

    public Product dispenseProduct(int slotId) {
        return null;
    }

    public void returnChange(double amount) {

    }

    public void showErrorMessage(String message) {

    }

    public void updateInventory(int slotId) {

    }

    public void addAdmin(Admin admin) {

    }

    public void removeAdmin(Admin admin) {

    }

    public boolean validateAdmin(int adminId) {
        return false;
    }

    public void openCashDispenser() {

    }

    private static class VendingMachineHolder {
        private static final VendingMachine INSTANCE = new VendingMachine();
    }

    public static VendingMachine getInstance() {
        return VendingMachineHolder.INSTANCE;
    }

}
