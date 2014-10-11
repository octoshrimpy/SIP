package tools.items.gadgetOverhaul.items;

public interface ToolRod {

	
	public void getMaterial();
	
	public void setMaterial();
	
	public void getShape();
	
	public void getRecipe();
}

class rodRecipes{
	
	public String[] toolHandle(){
		String[] recipe = new String[]{"", "", ""};
		return recipe;
	}
	
	public String[] swordHandle(){
		String[] recipe = new String[]{"", "", ""};
		return recipe;
	}
}