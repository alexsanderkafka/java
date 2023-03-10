package entities;

public class Note {
	public String name;
	public double note1, note2, note3;
	public double sum;
		
	public String toString() {
		
		sum = note1 + note2 + note3;
		
		if (sum >= 60.00) {
			return "FINAL GRADE = " + String.format("%.2f", sum) + "\nPASS";
		}
		else {
			return "FINAL GRADE = " + String.format("%.2f", sum) + "\nFAILED\n" + "MISSING "
					+ String.format("%.2f", 60 - sum) + " Points";
		}
	}
}
