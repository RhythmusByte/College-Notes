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
