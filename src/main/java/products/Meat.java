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
import typeOfEnums.TypeOfMeat;

/**
 *
 * @author carlac
 */
public class Meat extends Product {
    private TypeOfMeat typeOfMeat;

	public Meat(String productName, short caloricDensity, short carbs, short proteins, short fats, boolean vegan,
			boolean halal, boolean highProtein, boolean lowCarb, short weight, Storage storage,
			ArrayList<DietaryRestrictions> restrictions, TypeOfMeat typeOfMeat) {
		super(productName, caloricDensity, carbs, proteins, fats, vegan, halal, highProtein, lowCarb, weight, storage,
				restrictions);
		this.typeOfMeat = typeOfMeat;
	}

    

   
    
}
