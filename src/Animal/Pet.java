package Animal;

class Pet extends Animal {
    String name;
    int tail = 1;
    int paw = 4;

    Pet() {
        System.out.println("I am pet");
        eyes = 2;
    }

    void run() {
        System.out.println("Pet runs");
    }

    void jump() {
        System.out.println("Pet runs and jumps");
    }
}
