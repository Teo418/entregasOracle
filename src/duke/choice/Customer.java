package duke.choice;

public class Customer {
    private String name;
    private String size;
    private Clothing[] items;
    public void addItems(Clothing[] newItem){
        items = newItem;
    }
    public Clothing[] getItems() {
        return items;
    }
    public void getTotalClothingCost(double TAX){
        double total = 0;
        for (Clothing clothe: items){
            System.out.println("Item: " + clothe.getDescription() + " , " + clothe.getSize() + " , " + clothe.getPrice());
            total += clothe.getPrice();
        }
        System.out.println("Precio final: " + (total + (total*TAX)));
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSize() {
        return size;
    }
    public void setSize(String size) {
        this.size = size;
    }
    public void setSize(int measurement){
        switch (measurement) {
            case 1: case 2: case 3:
                size = "S";
                break;
            case 4: case 5: case 6:
                size = "M";
                break;
            case 7: case 8: case 9:
                size = "L";
                break;
            default:
                size = "X";
                break;
        }
    }
}
