package ie.gmit.sw.ai;

public class NeuralNetwork {

	// Variables
	private int outcome;
	private NeuralNetworkRunner nr = new NeuralNetworkRunner();
	 
	// Method for neural networks
	public int neuralNetworkLogic(int health, int sword, int gun, int enemies) {
		 
		// Check what the players health is and override health
		if(health <= 30) {
			health = 0;
		 }else if(health > 30 && health <= 60) {
			 health = 1;
		 }else if(health > 60) {
			 health = 2;
		 }
		
		// Use the neural network predict method 
		outcome = nr.neuralNetworkPredict(health, sword, gun, enemies);
		// Print lines
		System.out.println("\n-------------------------------Neural Networks-------------------------------");
		System.out.println("Health: " + health);
		System.out.println("Sword: " + sword);
		System.out.println("Gun: " + gun);
		System.out.println("Enemies: " + enemies);
		System.out.println("Outcome: " + outcome);
		 
		// Depending on the outcome of the neural network you will get a different print line
		if(outcome == 0) {
			System.out.println("Enemy is Panicking");
		 }else if(outcome == 1) {
			System.out.println("Enemy is Attacking");
		}else if(outcome == 2) {
			System.out.println("Enemy is Hiding");
		}else if(outcome == 3) {
			System.out.println("Enemy is Running");
		}
		System.out.println("-----------------------------------------------------------------------------");
		 
		// return the neural network outcome
		return outcome;
	}
}
