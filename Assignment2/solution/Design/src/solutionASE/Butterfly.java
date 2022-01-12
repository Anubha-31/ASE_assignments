package solutionASE;

public class Butterfly extends Insect {

	public String gender;

	public String state;
	int eggs ;
	
	Butterfly femaleButterfly;

	public Butterfly getFemaleButterfly() {
		return femaleButterfly;
	}

	public void setFemaleButterfly(Butterfly femaleButterfly) {
		this.femaleButterfly = femaleButterfly;
	}

	public int getEggs() {
		return eggs;
	}

	public void setEggs(int noOfEggs) {
		this.eggs = noOfEggs;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Butterfly(String gender, String state) {
		super();
		this.gender = gender;
		this.state = state;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public void layEggs() {
		System.out.println("female butterflying laying eggs");
		Simulation.state = "Laid Eggs";
		int noOfEggs = (int) (Math.random() * 2) + 1;
		setEggs(noOfEggs);
	}

	public void findMate() {
		if (this.getState().equalsIgnoreCase("Feb") || this.getState().equalsIgnoreCase("March")) {
			if (this.getGender().equals("Female")) {
				System.out.println("Finding Male Partner");
				this.layEggs();
			}
			if (this.getGender().equalsIgnoreCase("male")) {
				System.out.println("Finding Female Partner");
				Butterfly femalePartner = new Butterfly("Female", "initial");
				femalePartner.layEggs();
				setFemaleButterfly(femalePartner);
			}
		}
	}

	@Override
	public int getEyes() {
		return 2;
	}

	@Override
	public int getLegs() {
		return 6;
	}

	@Override
	public int getWings() {
		return 2;
	}
}
