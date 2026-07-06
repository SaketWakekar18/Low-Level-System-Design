import java.util.ArrayList;
import java.util.List;

public class Panel {
    List<Command> cmd = new ArrayList<>();

    public Panel() {

    }

    public void setCmd(int index, Command cmd) {
        while (this.cmd.size() <= index) {
            this.cmd.add(null);
        }
        this.cmd.set(index, cmd);
    }

    public void upliftSuspension() {
        cmd.get(0).execute();
    }

    public void applyBrake() {
        cmd.get(1).execute();
    }
}
