import java.util.Stack;

public class LearnStack {
    public static void main(String[] args) {
        Stack<String> animals = new Stack<>();

        animals.push("Dog");
        animals.push("Cat");
        animals.push("Cow");
        animals.push("Pig");

        System.out.println(animals);
        System.out.println(animals.pop());
        System.out.println(animals);
        System.out.println(animals.peek());

        System.out.println(animals.search("Cat")); // returns position
    }
}
