package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Product;

public class ConsumerProgram {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		
		/*
		 * list.forEach(new PriceUpdate());
		 * list.forEach(Product::staticPriceUpdate);
		 * list.forEach(Product::nonStaticPriceUpdate);
		 * 
		 * Consumer<Product> cons = p -> p.setPrice(p.getPrice() * factor);
		 * list.forEach(cons);
		 */ 
		
		double factor = 1.1;
		
		list.forEach(p -> p.setPrice(p.getPrice() * factor));
		
		list.forEach(System.out::println);
		
	}
}
