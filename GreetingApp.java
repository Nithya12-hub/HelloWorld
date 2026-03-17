public class GreetingApp {
    public static void main(String[] args) {
        // Check if any arguments were provided
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            // UC5: Using an enhanced for-loop (for-each) to process names
            for (String name : args) {
                System.out.println("Hello, " + name + "!");
            }
        }
    }
}