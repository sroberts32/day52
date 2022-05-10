package day52.Product.src;

public class Product {
    private String product;
    private double cost;
    private double quantity;

    public Product(String productName, double productCost, double productQuantity) {
        this.product = productName;
        this.cost = productCost;
        this.quantity = productQuantity;
    }

    public void totalCost() {
        System.out.println("Total cost is $" + (cost * quantity));
    }

    public void printProduct() {
        System.out.println(product + " costs $" + cost + " and " + quantity + " units were purchased.");
    }
}
