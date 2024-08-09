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
