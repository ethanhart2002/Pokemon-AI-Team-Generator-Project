

/**
 * @author ethan
 * Class that defines a Pokemon object.
 * 
 * In the current version as of 12/19/2022, each Pokemon has a name, a String[] of types, a base stat total, 
 * an HP stat, attack stat, defense stat, special attack stat, special defense stat, and speed stat. 
 * 
 * Things to consider adding in the future: abilities, natures, items, etc.
 */
public class Pokemon {

	private String name;

    private String[] types;
    
    private int baseStatTotal;

    private int hp;

    private int attack;

    private int defense;

    private int spAttack;

    private int spDefense;

    private int speed;
	/**
	 * 
	 */
	public Pokemon(String name, String[] types, int baseStatTotal, int hp, int attack, int defense, 
			int spAttack, int spDefense, int speed) {
		this.name = name;
		this.types = types;
		this.baseStatTotal = baseStatTotal;
		this.hp = hp;
		this.attack = attack;
		this.defense = defense;
		this.spAttack = spAttack;
		this.spDefense = spDefense;
		this.speed = speed;
				
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the types
	 */
	public String[] getTypes() {
		return types;
	}
	/**
	 * @param types the types to set
	 */
	public void setTypes(String[] types) {
		this.types = types;
	}
	
	/**
	 * @return the baseStatTotal
	 */
	public int getBaseStatTotal() {
		return baseStatTotal;
	}
	/**
	 * @param baseStatTotal the baseStatTotal to set
	 */
	public void setBaseStatTotal(int baseStatTotal) {
		this.baseStatTotal = baseStatTotal;
	}
	/**
	 * @return the hp
	 */
	public int getHp() {
		return hp;
	}
	/**
	 * @param hp the hp to set
	 */
	public void setHp(int hp) {
		this.hp = hp;
	}
	/**
	 * @return the attack
	 */
	public int getAttack() {
		return attack;
	}
	/**
	 * @param attack the attack to set
	 */
	public void setAttack(int attack) {
		this.attack = attack;
	}
	/**
	 * @return the defense
	 */
	public int getDefense() {
		return defense;
	}
	/**
	 * @param defense the defense to set
	 */
	public void setDefense(int defense) {
		this.defense = defense;
	}
	/**
	 * @return the spAttack
	 */
	public int getSpAttack() {
		return spAttack;
	}
	/**
	 * @param spAttack the spAttack to set
	 */
	public void setSpAttack(int spAttack) {
		this.spAttack = spAttack;
	}
	/**
	 * @return the spDefense
	 */
	public int getSpDefense() {
		return spDefense;
	}
	/**
	 * @param spDefense the spDefense to set
	 */
	public void setSpDefense(int spDefense) {
		this.spDefense = spDefense;
	}
	/**
	 * @return the speed
	 */
	public int getSpeed() {
		return speed;
	}
	/**
	 * @param speed the speed to set
	 */
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	

}
