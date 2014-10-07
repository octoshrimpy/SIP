package tools.items.gadgetOverhaul.items;

public enum MaterialType {

	//vanilla
	Iron 		(4, 5),
	Gold		(4, 5),
	Diamond		(4, 5),
	
	//metallic non-vanilla
	Alumite		(4, 5),
	Ardite		(4, 5),
	Bronze		(4, 5),
	Cobalt		(4, 5),
	Copper		(4, 5),
	Manyullyn	(4, 5),
	Steel		(4, 5),
	
	//non-metallic
	Amethyst	(4, 5),
	BlueSlime	(4, 5),
	Bone		(4, 5),
	Cactus		(4, 5),
	Flint		(4, 5),
	Netherrack	(4, 5),
	Obsidian	(4, 5),
	Paper		(4, 5),
	Slime		(4, 5),
	Stone		(4, 5),
	Wood		(4, 5);
	
	private final int rod;
	private final int head;
	
	MaterialType(int rod, int head){
		this.rod = rod;
		this.head = head;
	}
	public int rod(){ return rod; }
	public int head(){ return head; }
	
	
}
