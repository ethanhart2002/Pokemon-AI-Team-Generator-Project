import java.util.HashMap;


/**
 * @author ethan
 * This class determines the effectiveness of an attacking Pokemon's type(s) on a defending Pokemon's type(s).
 * This current version as of 12/19/2022 operates under the assumption that for each of the attacking Pokemon's types,
 * the attacking Pokemon has and is using a good STAB move of the corresponding type. A "good" STAB move is of base power 70+. 
 */
public class TypeEffectiveness {


	String[] firstMonTypes;
	String[] secondMonTypes;
	HashMap<String, Integer> typeConversion;

	/**
	 * 2D Array representing the type chart. Each row and column are in the same ordering as each other. 
	 */

	static final double[][] chart = {
			{ 1, 1, 1, 1, 1, .5, 1, 0, .5, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, // normal
			{ 2, 1, .5, .5, 1, 2, .5, 0, 2, 1, 1, 1, 1, .5, 2, 1, 2, .5 }, // fighting
			{ 1, 2, 1, 1, 1, .5, 2, 1, .5, 1, 1, 2, .5, 1, 1, 1, 1, 1 }, // flying
			{ 1, 1, 1, .5, .5, .5, 1, .5, 0, 1, 1, 2, 1, 1, 1, 1, 1, 2 }, // poison
			{ 1, 1, 0, 2, 1, 2, .5, 1, 2, 2, 1, .5, 2, 1, 1, 1, 1, 1 }, // ground
			{ 1, .5, 2, 1, .5, 1, 2, 1, .5, 2, 1, 1, 1, 1, 2, 1, 1, 1 }, // rock
			{ 1, .5, .5, .5, 1, 1, 1, .5, .5, .5, 1, 2, 1, 2, 1, 1, 2, .5 }, // bug
			{ 0, 1, 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1, 2, 1, 1, .5, 1 }, // ghost
			{ 1, 1, 1, 1, 1, 2, 1, 1, .5, .5, .5, 1, .5, 1, 2, 1, 1, 2 }, // steel
			{ 1, 1, 1, 1, 1, .5, 2, 1, 2, .5, .5, 2, 1, 1, 2, .5, 1, 1 }, // fire
			{ 1, 1, 1, 1, 2, 2, 1, 1, 1, 2, .5, .5, 1, 1, 1, .5, 1, 1 }, // water
			{ 1, 1, .5, .5, 2, 2, .5, 1, .5, .5, 2, .5, 1, 1, 1, .5, 1, 1 }, // grass
			{ 1, 1, 2, 1, 0, 1, 1, 1, 1, 1, 2, .5, .5, 1, 1, .5, 1, 1 }, // electric
			{ 1, 2, 1, 2, 1, 1, 1, 1, .5, 1, 1, 1, 1, .5, 1, 1, 0, 1 }, // psychic
			{ 1, 1, 2, 1, 2, 1, 1, 1, .5, .5, .5, 2, 1, 1, .5, 2, 1, 1 }, // ice
			{ 1, 1, 1, 1, 1, 1, 1, 1, 1, .5, 1, 1, 1, 1, 1, 1, 2, 1, 0 }, // dragon
			{ 1, .5, 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1, 2, 1, 1, .5, .5 }, // dark
			{ 1, 2, 1, .5, 1, 1, 1, 1, .5, .5, 1, 1, 1, 1, 1, 2, 2, 1 }// fairy
	};

	/**
	 * Create a HashMap corresponding the string of each type to an index number to be used
	 * when accessing values from the type chart. 
	 * 
	 * @param x: Types of the first Pokemon (attacking Pokemon)
	 * @param y: Types of the second Pokemon (defending Pokemon)
	 */
	public TypeEffectiveness(String[] x, String[] y) {
		firstMonTypes = x;
		secondMonTypes = y;

		typeConversion = new HashMap<String, Integer>();

		typeConversion.put("normal", 1);
		typeConversion.put("fighting", 2);
		typeConversion.put("flying", 3);
		typeConversion.put("poison", 4);
		typeConversion.put("ground", 5);
		typeConversion.put("rock", 6);
		typeConversion.put("bug", 7);
		typeConversion.put("ghost", 8);
		typeConversion.put("steel", 9);
		typeConversion.put("fire", 10);
		typeConversion.put("water", 11);
		typeConversion.put("grass", 12);
		typeConversion.put("electric", 13);
		typeConversion.put("psychic", 14);
		typeConversion.put("ice", 15);
		typeConversion.put("dragon", 16);
		typeConversion.put("dark", 17);
		typeConversion.put("fairy", 18);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Method that determines if an attacking pokemon is super effective against a defending pokemon. Considers
	 * both pokemon's typing. 
	 * 
	 * Note that in the current version as of 12/19/2022, only super-effectiveness is considered. The program 
	 * does not currently distinguish between neutral, not very effective, or immune type matchups.
	 * 
	 * @return a boolean indicating whether an attacking pokemon is super effective against a defending pokemon
	 */
	public boolean isSuperEffective() {
		// if attacking pokemon has only 1 type
		if (firstMonTypes.length == 1) {
			int row = typeConversion.get(firstMonTypes[0]);
			// if defending pokemon only has 1 type
			if (secondMonTypes.length == 1) {
				int column = typeConversion.get(secondMonTypes[0]);
				if (chart[row - 1][column - 1] == 2) {
					return true;
				} else {
					return false;
				}
				// if defending pokemon has 2 types
			} else {
				for (int i = 0; i < secondMonTypes.length; i++) {
					int column = typeConversion.get(secondMonTypes[i]);
					if (chart[row - 1][column - 1] == 2) {
						return true;
					}
				}
				return false;
			}
			// if attacking pokemon has 2 types
		} else {
			int rowT1 = typeConversion.get(firstMonTypes[0]);
			int rowT2 = typeConversion.get(firstMonTypes[1]);

			// if defending pokemon only has 1 type
			if (secondMonTypes.length == 1) {
				int column = typeConversion.get(secondMonTypes[0]);
				if (chart[rowT1 - 1][column - 1] == 2) {
					return true;
				} else if (chart[rowT2 - 1][column - 1] == 2) {
					return true;
				}
				return false;
				// if defending pokemon has 2 types -- PROBLEM HERE
			} else {
				//store both defending pokemon types
				int columnT1 = typeConversion.get(secondMonTypes[0]);
				int columnT2 = typeConversion.get(secondMonTypes[1]);


				//check attacking pokemon's first type effectiveness on both types of defending pokemon
				if (chart[rowT1-1][columnT1-1] == 2) {
					if (chart[rowT1-1][columnT2-1] > .5) {
						return true;
					} 
				} else if(chart[rowT1-1][columnT1-1] == 1) {
					if (chart[rowT1-1][columnT2-1] > 1) {
						return true;
					//repeated code that appears after this if-statement to ensure its execution (could be outsourced to helper method)	
					} else {
						if (chart[rowT2-1][columnT1-1] == 2){
							if (chart[rowT2-1][columnT2-1] > .5) {
								return true;
							} else {
								return false;
							}
						} else if(chart[rowT2-1][columnT1-1] == 1) {
							if (chart[rowT2-1][columnT2-1] > 1) {
								return true;
							} 
						} else {
							return false;
						}
					}
				} 

				//if first type of attacking pokemon didn't return a value, look at second type of attacking pokemon
				//and compare to both defending types

				//repeated code from above that must be executed
				else {
					if (chart[rowT2-1][columnT1-1] == 2){
						if (chart[rowT2-1][columnT2-1] > .5) {
							return true;
						} else {
							return false;
						}
					} else if(chart[rowT2-1][columnT1-1] == 1) {
						if (chart[rowT2-1][columnT2-1] > 1) {
							return true;
						} 
					} else {
						return false;
					}
				}
			}
			return false;
		}
	}
}
