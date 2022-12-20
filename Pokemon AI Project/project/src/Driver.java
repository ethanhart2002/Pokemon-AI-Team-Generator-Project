import java.util.HashMap;
import java.util.Random;
import java.util.ArrayList;
import java.util.Scanner;
/**
 * 
 */

/**
 * @author ethan
 * This is the driver program for the A.I. This class contains a main method, which creates a Pokedex, generates an
 * opponent trainer's team through user input, and generates the user's team through stochastic local search. 
 */
public class Driver {

	/**
	 * 
	 */
	public Driver() {
	}

	/**
	 * Value function that factors in a potential team member Pokemon's supereffectiveness against an enemy, its base stat total, and
	 * a bonus based on how many of its stats are over 90.
	 * 
	 * @param potentialTeamMember
	 * @param enemyPokemon
	 * @return a score of how good the potential team member pokemon matches up against the opponent pokemon
	 */
 
	private static double function(Pokemon potentialTeamMember, Pokemon enemyPokemon) {
		TypeEffectiveness t = new TypeEffectiveness(potentialTeamMember.getTypes(), enemyPokemon.getTypes());
		if (t.isSuperEffective()) {
			//test function: return (2.0) * (potentialTeamMember.getBaseStatTotal() + statQualityFunction(potentialTeamMember)); 

			//preliminarily sticking with this function as the statQualityFunction is treated more as a bonus than an integral
			//core piece of the function.
			return (2.0) * (potentialTeamMember.getBaseStatTotal()) + statQualityFunction(potentialTeamMember);
		} else {
			return (potentialTeamMember.getBaseStatTotal() + statQualityFunction(potentialTeamMember));
		}
	}

	/**
	 * Helper method to the function method above that returns a bonus score for each of a Pokemon's stat category over 90
	 * @param potentialTeamMember
	 * @return The number of each Pokemon stat category over 90 multiplied by 50 so that the function has weight in the overall
	 * score. 
	 * 
	 * Note: This function can return at most a value of 300. 
	 */

	private static int statQualityFunction(Pokemon potentialTeamMember) {
		int[] stats = {potentialTeamMember.getHp(), potentialTeamMember.getAttack(), potentialTeamMember.getDefense(), 
			potentialTeamMember.getSpAttack(), potentialTeamMember.getSpDefense(), potentialTeamMember.getSpeed()};
		
		int counter = 0;
		for (int i = 0; i < stats.length; i++){
			if (stats[i] >= 90) {
				counter++;
			}
		}
		return counter*50;
	}

	/**
	 * hill-climbing technique that searches through the pokedex through local search and tries to find a locally optimum pokemon to add to
	 * the team to beat an enemy trainer's specified pokemon.
	 * @param enemyPokemon
	 * @param pokedex
	 * @param explored
	 * @return the approximately optimal pokemon to beat an enemy trainer's specific pokemon.
	 */

	private static Pokemon stochasticHillClimb(Pokemon enemyPokemon, HashMap<String, Pokemon> pokedex, ArrayList<Pokemon> explored) {
		Random generator = new Random();
		Object[] values = pokedex.values().toArray();
		Pokemon randomPokemon = (Pokemon) values[generator.nextInt(values.length)];
		
		Pokemon currentBest = randomPokemon;
		while(true) {
			Pokemon randomNeighbor = (Pokemon) values[generator.nextInt(values.length)];
			if ((function(randomNeighbor, enemyPokemon) <= function(currentBest, enemyPokemon)) && !explored.contains(currentBest)) {
				return currentBest;
			} else {
				currentBest = randomNeighbor;
			}
		}
		
	}

	/**
	 * @param args
	 * Note: Strings identifying Pokemon objects will always be lowercase
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pokedex p = new Pokedex();
		p.generatePokedex();

		//testing methods printing the Pokedex and calculating its size
		//p.printPokedex();
		//System.out.println(p.getPokedex().size());

		HashMap<String, Pokemon> pokedex = p.getPokedex();

		// testing TypeEffectiveness Class
		// TypeEffectiveness t = new TypeEffectiveness(pokedex.get("nidoking").getTypes(), pokedex.get("zapdos").getTypes());
		// System.out.println(t.isSuperEffective());

		//Takes user input of the Pokemon on the opponent's team
		Scanner sc = new Scanner(System.in);
		String[] s = new String[6];
		System.out.println("\nYou have been challenged by a Pokemon trainer! Who are the six members of their team?\n");
		for (int i = 0; i < s.length; i++) {
			s[i] = sc.nextLine();
		}
		sc.close();

		//opponent team creation
		ArrayList<Pokemon> opponentTeam = new ArrayList<Pokemon>();
		for (int i = 0; i < s.length; i++) {
			opponentTeam.add(pokedex.get(s[i].toLowerCase()));
		}
		

		//initialize your team
		ArrayList<Pokemon> yourTeam = new ArrayList<Pokemon>();


		//initialize an explored list so your team won't have duplicates
		ArrayList<Pokemon> explored = new ArrayList<Pokemon>();

		//go through each of your opponent's pokemon and implement stochastic hill climb to find an approximately optimal
		//counter pokemon. Add each counter pokemon to your team.

		for (Pokemon x : opponentTeam) {
			Pokemon bestCounterPokemon = stochasticHillClimb(x, pokedex, explored);
			yourTeam.add(bestCounterPokemon);
			explored.add(bestCounterPokemon);
		}

		//Printing teams done below

		System.out.println("\n");
		System.out.println("\n");

		System.out.println("A Pokemon trainer has challenged you with this team:\n");
		System.out.println("------------------------------------------------------\n");

		//printing opponent team
		int i = 1;
		for (Pokemon x : opponentTeam) {
			System.out.println("Pokemon " + i + ": " + x.getName());
			i++;
		}

		System.out.println("\n");

		System.out.println("The Pokemon team you'll use to beat your opponent:\n");
		System.out.println("------------------------------------------------------\n");

		//printing your team
		i = 1;
		for (Pokemon x : yourTeam) {
			System.out.println("Pokemon " + i + ": " + x.getName());
			i++;
		}

		System.out.println("\n");
	}

}
