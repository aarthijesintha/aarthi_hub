class Student {
    // Data members (attributes)
    String name;
    int age;
    int rollNo;

    // Constructor
    Student(String name, int age, int rollNo) {
        this.name = name;
        this.age = age;
        this.rollNo = rollNo;
    }

    // Method to display student info
    void displayInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Roll Number: " + rollNo);
    }
}

public class StudentMain {
    public static void main(String[] args) {
        // Creating a Student object
        Student s1 = new Student("Yamuna", 20, 101);

        
        s1.displayInfo();
    }
}


