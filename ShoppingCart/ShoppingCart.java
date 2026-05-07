package ShoppingCart;

class Product {
    private int id;
    private String name;
    private int price;

    Product(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int productId() {
        return id;
    }

    public int getPrice(){
        return price;
    }

    public void displayProduct() {
        System.out.println("Id : " + id);
        System.out.println("Name : " + name);
        System.out.println("Price : " + price);
    }
}

class Customer {
    private int customerId;
    private String name;

    Customer(int customerId, String name) {
        this.customerId = customerId;
        this.name = name;
    }

    public void displayCustomerDetails() {
        System.out.println("Customer ID : " + customerId);
        System.out.println("Name : " + name);
    }
}

class Cart {
    Product[] products = new Product[10];
    int count = 0;

    public void addProduct(Product p) {
        if (count < products.length) {
            products[count] = p;
            count++;
        } else {
            System.out.println("Cart is full");
        }
    }

    public void viewCart() {
        if (count == 0) {
            System.out.println("Cart is empty");
        } else {
            for (int i = 0; i < count; i++) {
                products[i].displayProduct();
                System.out.println();
            }
        }
    }

    public void removeProduct(int id){
        for(int i = 0;i < count; i++){
            if(products[i].productId() == id){
               for(int j = i;j < count-1;j++){
                products[j] = products[j+1];
               } 
               count--;

               System.out.println("Removed product");
               System.out.println();
               return;
            }
        }
        System.out.println("ID not found");
    }

    public void calculateTotal(){
        int total = 0;
        for(int i = 0;i < count;i++){
            total += products[i].getPrice();
        }
        System.out.println("Total price of products : " + total);
    }
}

public class ShoppingCart {

    public static void main(String[] args) {
        Product p1 = new Product(1, "Shoe", 1700);
        Product p2 = new Product(2, "Shirt", 1000);
        Product p3 = new Product(3, "Jeans", 1500);
        Product p4 = new Product(4, "Slipper", 1100);
        Product p5 = new Product(5, "Belt", 700);

        Cart c = new Cart();
        c.addProduct(p1);
        c.addProduct(p2);
        c.addProduct(p3);
        c.addProduct(p4);
        c.addProduct(p5);

        c.viewCart();
        c.removeProduct(3);
        c.viewCart();
        c.calculateTotal();
    }
}