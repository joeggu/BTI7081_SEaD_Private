package composite.pattern;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component {

    private List<Component> childComponents = new ArrayList<Component>();

    @Override
    public void add(Component component){
        childComponents.add(component);
    }

    @Override
    public void remove(Component component){
        childComponents.remove(component);
    }

    @Override
    public Component getChild(int index){
        return childComponents.get(index);
    }

    @Override
    public void operation() {
        System.out.println("is composite - Leaf's are:");
        for (Component child : childComponents) {
            child.operation();
        }
    }
}
