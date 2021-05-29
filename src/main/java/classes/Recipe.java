/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import preferenceEnums.RecipeDifficulty;
import preferenceEnums.TypeOfCooking;

import java.util.ArrayList;

/**
 *
 * @author carlac
 */
public class Recipe extends NutritionalValues {
    
    private String name;
    private TypeOfCooking style; 
    private ArrayList<Product> ingredients;
    private boolean needHeat; //true needs heat
    private RecipeDifficulty difficulty;
    private String description;

  

    public Recipe(short caloricDensity, short carbs, short proteins, short fats, String name, TypeOfCooking style,
			ArrayList<Product> ingredients, boolean needHeat, RecipeDifficulty difficulty, String description) {
		super(caloricDensity, carbs, proteins, fats);
		this.name = name;
		this.style = style;
		this.ingredients = ingredients;
		this.needHeat = needHeat;
		this.difficulty = difficulty;
		this.description = description;
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
        return needHeat;
    }

    public void setNeedHeat(boolean needHeat) {
        this.needHeat = needHeat;
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
        return "Recipe{" + "name=" + name + ", style=" + style + ", ingredients=" + ingredients + ", needHeat=" + needHeat + ", difficulty=" + difficulty + ", description=" + description + '}';
    }
    
    
}
