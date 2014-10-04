package alchemy;

public class Main {
	
	//here we go again....
	RecipeLoader RecipeLoader = new RecipeLoader();
	
	public void OnStart(){
		
		//check that core is active (handshake?)
		//if core is active, load up recipes.
		
		RecipeLoader.loadRecipes();
	}
	
	

}
