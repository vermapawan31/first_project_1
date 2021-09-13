import java.math.BigDecimal;
import java.util.Arrays;

public class Student {

    String name;
    int[] marks;

    public Student(String name, int[] marks) {
        this.marks = marks;
        this.name = name;
    }

    int numberOfMarks() {
        return marks.length;
    }

    int sumOfMarks() {
        int sum = 0;

        for (int mark : marks) {
            sum = sum + mark;
        }
        return sum;

    }

    int maxMarks() {
        int max = 0;
        for (int mark : marks) {
            if (mark > max) {
                max = mark;
            }
        }
        return max;
    }

    int minMarks() {

        int min = 100;
        for (int mark : marks) {
            if (mark < min) {
                min = mark;
            }
        }
        return min;

    }

    double averageMarks() {
        int s = sumOfMarks();
        return s / marks.length;
    }
}

