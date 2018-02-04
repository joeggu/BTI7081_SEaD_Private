package composite.pattern;

public class Leaf extends Component {
    @Override
    public void operation() {
        System.out.println("is leaf");
    }
}
