/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package products;

import java.util.ArrayList;

import classes.Product;
import preferenceEnums.DietaryRestrictions;
import preferenceEnums.Storage;
import typeOfEnums.TypeOfFish;
import typeOfEnums.TypeOfFruit;

/**
 *
 * @author carlac
 */
public class Fruit  extends Product {
    private TypeOfFruit typeOfFruit;

	public Fruit(String productName, short caloricDensity, short carbs, short proteins, short fats, boolean vegan,
			boolean halal, boolean highProtein, boolean lowCarb, short weight, Storage storage,
			ArrayList<DietaryRestrictions> restrictions, TypeOfFruit typeOfFruit) {
		super(productName, caloricDensity, carbs, proteins, fats, vegan, halal, highProtein, lowCarb, weight, storage,
				restrictions);
		this.typeOfFruit = typeOfFruit;
	}

    
    
 
}
