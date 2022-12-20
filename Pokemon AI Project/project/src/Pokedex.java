import java.util.HashMap;
/**
 * 
 */

/**
 * @author ethan
 * Pokedex class that generates a Pokedex. As of 12/19/2022, each fully-evolved gen 1 Pokemon is added individually (except mew+mewtwo)
 * NOTE: Working on importing csv file to read all Pokemon from. 
 * 
 */
public class Pokedex {

	HashMap<String, Pokemon> Pokedex;
	/**
	 * 
	 */
	public Pokedex() {
		Pokedex = new HashMap<String, Pokemon>();
	}
	
	/**
	 * generating a pokedex of all fully evolved Pokemon
	 */
	
	public void generatePokedex() {
		String[] venuTypes = {"grass", "poison"};
		Pokedex.put("venusaur", new Pokemon("venusaur", venuTypes, 525, 80, 82, 83, 100, 100, 80));
		
		String[] charTypes = {"fire", "flying"};
		Pokedex.put("charizard", new Pokemon("charizard", charTypes, 534, 78, 84, 78, 109, 85, 100));
		
		String[] blasTypes = {"water"};
		Pokedex.put("blastoise", new Pokemon("blastoise", blasTypes, 530, 79, 83, 100, 85, 105, 78));
		
		String[] butterfreeTypes = {"bug", "flying"};
		Pokedex.put("butterfree", new Pokemon("butterfree", butterfreeTypes, 395, 60, 45, 50, 90, 80, 70));
		
		String[] beedTypes = {"bug", "poison"};
		Pokedex.put("beedrill", new Pokemon("beedrill", beedTypes, 395, 65, 90, 40, 45, 80, 75));
		
		String[] pidgeotTypes = {"normal", "flying"};
		Pokedex.put("pidgeot", new Pokemon("pidgeot", pidgeotTypes, 479, 83, 80, 75, 70, 70, 101));
		
		String[] ratTypes = {"normal"};
		Pokedex.put("raticate", new Pokemon("raticate", ratTypes, 413, 55, 81, 60, 50, 70, 97));
		
		String[] fearTypes = {"normal", "flying"};
		Pokedex.put("fearow", new Pokemon("fearow", fearTypes, 442, 65, 90, 65, 61, 61, 100));
		
		String[] arbTypes = {"poison"};
		Pokedex.put("arbok", new Pokemon("arbok", arbTypes, 448, 60, 95, 69, 65, 79, 80));
		
		String[] raichuTypes = {"electric"};
		Pokedex.put("raichu", new Pokemon("raichu", raichuTypes, 485, 60, 90, 55, 90, 80, 110));
		
		String[] sandTypes = {"ground"};
		Pokedex.put("sandslash", new Pokemon("sandslash", sandTypes, 450, 75, 100, 110, 45, 55, 65));
		
		String[] queenTypes = {"poison", "ground"};
		Pokedex.put("nidoqueen", new Pokemon("nidoqueen", queenTypes, 505, 90, 92, 87, 75, 85, 76));
		
		String[] kingTypes = {"poison", "ground"};
		Pokedex.put("nidoking", new Pokemon("nidoking", kingTypes, 505, 81, 102, 77, 85, 75, 85));
		
		String[] fableTypes = {"fairy"};
		Pokedex.put("clefable", new Pokemon("clefable", fableTypes, 483, 95, 70, 73, 95, 90, 60));
		
		String[] talesTypes = {"fire"};
		Pokedex.put("ninetales", new Pokemon("ninetales", talesTypes, 505, 73, 76, 75, 81, 100, 100));
		
		String[] tuffTypes = {"normal", "fairy"};
		Pokedex.put("wigglytuff", new Pokemon("wigglytuff", tuffTypes, 435, 140, 70, 45, 85, 50, 45));
		
		String[] batTypes = {"poison", "flying"};
		Pokedex.put("golbat", new Pokemon("golbat", batTypes, 455, 75, 80, 70, 65, 75, 90));
		
		String[] vileTypes = {"grass", "poison"};
		Pokedex.put("vileplume", new Pokemon("vileplume", vileTypes, 490, 75, 80, 85, 110, 90, 50));
		
		String[] paraTypes = {"bug", "grass"};
		Pokedex.put("parasect", new Pokemon("parasect", paraTypes, 405, 60, 95, 80, 60, 80, 30));
		
		String[] venoTypes = {"bug", "poison"};
		Pokedex.put("venomoth", new Pokemon("venomoth", venoTypes, 450, 75, 65, 60, 90, 75, 90));
		
		String[] dugTypes = {"ground"};
		Pokedex.put("dugtrio", new Pokemon("dugtrio", dugTypes, 425, 35, 100, 50, 50, 70, 120));
		
		String[] persianTypes = {"normal"};
		Pokedex.put("persian", new Pokemon("persian", persianTypes, 440, 65, 70, 60, 65, 65, 115));
		
		String[] duckTypes = {"water"};
		Pokedex.put("golduck", new Pokemon("golduck", duckTypes, 500, 80, 82, 78, 95, 80, 85));
		
		String[] apeTypes = {"fighting"};
		Pokedex.put("primeape", new Pokemon("primeape", apeTypes, 455, 65, 105, 60, 60, 70, 95));
		
		String[] arcTypes = {"fire"};
		Pokedex.put("arcanine", new Pokemon("arcanine", arcTypes, 555, 90, 110, 80, 100, 80, 95));
		
		String[] poliTypes = {"water", "fighting"};
		Pokedex.put("poliwrath", new Pokemon("poliwrath", poliTypes, 510, 90, 95, 95, 70, 90, 70));
		
		String[] alaTypes = {"psychic"};
		Pokedex.put("alakazam", new Pokemon("alakazam", alaTypes, 500, 55, 50, 45, 135, 95, 120));
		
		String[] machampTypes = {"fighting"};
		Pokedex.put("machamp", new Pokemon("machamp", machampTypes, 505, 90, 130, 80, 65, 85, 55));
		
		String[] vicTypes = {"grass", "poison"};
		Pokedex.put("victreebel", new Pokemon("victreebel", vicTypes, 490, 80, 105, 65, 100, 70, 70));
		
		String[] squidTypes = {"water", "poison"};
		Pokedex.put("tentacruel", new Pokemon("tentacruel", squidTypes, 515, 80, 70, 65, 80, 120, 100));
		
		String[] geoTypes = {"rock", "ground"};
		Pokedex.put("golem", new Pokemon("golem", geoTypes, 495, 80, 120, 130, 55, 65, 45));
		
		String[] ponyTypes = {"fire"};
		Pokedex.put("rapidash", new Pokemon("rapidash", ponyTypes, 500, 65, 100, 70, 80, 80, 105));
		
		String[] broTypes = {"water", "psychic"};
		Pokedex.put("slowbro", new Pokemon("slowbro", broTypes, 490, 95, 75, 110, 100, 80, 30));
		
		String[] magnetTypes = {"electric", "steel"};
		Pokedex.put("magneton", new Pokemon("magneton", magnetTypes, 465, 50, 60, 95, 120, 70, 70));
		
		String[] fetchTypes = {"normal", "flying"};
		Pokedex.put("farfetch'd", new Pokemon("farfetch'd", fetchTypes, 377, 52, 90, 55, 58, 62, 60));
		
		String[] dodrioTypes = {"normal", "flying"};
		Pokedex.put("dodrio", new Pokemon("dodrio", dodrioTypes, 470, 60, 110, 70, 60, 60, 110));
		
		String[] dewTypes = {"water", "ice"};
		Pokedex.put("dewgong", new Pokemon("dewgong", dewTypes, 475, 90, 70, 80, 70, 95, 70));
		
		String[] mukTypes = {"poison"};
		Pokedex.put("muk", new Pokemon("muk", mukTypes, 500, 105, 105, 75, 65, 100, 50));
		
		String[] cloyTypes = {"water", "ice"};
		Pokedex.put("cloyster", new Pokemon("cloyster", cloyTypes, 525, 50, 95, 180, 85, 45, 70));
		
		String[] gengarTypes = {"ghost", "poison"};
		Pokedex.put("gengar", new Pokemon("gengar", gengarTypes, 500, 60, 65, 60, 130, 75, 110));
		
		String[] onixTypes = {"rock", "ground"};
		Pokedex.put("onix", new Pokemon("onix", onixTypes, 385, 35, 45, 160, 30, 45, 70));
		
		String[] hypnoTypes = {"psychic"};
		Pokedex.put("hypno", new Pokemon("hypno", hypnoTypes, 483, 85, 73, 70, 73, 115, 67));
		
		String[] kinglerTypes = {"water"};
		Pokedex.put("kingler", new Pokemon("kingler", kinglerTypes, 475, 55, 130, 115, 50, 50, 75));
		
		String[] elecTypes = {"electric"};
		Pokedex.put("electrode", new Pokemon("electrode", elecTypes, 490, 60, 50, 70, 80, 80, 150));
		
		String[] eggTypes = {"grass", "psychic"};
		Pokedex.put("exeggutor", new Pokemon("exeggutor", eggTypes, 530, 95, 95, 85, 125, 75, 55));
		
		String[] maroTypes = {"ground"};
		Pokedex.put("marowak", new Pokemon("marowak", maroTypes, 425, 60, 80, 110, 50, 80, 45));
		
		String[] hitmonleeTypes = {"fighting"};
		Pokedex.put("hitmonlee", new Pokemon("hitmonlee", hitmonleeTypes, 455, 50, 120, 53, 35, 110, 87));
		
		String[] hitmonchanTypes = {"fighting"};
		Pokedex.put("hitmonchan", new Pokemon("hitmonchan", hitmonchanTypes, 455, 50, 105, 79, 35, 110, 76));
		
		String[] lickitungTypes = {"normal"};
		Pokedex.put("lickitung", new Pokemon("lickitung", lickitungTypes, 385, 90, 55, 75, 60, 75, 30));
		
		String[] weezTypes = {"poison"};
		Pokedex.put("weezing", new Pokemon("weezing", weezTypes, 490, 65, 90, 120, 85, 70, 60));
		
		String[] rhydonTypes = {"ground", "rock"};
		Pokedex.put("rhydon", new Pokemon("rhydon", rhydonTypes, 485, 105, 130, 120, 45, 45, 40));
		
		String[] chanseyTypes = {"normal"};
		Pokedex.put("chansey", new Pokemon("chansey", chanseyTypes, 450, 250, 5, 5, 35, 105, 50));
		
		String[] tangelaTypes = {"grass"};
		Pokedex.put("tangela", new Pokemon("tangela", tangelaTypes, 435, 65, 55, 115, 100, 40, 60));
		
		String[] kangaTypes = {"normal"};
		Pokedex.put("kangaskhan", new Pokemon("kangaskhan", kangaTypes, 490, 105, 95, 80, 40, 80, 90));
		
		String[] seadraTypes = {"water"};
		Pokedex.put("seadra", new Pokemon("seadra", seadraTypes, 440, 55, 65, 95, 95, 45, 85));
		
		String[] seakingTypes = {"water"};
		Pokedex.put("seaking", new Pokemon("seaking", seakingTypes, 450, 80, 92, 65, 65, 80, 68));
		
		String[] starmieTypes = {"water", "psychic"};
		Pokedex.put("starmie", new Pokemon("starmie", starmieTypes, 520, 60, 75, 85, 100, 85, 115));
		
		String[] mimeTypes = {"psychic", "fairy"};
		Pokedex.put("mr.mime", new Pokemon("mr.mime", mimeTypes, 460, 40, 45, 65, 100, 120, 90));
		
		String[] scytherTypes = {"bug", "flying"};
		Pokedex.put("scyther", new Pokemon("scyther", scytherTypes, 500, 70, 110, 80, 55, 80, 105));
	
		String[] jynxTypes = {"ice", "psychic"};
		Pokedex.put("jynx", new Pokemon("jynx", jynxTypes, 455, 65, 50, 35, 115, 95, 95));
		
		String[] electabuzzTypes = {"electric"};
		Pokedex.put("electabuzz", new Pokemon("electabuzz", electabuzzTypes, 490, 65, 83, 57, 95, 85, 105));
		
		String[] magTypes = {"fire"};
		Pokedex.put("magmar", new Pokemon("magmar", magTypes, 495, 65, 95, 57, 100, 85, 93));
		
		String[] pinsirTypes = {"bug"};
		Pokedex.put("pinsir", new Pokemon("pinsir", pinsirTypes, 500, 65, 125, 100, 55, 70, 85));
		
		String[] taurosTypes = {"normal"};
		Pokedex.put("tauros", new Pokemon("tauros", taurosTypes, 490, 75, 100, 95, 40, 70, 110));
		
		String[] gyaradosTypes = {"water", "flying"};
		Pokedex.put("gyarados", new Pokemon("gyarados", gyaradosTypes, 540, 95, 125, 79, 60, 100, 81));
		
		String[] laprasTypes = {"water", "ice"};
		Pokedex.put("lapras", new Pokemon("lapras", laprasTypes, 535, 130, 85, 80, 85, 95, 60));
		
		String[] dittoTypes = {"normal"};
		Pokedex.put("ditto", new Pokemon("ditto", dittoTypes, 288, 48, 48, 48, 48, 48, 48));
		
		String[] vaporeonTypes = {"water"};
		Pokedex.put("vaporeon", new Pokemon("vaporeon", vaporeonTypes, 525, 130, 65, 60, 110, 95, 65));
		
		String[] jolteonTypes = {"electric"};
		Pokedex.put("jolteon", new Pokemon("jolteon", jolteonTypes, 525, 65, 65, 60, 110, 95, 130));
		
		String[] flareonTypes = {"fire"};
		Pokedex.put("flareon", new Pokemon("flareon", flareonTypes, 525, 65, 130, 60, 95, 110, 65));
		
		String[] porygonTypes = {"normal"};
		Pokedex.put("porygon", new Pokemon("porygon", porygonTypes, 395, 65, 60, 70, 85, 75, 40));
		
		String[] omastarTypes = {"water", "rock"};
		Pokedex.put("omastar", new Pokemon("omastar", omastarTypes, 495, 70, 60, 125, 115, 70, 55));
		
		String[] kabuTypes = {"water", "rock"};
		Pokedex.put("kabutops", new Pokemon("kabutops", kabuTypes, 495, 60, 115, 105, 65, 70, 80));
		
		String[] aeroTypes = {"rock", "flying"};
		Pokedex.put("aerodactyl", new Pokemon("aerodactyl", aeroTypes, 515, 80, 105, 65, 60, 75, 130));
		
		String[] snorlaxTypes = {"normal"};
		Pokedex.put("snorlax", new Pokemon("snorlax", snorlaxTypes, 540, 160, 110, 65, 65, 110, 30));
		
		String[] artiTypes = {"ice", "flying"};
		Pokedex.put("articuno", new Pokemon("articuno", artiTypes, 580, 90, 85, 100, 95, 125, 85));
		
		String[] zapTypes = {"electric", "flying"};
		Pokedex.put("zapdos", new Pokemon("zapdos", zapTypes, 580, 90, 90, 85, 125, 90, 100));
		
		String[] moltTypes = {"fire", "flying"};
		Pokedex.put("moltres", new Pokemon("moltres", moltTypes, 580, 90, 100, 90, 125, 85, 90));
		
		String[] dragTypes = {"dragon", "flying"};
		Pokedex.put("dragonite", new Pokemon("dragonite", dragTypes, 600, 91, 134, 95, 100, 100, 80));
		
		
	}
	
	/**
	 * method that prints the pokedex. Useful for debugging. 
	 */
	public void printPokedex() {
		System.out.println(Pokedex.keySet());
	}

	/**
	 * method that returns the pokedex as a HashMap
	 * @return a HashMap<String, Pokemon> representing the pokedex
	 */
	public HashMap<String, Pokemon> getPokedex() {
		return Pokedex;
	}

}
