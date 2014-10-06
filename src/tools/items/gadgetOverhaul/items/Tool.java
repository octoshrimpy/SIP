package tools.items.gadgetOverhaul.items;

public interface Tool {

	/**
	 * Get the tool's durability
	 * @return short durability
	 */
	public short getDurability();
	
	/**
	 * Set durability for the tool
	 * @param durability short
	 * @return
	 */
	public short setDurablilty(short durability);
	
	/**
	 * Get the tool's maximum durability
	 * @return short durability
	 */
	public short getMaxDurability();
	
	/**
	 * Set the tool's maximum durability
	 * @param durability short
	 * @return
	 */
	public short setMaxDurability(short durability);
	
	/**
	 * Get the tool's current modifiers
	 * @return String[] modifiers
	 */
	public String[] getModifiers();
	
	/**
	 * Add modifiers to the tool
	 * @param modifier ModifierType
	 * @return
	 */
	public ModifierType addModifier(ModifierType modifier);
	
	/**
	 * Remove modifiers from the tool
	 * @param modifier ModifierType
	 * @return
	 */
	public ModifierType removeModifier(ModifierType modifier);
	
	/**
	 * Get the tool's mining level
	 * @return MiningLevel level
	 */
	public MiningLevel getMiningLevel();
	
	/**
	 * Set the tool's mining level
	 * @param level MiningLevel
	 * @return
	 */
	public MiningLevel setMiningLevel(MiningLevel level);

}
