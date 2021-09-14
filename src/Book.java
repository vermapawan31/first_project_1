import java.util.ArrayList;

public class Book {

    private int id;
    private String author;
    private ArrayList<Review> review= new ArrayList<>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Book(int id, String author) {
        this.id = id;
        this.author = author;


    }
    public void addReview(Review review){
         this.review.add(review);
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", author='" + author + '\'' +
                ", review=" + review +
                '}';
    }
}
