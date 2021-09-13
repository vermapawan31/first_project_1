public class StudentMarks {

    public static void main(String[] args) {
        int [] marks={80,60,71,99};
        Student stu= new Student("pawan",marks);
        System.out.println(stu.numberOfMarks());
        System.out.println(stu.sumOfMarks());
        System.out.println(stu.maxMarks());
        System.out.println(stu.minMarks());
        System.out.println(stu.averageMarks());

    }
}
