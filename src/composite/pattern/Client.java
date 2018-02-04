package composite.pattern;

public class Client {
    public static void main(String[] args) {
        Composite root = new Composite();
        root.add(new Leaf());
        root.add(new Leaf());

        Composite other = new Composite();
        other.add(new Leaf());
        other.add(new Leaf());
        other.add(new Leaf());

        root.operation();
        other.operation();
    }
}
