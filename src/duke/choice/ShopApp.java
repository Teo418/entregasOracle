package duke.choice;

public class ShopApp {
    public static void main(String[] args) {
        System.out.println("Bienvenido a la tienda Duke Choice!");
        Customer c1 = new Customer();
        c1.name = "Pinky";
        System.out.println("Nombre del comprador: " + c1.name);
    }
}
