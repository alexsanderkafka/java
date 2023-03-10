package entities;

public class Funcionario {
	
	public String name;
	public double salary;
	public double tax; // imposto
	
	public double sal() {
		return salary - tax;
	}
	
	public void increaseSalary(double percentage) {
		salary += salary * percentage / 100;
	}
	
	public String toString() {
		return name + ", $ " + String.format("%.2f", sal());
	}
}
