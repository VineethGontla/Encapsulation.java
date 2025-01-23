public class Non_static {

    public int add(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }

    public int mult(int a, int b) {
        return a * b;
    }

    public double div(int a, int b) {
        // Cast to double to ensure the division results in a decimal value
        return (double) a / b;
    }

    public static void main(String[] args) {
        Non_static cal = new Non_static(); // Create an object of Non_static class
        System.out.println("Addition: " + cal.add(2, 3));  // Calls the add method
        System.out.println("Subtraction: " + cal.sub(5, 2));  // Calls the sub method
        System.out.println("Multiplication: " + cal.mult(5, 5));  // Calls the mult method
        System.out.println("Division: " + cal.div(5, 2));  // Calls the div method
    }
}

