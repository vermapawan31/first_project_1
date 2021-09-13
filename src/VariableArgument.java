
import java.util.Arrays;

public class VariableArgument {

    static void method1(int... values) {
        System.out.println(Arrays.toString(values));

    }
    static void sum1(int... value1){
       int sum=0;
        for(int i:value1){
            sum=sum+i;
        }
        System.out.println("sum is "+ sum);
    }

    public static void main(String[] args) {
        method1(1, 3);
        sum1(1, 2, 3, 4, 5, 6, 7);

    }
}
