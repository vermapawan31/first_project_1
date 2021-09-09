import java.util.Arrays;

public class LearnArray {


    public static void main(String[] args) {
        int[] marks = {80, 90, 70};
        int[] marks1={70,70,70};
        System.out.println(marks[1]);
        int sum = 0;
        for (int x : marks) {
            sum = sum + x;
        }
        System.out.println(sum);
        Arrays.sort(marks);
        System.out.println("sorted array: "+ Arrays.toString(marks));
        Arrays.fill(marks,100);
        System.out.println("replaced array: "+Arrays.toString(marks));
        System.out.println(marks1[1]==marks[2]);
    }


}
