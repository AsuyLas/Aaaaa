package Animal;

public class Test {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy");
        Cat cat = new Cat("Whiskers");

        System.out.println("Dog's paw count: " + dog.paw);

        cat.sleep();
    }
}
