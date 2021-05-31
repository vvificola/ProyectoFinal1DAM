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
import typeOfEnums.TypeOfVegetable;

/**
 *
 * @author carlac
 */
public class Vegetable  extends Product {
    
    private TypeOfVegetable typeOfVegetable;
 

	public Vegetable(String productName, TypeOfVegetable typeOfVegetable, short caloricDensity, short carbs, short proteins, short fats, Short weight,
			Storage storage, boolean vegan, boolean halal, boolean highProtein, boolean lowCarb) {
		super(caloricDensity, carbs, proteins, fats, productName, weight, storage, vegan, halal, highProtein, lowCarb);
		this.typeOfVegetable = typeOfVegetable;
		
		
	}
	
	
	Product tomate = new Vegetable("Tomate rama", TypeOfVegetable.TOMATO,(short) 0,(short) 10, (short)10, (short)10, (short)10,  
			Storage.DRY, true, true, false ,true);
	
	
	


	@Override
	public String toString() {
		return "Vegetable [typeOfVegetable=" + typeOfVegetable + "]";
	}

	
    
	
    

	

	

	
    
    
}


  