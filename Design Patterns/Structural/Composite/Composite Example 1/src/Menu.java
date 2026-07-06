import java.util.ArrayList;
import java.util.List;

public class Menu implements UiComponent{

    List<UiComponent> list = new ArrayList<>();

    @Override
    public void draw() {
        for(UiComponent cmp: list){
            cmp.draw();
        }
    }

    @Override
    public void add(UiComponent uiComponent) {
        list.add(uiComponent);
    }

    @Override
    public void remove(UiComponent uiComponent) {
        list.remove(uiComponent);
    }
}
