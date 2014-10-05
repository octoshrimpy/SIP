package tools;

public class Main {
	
	//here we go again....
	RecipeLoader RecipeLoader = new RecipeLoader();
	
	public void OnStart(){
		
		//check that core is active (handshake?)
		//if core is active, load up recipes.
		
		RecipeLoader.loadRecipes();
		
		//check if vanilla items are turned off
		//act accordingly
	}
	
	

}
