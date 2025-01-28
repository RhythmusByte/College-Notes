class ObjectCounter {
  static int count = 0;

  public ObjectCounter() {
    count++;
  }

  public static void displayCount() {
    System.out.println("Total objects created: " + count);
  }
}

public class CountObjects {
  public static void main(String[] args) {
    new ObjectCounter();
    new ObjectCounter();
    new ObjectCounter();
    ObjectCounter.displayCount();
  }
}
