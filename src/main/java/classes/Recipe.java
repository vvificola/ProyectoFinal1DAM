/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import preferenceEnums.DietaryRestrictions;
import preferenceEnums.RecipeDifficulty;
import preferenceEnums.TypeOfCooking;

import java.io.File;
import java.util.ArrayList;

/**
 *
 * @author carlac
 */
public class Recipe extends NutritionalValues {
    
    private String filePath;
    private File image;
    private RecipeDifficulty difficulty;
    private TypeOfCooking style;
    private ArrayList<Product> ingredients = new  ArrayList<Product>();
    private String description;
    private boolean needsHeat; //true needs heat
    private ArrayList <DietaryRestrictions> restrictions;
    private String name;
 
   

  

	

	public Recipe(String name, String desayunoImagePath, short caloricDensity, short carbs, short proteins, short fats, boolean vegan, boolean halal,
			boolean highProtein,  boolean lowCarb ) {
		super(caloricDensity, carbs, proteins, fats, vegan, halal, highProtein, lowCarb);
		this.name = name;
		this.image = image;
		this.difficulty = difficulty;
		this.style = style;
	}


	







	public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TypeOfCooking getStyle() {
        return style;
    }

    public void setStyle(TypeOfCooking style) {
        this.style = style;
    }

    public ArrayList<Product> getIngredients() {
        return ingredients;
    }

    public void setIngredients(ArrayList<Product> ingredients) {
        this.ingredients = ingredients;
    }

    public boolean isNeedHeat() {
        return needsHeat;
    }

    public void setNeedHeat(boolean needHeat) {
        this.needsHeat = needHeat;
    }

    public RecipeDifficulty getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(RecipeDifficulty difficulty) {
        this.difficulty = difficulty;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Recipe{" + "name=" + name + ", style=" + style + ", ingredients=" + ingredients + ", needHeat=" + needsHeat + ", difficulty=" + difficulty + ", description=" + description + '}';
    }
    
    
}
