public class HelloApp {
    public static void main(String[] args) {
        
        // Check if arguments are passed
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            // Join all names with comma and space
            String names = String.join(", ", args);
            System.out.println("Hello, " + names + "!");
        }
    }
}