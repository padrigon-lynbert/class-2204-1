public class Main {
    public static void main(String[] args) throws Exception {
        // Main main = new Main();
        // main.run();

        dragon baby_dragon = new dragon();

        baby_dragon.location();
        
    }


    static class dragon extends Animal
    {
        public void location()
        {
            System.out.println("volcano");
        }
    }
}
