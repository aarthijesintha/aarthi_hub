 class Throws {
    
    // Method declares that it may throw ArithmeticException
    static int divide(int a, int b) throws ArithmeticException {
        return a / b;   // may cause divide-by-zero error
    }
    public static void main(String[] args) {
        try {
            int result = divide(10, 0);  // will cause exception
            System.out.println("Result = " + result);
        } 
        catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero: " + e.getMessage());
        }
    }
}

