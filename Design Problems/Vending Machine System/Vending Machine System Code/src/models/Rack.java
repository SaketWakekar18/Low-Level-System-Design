package models;

import java.util.List;

public class Rack {
    private int rackId;
    private List<Slot> slots;

    public int getRackId() {
        return rackId;
    }

    public void setRackId(int rackId) {
        this.rackId = rackId;
    }

    public List<Slot> getSlots() {
        return slots;
    }

    public void setSlots(List<Slot> slots) {
        this.slots = slots;
    }

    public void addProduct(Product product, Slot slotId) {

    }

    public void removeProduct(Product product, Slot slotId) {

    }
}
