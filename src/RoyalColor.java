public class RoyalColor {

    private String color;
    private String price;

    public RoyalColor(String color, String price) {
        this.color = color;
        this.price = price;
    }

    @Override
    public String toString() {
        return "RoyalColor{" +
                "color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}
