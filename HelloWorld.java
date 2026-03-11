public class HelloWorld {

    public static void main(String[] args) {

        String name;

        // Check if user provided command line argument
        if (args.length > 0) {
            name = args[0];
        } else {
            name = "World";
        }

        System.out.println("Hello " + name);
    }
}