public class Overload {

    void display() {
        System.out.println("No parameters");
    }

    void display(int a) {
        System.out.println("Integer: " + a);
    }

    void display(String b) {
        System.out.println("String: " + b);
    }

    public static void main(String[] args) {
        Overload obj = new Overload();

        obj.display();          // Calls display()
        obj.display(10);        // Calls display(int)
        obj.display("Hello");   // Calls display(String)
    }
}


