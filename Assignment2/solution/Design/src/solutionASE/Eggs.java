package solutionASE;

public class Eggs {

	public String color;
	public String number;
	public String state;
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Eggs(String color, String number, String state) {
		super();
		this.color = color;
		this.number = number;
		this.state = state;
	}
	
	public void hatch() {
		if(this.getState().equalsIgnoreCase("Laid eggs")) {
			int days = (int) (Math.random() * 3) + 1;
			for (int i = 1; i <= days; i++) {
				System.out.println("Number Of Days Passed since eggs laid: "+i);	
			}
			System.out.println("Eggs hatched after "+days+" days");
			Simulation.state = "eggs hatched";
		}
	}

}
