import java.util.Scanner;

class Student {
  protected String name, rollNo;

  public void readStudentDetails(Scanner scanner) {
    System.out.print("Enter student name: ");
    name = scanner.nextLine();
    System.out.print("Enter roll number: ");
    rollNo = scanner.nextLine();
  }

  public void displayStudentDetails() {
    System.out.println("Name: " + name);
    System.out.println("Roll No: " + rollNo);
  }
}

class Mark extends Student {
  private int[] marks = new int[5];
  private int total;
  private double average;

  public void readMarks(Scanner scanner) {
    total = 0;
    System.out.println("Enter marks for 5 subjects:");
    for (int i = 0; i < 5; i++) {
      marks[i] = scanner.nextInt();
      total += marks[i];
    }
    average = total / 5.0;
  }

  public void displayResult() {
    displayStudentDetails();
    System.out.println("Total Marks: " + total);
    System.out.println("Average Marks: " + average);
  }
}

public class StudentResult {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Mark student = new Mark();
    student.readStudentDetails(scanner);
    student.readMarks(scanner);
    student.displayResult();
  }
}
