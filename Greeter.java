public class Greeter {
    public static void main(String[] args) {
        // Requirement: Default greeting if no arguments provided
        if (args.length == 0) {
            System.out.println("Hello, World!");
            return;
        }

        StringBuilder names = new StringBuilder();
        
        // Requirement: Use enhanced for loop to process names
        for (String name : args) {
            names.append(name).append(", ");
        }

        // Requirement: Use substring to remove the trailing delimiter (", ")
        // We take the string from index 0 to (total length - 2)
        String finalNames = names.toString().substring(0, names.length() - 2);

        System.out.println("Hello, " + finalNames + "!");
    }
}