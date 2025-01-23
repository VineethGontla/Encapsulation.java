
//public class Task1 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//
//	}
//
//}

public class Task1{
    // Static method with return type
    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static double divide(int a, int b) {
        if (b != 0) {
            return (double) a / b;
        }
        return 0; // Return 0 if division by 0
    }

    // Main method to test static methods
    public static void main(String[] args) {
        
        int resultAdd = Task1.add(5, 3);
        int resultSub = Task1.subtract(5, 3);
        int resultMult = Task1.multiply(5, 3);
        double resultDiv = Task1.divide(5, 3); // Static method call

        // Print the results
        System.out.println("Addition result: " + resultAdd);
        System.out.println("Subtraction result: " + resultSub);
        System.out.println("Multiplication result: " + resultMult);
        System.out.println("Division result: " + resultDiv);
    }
}

