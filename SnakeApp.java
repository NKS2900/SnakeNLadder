package bridge.lab;

import java.util.Random;

public class SnakeApp {

	public static void main(String[] args) {
		
		// UC1_SinglePlayer
		int position = 0;		
		// UC2_Roll_Dice
		RollDice();
	}

	static void RollDice() {
		Random rn = new Random();
		int dice = rn.nextInt(6) + 1;
		System.out.println("Roll_Dice: " + dice);
	}
}
