package application;

import java.util.Date;

import entities.Order;
import entities_enums.OrderStatus;

public class Program {

	public static void main(String[] args) {
		
		Order order = new Order(1089, new Date(), OrderStatus.PENDING_PAYMENT);
		
		System.out.println(order);
		
		// Transformando a String em enum
		//.valueOf("")
		
		OrderStatus os1 = OrderStatus.DELIVERED;
		OrderStatus os2 = OrderStatus.valueOf("DELIVERED");
		
		System.out.println(os1);
		System.out.println(os2);
	}

}
