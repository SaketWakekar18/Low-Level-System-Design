package interfaces;

public abstract class Button {
    private boolean status;

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public abstract void press();

    public abstract void isPressed();
}
