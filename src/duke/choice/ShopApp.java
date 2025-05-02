package duke.choice;

public class ShopApp {
    public static void main(String[] args) {
        double total = 0.0;
        double tax = 0.2;
        int measurement = 3;
        System.out.println("Bienvenido a la tienda Duke Choice!");
        Customer c1 = new Customer();
        c1.name = "Pinky";
        c1.size = "S";
        System.out.println("Nombre del comprador: " + c1.name);
        Clothing item1 = new Clothing();
        Clothing item2 = new Clothing();
        Clothing item3 = new Clothing();
        Clothing item4 = new Clothing();
        item1.description = "Blue Jacket";
        item1.price = 20.9;
        item2.description = "Orange T-Shirt";
        item2.price = 10.5;
        item2.size = "S";
        item3.description = "Green Scarf";
        item3.price = 5;
        item3.size = "S";
        item4.description = "Blue T-Shirt";
        item4.price = 10.5;
        item4.size = "S";
        Clothing[] stock = {item1, item2, item3, item4};
        /*
        System.out.println("Item 1: " + item1.description + " , " + item1.size + " , " + item1.price);
        System.out.println("Item 2: " + item2.description + " , " + item2.size + " , " + item2.price);
        */
        for (Clothing clothe: stock){
            if(total > 15){
                break;
            }
            if(clothe.size.equals(c1.size)){
                System.out.println("Item: " + clothe.description + " , " + clothe.size + " , " + clothe.price);
                total += clothe.price;
            }
        }
        total = total * (1+tax);
        // total = (item1.price + (item2.price * 2)) * (1+tax);
        System.out.println("Precio total: " + total);
        switch (measurement) {
            case 1: case 2: case 3:
                c1.size = "S";
                break;
            case 4: case 5: case 6:
                c1.size = "M";
                break;
            case 7: case 8: case 9:
                c1.size = "L";
                break;
            default:
                c1.size = "X";
                break;
        }
    }
}
