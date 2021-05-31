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

/**
 *
 * @author carlac
 */
public class Fish  extends Product {
    private TypeOfFish typeOfFish;

	public Fish(String productName, TypeOfFish typeOfFish, short caloricDensity, short carbs, short proteins, short fats, short weight, Storage storage, boolean vegan, boolean halal,
			boolean highProtein, boolean lowCarb,  
			ArrayList<DietaryRestrictions> restrictions) {
		super(caloricDensity, carbs, proteins, fats, vegan, halal, highProtein, lowCarb, productName, weight, storage,
				restrictions);
		this.typeOfFish = typeOfFish;
	}

    
    
    
    
}
