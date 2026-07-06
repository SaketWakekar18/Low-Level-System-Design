import java.util.HashMap;
import java.util.Map;

public class PenFactory {
    private static final Map<String, Pen> pen = new HashMap<>();

    public static Pen getPen(String color) {
        if (!pen.containsKey(color)) {
            pen.put(color, new Pen(color));
        }
        return pen.get(color);
    }
}
