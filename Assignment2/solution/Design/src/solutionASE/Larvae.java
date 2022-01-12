package solutionASE;

public class Larvae extends Insect {
	
	String color;
	String state;
	public Larvae(String color, String state) {
		super();
		this.color = color;
		this.state = state;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	public void eat() {
		System.out.println("caterpillars eat for about 2 weeks to become fully grown");
	}

	public void attachToPlants() {
		System.out.println("After 2 weeks, caterpillars find a plant where they attach themselves to evolve further");
		Simulation.state = "chrysalis is formed";
		
	}
	@Override
	public int getEyes() {
		// TODO Auto-generated method stub
		return 2;
	}
	@Override
	public int getLegs() {
		// TODO Auto-generated method stub
		return 6;
	}
	@Override
	public int getWings() {
		// TODO Auto-generated method stub
		return 0;
	}
}
