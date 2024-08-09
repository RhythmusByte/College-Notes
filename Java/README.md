## Java Classes
The fundamental idea behind **OOP** languages is combining both data and functions that operate on that data into a single unit called a class. An object, which is an instance of a class, provides methods that allow interaction with its data.

> Get program files that are shown in this note from [here](Programs).

### Key Elements of a Class
- **Class Name:** The name of the class.
- **Instance Variables:** Variables that hold data specific to an object.
- **Methods:** Functions that operate on the data of the object.

---

## General Form of a Class
```java
class ClassName {
    datatype instanceVariable;
    
    type methodName(parameter) {
        // body;
    }
}
```

---

## Sample Programs

### 1. Finding the Volume of a Box

**Class Structure:**
- **Class Name:** `Box`
- **Instance Variables:** `height`, `width`, `depth`
- **Method:** `volume()`

**Source Code:**
```java
class Box {
    double height;
    double width;
    double depth;

    double volume() {
        return height * width * depth;
    }
}

public class Main {
    public static void main(String[] args) {
        Box sampleBox = new Box();
        sampleBox.height = 5;
        sampleBox.width = 8;
        sampleBox.depth = 3;
        double volume = sampleBox.volume();

        System.out.println("Volume of the box: " + volume);
    }
}
```
**Output:**
```
Volume of the box: 120.0
```

---

### 2. Bank Account Operations

**Class Structure:**
- **Class Name:** `Acc`
- **Instance Variables:** `accId`, `accBal`
- **Methods:** `withdraw()`, `deposit()`, `getBal()`, `getId()`

**Source Code:**
```java
class Acc {
    int accId;
    double accBal;

    Acc(int id, double accBal) {
        this.accId = id;
        this.accBal = accBal;
    }

    void withdraw(double amt) {
        accBal -= amt;
        System.out.println("Rs. " + amt + " Withdrawn Successfully");
    }

    void deposit(double amt) {
        accBal += amt;
        System.out.println("Rs. " + amt + " Deposited Successfully");
    }

    double getBal() {
        return accBal;
    }

    int getId() {
        return accId;
    }
}

public class AccInfo {
    public static void main(String[] args) {
        Acc acc1 = new Acc(101, 50000);
        System.out.println("Acc Id: " + acc1.getId() + " Current Bal: Rs. " + acc1.getBal());
        acc1.deposit(1000);
        System.out.println("Acc Id: " + acc1.getId() + " Current Bal: Rs. " + acc1.getBal());
        acc1.withdraw(500);
        System.out.println("Acc Id: " + acc1.getId() + " Current Bal: Rs. " + acc1.getBal());

        System.out.println("\n\n------------------\n\n");

        Acc acc2 = new Acc(202, 1000);
        System.out.println("Acc Id: " + acc2.getId() + " Current Bal: Rs. " + acc2.getBal());
        acc2.deposit(100000);
        acc2.withdraw(20000);
        System.out.println("Acc Id: " + acc2.getId() + " Current Bal: Rs. " + acc2.getBal());

        System.out.println("\n\n------------------\n\n");

        Acc acc3 = new Acc(303, 12);
        System.out.println("Acc Id: " + acc3.getId() + " Current Balance: Rs. " + acc3.getBal());
        acc3.deposit(500);
        acc3.withdraw(12);
        System.out.println("Acc Id: " + acc3.getId() + " Current Balance: Rs. " + acc3.getBal());
    }
}
```
**Output:**
```
Acc Id: 101 Current Bal: Rs. 50000.0
Rs. 1000.0 Deposited Successfully
Acc Id: 101 Current Bal: Rs. 51000.0
Rs. 500.0 Withdrawn Successfully
Acc Id: 101 Current Bal: Rs. 50500.0


------------------


Acc Id: 202 Current Bal: Rs. 1000.0
Rs. 100000.0 Deposited Successfully
Rs. 20000.0 Withdrawn Successfully
Acc Id: 202 Current Bal: Rs. 81000.0


------------------


Acc Id: 303 Current Balance: Rs. 12.0
Rs. 500.0 Deposited Successfully
Rs. 12.0 Withdrawn Successfully
Acc Id: 303 Current Balance: Rs. 500.0
```

---

## User Input

To take user input, we need to import the `java.util.Scanner` package.

**Example:**
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a num: ");
        int num = scanner.nextInt();
        System.out.println("Entered num is " + num + ".");
    }
}
```
**Output:**
```
Enter a num: 
5
Entered num is 5.
```

---

### 3. Student Class

**Class Structure:**
- **Class Name:** `Student`
- **Instance Variables:** `name`, `rollNo`, `program`, `percentage`, `mark1`, `mark2`, `mark3`
- **Methods:** `calculatePercentage()`, `studentDetails()`

**Source Code:**
```java
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
```
**Output:**
```
Enter the name of Student1: 
Alice
Enter the Roll No of Alice: 
1
Enter the program: 
BSc Computer Science
Enter the mark 1:
85
Enter the mark 2:
90
Enter the mark 3:
88
Enter the name of Student2: 
Bob
Enter the Roll No of Bob: 
2
Enter the program: 
BSc Mathematics
Enter the mark 1:
75
Enter the mark 2:
80
Enter the mark 3:
78
Student Name: Alice
Roll No: 1
Program: BSc Computer Science
Mark1: 85
Mark2: 90
Mark3: 88
Percentage: 87.66666666666667%


-----------------------


Student Name: Bob
Roll No: 2
Program: BSc Mathematics
Mark1: 75
Mark2: 80
Mark3: 78
Percentage: 77.66666666666667%
```

---

## Static Variable in Java

Static variables are shared among all instances of a class. They are initialized only once at the start of the execution.

**Example:**
```java
public class Counter {
    static int count;

    Counter() {
        count++;
    }

    public static void main(String[] args) {
        Counter obj1 = new Counter();
        System.out.println("

Count after creating obj1: " + obj1.count);
        Counter obj2 = new Counter();
        System.out.println("Count after creating obj2: " + obj2.count);
        System.out.println("Count accessed via class name: " + Counter.count);
    }
}
```
**Output:**
```
Count after creating obj1: 1
Count after creating obj2: 2
Count accessed via class name: 2
```

---

## Main Method

Methods declared as static have certain restrictions:
- They can only call other static methods.
- They can only access static data.
- They cannot refer to `this` or `super`.
- A static block can be used to initialize static variables.

---

## `final` Keyword

In Java, the `final` keyword is used to define constants, similar to `const` in JavaScript.

---

## Passing Objects as Arguments

**Example:**
```java
class ObjectArg {
    int num;

    ObjectArg(int n) {
        num = n;
    }

    void dec(ObjectArg g) {
        g.num = g.num - 1;
    }
}

public class Main {
    public static void main(String[] args) {
        ObjectArg obj1 = new ObjectArg(25);
        ObjectArg obj2 = new ObjectArg(35);
        obj1.dec(obj2);
        System.out.println("Value of obj2.num after decrement: " + obj2.num);
    }
}
```
**Output:**
```
Value of obj2.num after decrement: 34
```

---

## Command Line Arguments 

📚 In Java, command line arguments are input parameters that are passed to the main method at runtime. 
> Here's an example:

```java
public class Main {
    public static void main(String[] args) {
        if (args.length > 0) {
            String arg1 = args[0];
            int arg2 = Integer.parseInt(args[1]);
            System.out.println("Argument 1: " + arg1);
            System.out.println("Argument 2: " + arg2);
        }
    }
}
```

In this example, `args[0]` is a string argument and `args[1]` is an integer argument. You can pass these when running the Java program:

```bash
java Main "Hello" 123
```

This will output:

```
Argument 1: Hello
Argument 2: 123
```

---

- **Example**

```java
class Main {
    public static void main(String[] args) {
        String i = args[0];
        String j = args[1];
        String k = args[2];
        int x = Integer.parseInt(i);
        int y = Integer.parseInt(j);
        int z = Integer.parseInt(k);
        int l = x + y;
        int m = l - x;
        System.out.println("The l is " + l);
        System.out.println("The m is " + m);
    }
}
```

📚 The `main` method accepts command line arguments stored in the `args` array. The program expects three arguments, `args[0]`, `args[1]`, and `args[2]`, to be strings. It then converts them into integers `x`, `y`, and `z`. The program calculates `l` as their sum and `m` as the difference between `l` and `x`.

To run this program with command line arguments, use the following command:

```bash
java Main 5 10 3
```

This will output:

```
The l is 18
The m is 13
```

Here, `5`, `10`, and `3` are the command line arguments provided to the Java program.

---
