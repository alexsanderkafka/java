package util;

public class Dados {
	
	private int id;
	private String name;
	private double sal;
	
	public Dados(int id, String name, double sal) {
		this.id = id;
		this.name = name;
		this.sal = sal;
	}
	
	public void increSal(double porc) {
		sal = (sal * porc) / 100 + sal;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getSal() {
		return sal;
	}

	public String toString() {
		return id + ", " + name + ", " + String.format("%.2f", sal);
	}
	
	
	
	
}
