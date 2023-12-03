import java.util.ArrayList;
import java.util.List;

class Product {
    private String name;
    private String color;
    private double price;

    public Product(String name, String color, double price) {
        this.name = name;
        this.color = color;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public double getPrice() {
        return price;
    }
}

public class ProductStreamsExample {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Laptop", "Silver", 1500.0));
        products.add(new Product("Phone", "Black", 800.0));
        products.add(new Product("Watch", "Gold", 300.0));

        System.out.println("All product:");
        products.forEach(product -> System.out.println(product.getName()));

        String targetColor = "Black";
        System.out.println("\nProduct with color '" + targetColor + "':");
        products.stream()
                .filter(product -> product.getColor().equals(targetColor))
                .forEach(product -> System.out.println(product.getName()));

        double minPrice = 1000.0;
        System.out.println("\nProduct with a higher price " + minPrice + ":");
        products.stream()
                .filter(product -> product.getPrice() > minPrice)
                .forEach(product -> System.out.println(product.getName()));
    }
}