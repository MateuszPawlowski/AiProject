package ie.gmit.sw.ai;

import javafx.application.Application;
import net.sourceforge.jFuzzyLogic.FIS;

public class Runner {
	
	// Variables
	private static String READ_FILE = "./resources/fuzzy/fuzzy.fcl";
	private static FIS FILE;
	
	// Getter and setter for FIS
	public static FIS getFILE() {
		return FILE;
	}
	
	public static void setFILE(FIS fILE) {
		FILE = fILE;
	}
	
	public static void main(String[] args) {
	
		/*
		 * PLEASE READ CAREFULLY
		 * ---------------------
		 * If you need to load FCL functions to the application or
		 * train, configure and load a neural network, then it is 
		 * best to do all of this before loading the UI. Launching
		 * a UI in any language or framework and then starting a 
		 * long running task in the same thread is guaranteed to
		 * freeze the screen and crash the programme.
		 * 
		 * NB: you can assume that the JavaFX 15 API is already
		 * available and configured on the MODULE-PATH (NOT THE 
		 * CLASSPATH). 
		 */
		
		  //Add long-running initialisation instructions here.
		
		/*
		 * Launch the JavaFX UI only when all the long-running AI 
		 * configuration tasks have been completed. Use the arrow 
		 * keys to move the player character and the 'Z' key to 
		 * toggle the zoom in / out.
		 */
		
		// Run neural networks
		NeuralNetworkRunner nn = new NeuralNetworkRunner();
		nn.go();
		
		// Load fuzzy logic
		FILE = FIS.load(READ_FILE, true);
		
		// Run application
		Application.launch(GameWindow.class, args);
	}

}