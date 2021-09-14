public class Review {

private int rid;
private String comment;
private int rating;

    public int getRid() {
        return rid;
    }

    public void setRid(int rid) {
        this.rid = rid;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public Review(int rid, String comment, int rating) {
        this.rid = rid;
        this.comment = comment;
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Review{" +
                "rid=" + rid +
                ", comment='" + comment + '\'' +
                ", rating=" + rating +
                '}';
    }
}
