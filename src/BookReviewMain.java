import java.util.ArrayList;

public class BookReviewMain {
    public static void main(String[] args) {

//Review review= new Review(11,"cool",7);
        Review r1=new Review(1, "cool",8);
        Review r2=new Review(4, "awesome",4);
        Book book = new Book(1, "pawan");
        book.addReview(r1);
        book.addReview(r2);
        System.out.println(book);
    }
}