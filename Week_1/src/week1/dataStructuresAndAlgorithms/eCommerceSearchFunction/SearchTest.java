package week1.dataStructuresAndAlgorithms.eCommerceSearchFunction;

public class SearchTest {
    public static void main(String[] args) {
        Product[] products = {
                new Product(105, "Shoes", "Footwear"),
                new Product(101, "T-shirt", "Clothing"),
                new Product(103, "Laptop", "Electronics"),
                new Product(102, "Watch", "Accessories"),
                new Product(104, "Phone", "Electronics")
        };

        System.out.println("🔎 Linear Search for ID 103:");
        Product linearResult = ProductSearch.linearSearch(products, 103);
        System.out.println(linearResult != null ? "Found: " + linearResult : "Product not found");

        System.out.println("\n🔎 Binary Search for ID 103:");
        ProductSearch.sortByProductId(products);
        Product binaryResult = ProductSearch.binarySearch(products, 103);
        System.out.println(binaryResult != null ? "Found: " + binaryResult : "Product not found");
    }
}

