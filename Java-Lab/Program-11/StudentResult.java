import java.util.Scanner;

class Student {
  public String name, rollNo;

  public void readStudentDetails(Scanner sc) {
    System.out.print("Enter student name: ");
    name = sc.nextLine();
    System.out.print("Enter roll number: ");
    rollNo = sc.nextLine();
  }

  public void displayStudentDetails() {
    System.out.println("\nName: " + name);
    System.out.println("Roll No: " + rollNo);
  }
}

class Mark extends Student {
  private int[] marks = new int[5];
  private int total;
  private double average;

  public void readMarks(Scanner sc) {
    total = 0;
    System.out.print("\nEnter marks for 5 subjects:");
    for (int i = 0; i < 5; i++) {
      marks[i] = sc.nextInt();
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
    Scanner sc = new Scanner(System.in);
    Mark student = new Mark();
    student.readStudentDetails(sc);
    student.readMarks(sc);
    student.displayResult();
  }
}
