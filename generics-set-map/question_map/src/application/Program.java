package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter file full path: ");
		String path = sc.nextLine();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			
			Map<String, Integer> map = new LinkedHashMap<>();
			
			String line = br.readLine();
			
			while(line != null) {
				
				String[] vet = line.split(",");
				String name = vet[0];
				int vot = Integer.parseInt(vet[1]);
				
				if(map.containsKey(name) != false) {
					int value = map.get(name);
					map.put(name, value + vot);
				}
				else {
					map.put(name, vot);
				}
				
				line = br.readLine();
			}
			
			for (String name : map.keySet()) {
				System.out.println(name + " : " + map.get(name));
			}
			
		}
		catch (IOException e) {
			System.out.println("Error path: " + e.getMessage());
		}
		
		sc.close();

	}

}
