package entities;

public class Students implements Comparable<Students>{
	
	private Integer cod;

	public Students(Integer cod) {
		this.cod = cod;
	}

	public Integer getCod() {
		return cod;
	}

	public void setCod(Integer cod) {
		this.cod = cod;
	}

	@Override
	public int compareTo(Students other) {
		return cod.compareTo(other.getCod());
	}

		
}
