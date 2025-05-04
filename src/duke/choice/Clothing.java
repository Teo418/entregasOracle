package duke.choice;

public class Clothing {
    private String description;
    private double price;
    private String size;
    public static double MIN_PRICE = 10;
    public static double TAX = 0.2;

    public Clothing(String description, double price, String size) {
        this.description = description;
        this.price = price;
        this.size = size;
    }

    public double getMIN_PRICE() {
        return MIN_PRICE;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public double getPrice() {
        return price * (1 + TAX);
    }
    public void setPrice(double price) {
        if (price >= MIN_PRICE) {
            this.price = price;
        }
        else{
            System.out.println("Precio menor a 10");
        }
    }
    public String getSize() {
        return size;
    }
    public void setSize(String size) {
        this.size = size;
    }
}
