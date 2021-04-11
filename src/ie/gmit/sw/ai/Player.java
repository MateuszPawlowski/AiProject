package ie.gmit.sw.ai;

public class Player {
	// Health of the player
	private static int health = 100;
	
	// getter for health
	public static int getHealth() {
		return health;
	}

	// setter for health
	public static void setHealth(int health) {
		Player.health = health;
	}
}
