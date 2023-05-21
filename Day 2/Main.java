// package Telusko.Day2;
import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        Services service = new Services();

        // add the products..
        service.addProduct(new Product("Asus Mouse", "Electronics", "Black Table", 2019));
        service.addProduct(new Product("Asus VivoBook", "Laptop", "Bed", 2022));
        service.addProduct(new Product("iPad", "Apple", "Drawer", 2023));
        service.addProduct(new Product("Asus Vivobook", "Laptop", "Brown Drawer", 2027));
        service.addProduct(new Product("Macbook", "Laptop", "Drawer", 2019));
        service.addProduct(new Product("Macbook pro", "Laptop", "Brown Drawer", 2022));
        service.addProduct(new Product("Pad", "Writing Pad", "Blue Drawer", 2020));
        service.addProduct(new Product("Apple Keyboard", "Keyboard", "White Table", 2022));
        service.addProduct(new Product("Buds", "Keyboard", "Brown Table", 2024));
        service.addProduct(new Product("Type C", "Cable", "Black Drawer", 2029));
        service.addProduct(new Product("EarPhone", "Electronics", "Drawer", 2025));
        service.addProduct(new Product("Logi Mouse", "Mouse", "Black Table", 2022));
        service.addProduct(new Product("Apple Mouse", "Mouse", "White Table", 2022));
        service.addProduct(new Product("Lenovo Mouse", "Mouse", "Black Drawer", 2022));
        service.addProduct(new Product("SD Card", "Electronics", "White Table", 2020));
       
        Scanner s = new Scanner(System.in);
       
        System.out.print("Place to Search : ");   
        String place = s.nextLine();

        //Products in a particular place
        List<Product> a = service.getAllProducts();
        Stream<Product> z= a.stream();
        Stream<Product> o =  z.filter(product->product.getPlace().equals(place));
        					 o.forEach(product -> System.out.println(product.toString()));
        					 
        					 System.out.println("    ______________________________ ");
                             
        //Products out of warranty
        					 System.out.println("Enter year");
        					 int c = s.nextInt();
        Stream<Product> i=a.stream();
        Stream<Product> n=i.filter(product->product.getWarranty()<c);
        				  n.forEach(product -> System.out.println(product.toString()));
    }
}
