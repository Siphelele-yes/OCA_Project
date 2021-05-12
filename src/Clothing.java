public class Clothing implements Comparable<Clothing>{
    private double price;
    private String description ;
    private String size;
    public static final double min_price = 10;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = (price < min_price ? min_price : price);
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return getDescription()+ " "+ getSize()+ " R" + getPrice();

    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public Clothing(double price, String description, String size) {
        setPrice(price);
        this.description = description;
        this.size = size;
    }

    public Clothing(double price, String description) {
        this.price = price;
        this.description = description;
        this.size = "M";
    }

    @Override
    public int compareTo(Clothing o) {
        return this.getDescription().compareTo(o.description);
    }
}
