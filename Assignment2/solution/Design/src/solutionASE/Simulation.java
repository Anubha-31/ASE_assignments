package solutionASE;

public class Simulation {
	public static String state;

	public static void main(String[] args) {
		state = "initial";
		
		Butterfly bf = new Butterfly("Female", "feb");
		bf.findMate();
		int eggs =0;
		if (bf.getGender().equalsIgnoreCase("Female")) {
			eggs = bf.getEggs();
		}else {
			eggs = bf.getFemaleButterfly().getEggs();
		}
		
		for (int i = 1; i <= eggs; i++) {
			System.out.println("\nEgg no :"+i);
			Eggs egg = new Eggs("white", "1", "laid Eggs");
			egg.hatch();
		}
		System.out.println("\nTo avoid confusion, Displaying the lifecycle of only Fist egg");
		
		Larvae larva = new Larvae("white", state);
		larva.eat();
		larva.attachToPlants();
		
		state = "";
		
		Chrysalis ob = new Chrysalis(state);
		ob.metamorphis();
		
		
	}

}
