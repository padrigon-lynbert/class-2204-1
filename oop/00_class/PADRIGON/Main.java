public class Main {
    public static void main(String[] args) {
        
        Sub sub = new Sub(); sub.Method1();

        System.out.println("Sum: " + sub.Sum(5, 5));

        Sub.Methdo3();

        String namePrompt = "myName";
        sub.Method4(namePrompt);

        String lname = "Padrigon"; String sec = "BSIT 2204"; 
        sub.exe(lname, sec);
    }
    
}