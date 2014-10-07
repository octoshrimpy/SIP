package tools.items.gadgetOverhaul;

import tools.items.gadgetOverhaul.items.MaterialType;


public class RepairStation {
	
	MaterialType m;
	
	public RepairStation(MaterialType m){ this.m = m; }
	
	
	
	public void onCraft(){
		
		switch(m){
		case Alumite:
			MaterialType.Alumite.rod();
			break;
		case Iron:
			MaterialType.Iron.rod();
			break;
		case Amethyst:
			break;
		case Ardite:
			break;
		case BlueSlime:
			break;
		case Bone:
			break;
		case Bronze:
			break;
		case Cactus:
			break;
		case Cobalt:
			break;
		case Copper:
			break;
		case Diamond:
			break;
		case Flint:
			break;
		case Gold:
			break;
		case Manyullyn:
			break;
		case Netherrack:
			break;
		case Obsidian:
			break;
		case Paper:
			break;
		case Slime:
			break;
		case Steel:
			break;
		case Stone:
			break;
		case Wood:
			break;
		default:
			break;
		}
		
	}
	
	public void onRepair(){
		
	}

}
