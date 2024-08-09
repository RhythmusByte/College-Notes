import java.util.*;

public class Student {
    String name;
    int rollNo;
    String program;
    double percentage;
    int mark1;
    int mark2;
    int mark3;

    public Student(String name, int rollNo, String program, int mark1, int mark2, int mark3) {
        this.name = name;
        this.rollNo = rollNo;
        this.program = program;
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
        this.percentage = calculatePercentage();
    }

    double calculatePercentage() {
        int totalMarks = mark1 + mark2 + mark3;
        return (totalMarks / 3.0);
    }

    void studentDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Program: " + program);
        System.out.println("Mark1: " + mark1);
        System.out.println("Mark2: " + mark2);
        System.out.println("Mark3: " + mark3);
        System.out.println("Percentage: " + percentage + "%");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Student student1 = getStudentDetails(scanner, "Student1");
        Student student2 = getStudentDetails(scanner, "Student2");

        student1.studentDetails();
        System.out.println("\n\n-----------------------\n\n");
        student2.studentDetails();

        scanner.close();
    }

    private static Student getStudentDetails(Scanner scanner, String studentNumber) {
        System.out.println("Enter the name of " + studentNumber + ": ");
        String name = scanner.nextLine();
        System.out.println("Enter the Roll No of " + name + ": ");
        int rollNo = scanner.nextInt();
        scanner.nextLine(); 
        System.out.println("Enter the program: ");
        String program = scanner.nextLine();
        System.out.println("Enter the mark 1:");
        int mark1 = scanner.nextInt();
        System.out.println("Enter the mark 2:");
        int mark2 = scanner.nextInt();
        System.out.println("Enter the mark 3:");
        int mark3 = scanner.nextInt();
        scanner.nextLine();

        return new Student(name, rollNo, program, mark1, mark2, mark3);
    }
}
