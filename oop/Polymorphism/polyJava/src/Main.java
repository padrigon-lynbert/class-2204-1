public class Main 
{
    public static void main(String[] args) {
        Animal myAnimal = new Animal();  
        Animal Lion = new Lion(); 
        Animal Buffalo = new Buffalo(); 

        myAnimal.running_speed();
        Lion.running_speed();
        Buffalo.running_speed();
    }

    public static class Animal {
        public void running_speed() {
        System.out.println("ull");
        }
    }
    
    static class Lion extends Animal {
        public void running_speed() {
        System.out.println("Lion is running 50mph");
        }
    }
    
    static class Buffalo extends Animal {
        public void running_speed() {
        System.out.println("Buffalo is running 35mph");
        }
    }


}