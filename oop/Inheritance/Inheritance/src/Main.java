public class Main {

    public static class Animal {
        private boolean alive = true;

        void eat() {
            System.out.println("This animal is eating");
        }

        boolean isAlive() {
            return alive;
        }
    }

    public static void main(String[] args) {
        Rabbit rabbit = new Rabbit();
        Bird bird = new Bird();

        rabbit.eat(); rabbit.hop();

        System.out.println("bird alive: " + bird.isAlive()); bird.fly();
    }

    static class Rabbit extends Animal {
        void hop() {
            System.err.println("Rabbit is hopping");
        }
    }

    static class Bird extends Animal {
        void fly() {
            System.err.println("Bird is flying");
        }
    }
}
