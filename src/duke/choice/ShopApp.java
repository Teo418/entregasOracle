package duke.choice;

public class ShopApp {
    public static void main(String[] args) {
        double tax = 0.2;
        System.out.println("Bienvenido a la tienda Duke Choice!");
        Customer c1 = new Customer();
        c1.name = "Pinky";
        System.out.println("Nombre del comprador: " + c1.name);
        Clothing item1 = new Clothing();
        Clothing item2 = new Clothing();
        item1.description = "Blue Jacket";
        item1.price = 20.9;
        item2.description = "Orange T-Shirt";
        item2.price = 10.5;
        item2.size = "S";
        System.out.println("Item 1: " + item1.description + " , " + item1.size + " , " + item1.price);
        System.out.println("Item 2: " + item2.description + " , " + item2.size + " , " + item2.price);
        double total = (item1.price + (item2.price * 2)) * (1+tax);
        System.out.println("Precio total: " + total);
    }
}
