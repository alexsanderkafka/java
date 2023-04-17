package application;

import java.util.Set;
import java.util.TreeSet;

import entities.Product;

public class Program3 {

	public static void main(String[] args) {
		
		Set<Product> product = new TreeSet<>();
		
		product.add(new Product("Tv", 900.0));
		product.add(new Product("Notebook", 1200.0));
		product.add(new Product("Tablet", 400.0));
		
		for (Product p : product) {
			System.out.println(p);
		}
	}
 
}
