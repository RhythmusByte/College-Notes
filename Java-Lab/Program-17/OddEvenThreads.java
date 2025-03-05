class OddNumbers implements Runnable {
    int limit;

    OddNumbers(int limit) {
        this.limit = limit;
    }

    @Override
    public void run() {
        for (int i = 1; i <= limit; i++) {
            if (i % 2 != 0) {
                System.out.println("Odd: " + i);
            }
        }
    }
}

class EvenNumbers implements Runnable {
    int limit;

    EvenNumbers(int limit) {
        this.limit = limit;
    }

    @Override
    public void run() {
        for (int i = 1; i <= limit; i++) {
            if (i % 2 == 0) {
                System.out.println("Even: " + i);
            }
        }
    }
}

public class OddEvenThreads {
    public static void main(String[] args) {
        int limit = 5;
        Thread oddThread = new Thread(new OddNumbers(limit));
        Thread evenThread = new Thread(new EvenNumbers(limit));

        oddThread.start();
        evenThread.start();
    }
}
