package ie.gmit.sw.ai;

// imports
import net.sourceforge.jFuzzyLogic.FIS;

public class FuzzyLogicFight {

	// get the file from the runner
	private FIS fis = Runner.getFILE();

	// variables
	private char id;
	private int row;
	private int col;
	private int weapon;
	private int enemy;
	private int health;
	private GameOver go = new GameOver();
	
	// Constructor
	public FuzzyLogicFight(char id, int row, int col) {
		super();
		this.id = id;
		this.row = row;
		this.col = col;
	}

	// Controller for fuzzy logic
	public int fuzzyController(int weapon, int enemy) {
		// Set fuzzy for weapon and enemy
		fis.setVariable("weapon", weapon);
		fis.setVariable("enemy", enemy);
		fis.evaluate();
		// Return the damage
		return (int) fis.getVariable("damage").getValue();
	}
	
	// Method for attacking 
	public void attack(char id) {
		// If/else if/ else to find each enemy individually
		if('\u0032' == id) {
			// Set fuzzy logic
			enemy = 70;
			weapon = 65;
		}
		else if('\u0033' == id) {
			// Set fuzzy logic
			enemy = 60;
			weapon = 55;
		}
		else if('\u0034' == id) {
			// Set fuzzy logic
			enemy = 45;
			weapon = 40;
		}
		else if('\u0035' == id) {
			// Set fuzzy logic
			enemy = 35;
			weapon = 30;
		}
		else if('\u0036' == id) {
			// Set fuzzy logic
			enemy = 25;
			weapon = 20;
		}
	
		// Get the health and take away from the fuzzy logic damage
		health = Player.getHealth() - fuzzyController(weapon, enemy);
		// Set the health of the player
		Player.setHealth(health);
		
		// Print statements
		System.out.println("\n---------------------------Player Stats (Fuzzy)---------------------------");
		System.out.println("Weapon: " + weapon);
		System.out.println("Enemy: " + enemy);
		System.out.println("Health: " + Player.getHealth());
		System.out.println("--------------------------------------------------------------------------");

		// If statement to display the you loose screen
		if(Player.getHealth() <= 0) {
			go.endGame();
		}
	}	
}