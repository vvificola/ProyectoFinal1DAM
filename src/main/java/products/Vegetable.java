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
    private ArrayList <Vegetable> vegetables;

	public Vegetable(String productName, TypeOfVegetable typeOfVegetable, short caloricDensity, short carbs, short proteins, short fats, Short weight,
			Storage storage, boolean vegan, boolean halal, boolean highProtein, boolean lowCarb) {
		super(caloricDensity, carbs, proteins, fats, productName, weight, storage, vegan, halal, highProtein, lowCarb);
		this.typeOfVegetable = typeOfVegetable;
		this.setVegetables((Vegetable) tomate);
		
		
	}
	
	
	Product tomate = new Vegetable("Tomate rama", TypeOfVegetable.TOMATO,(short) 0,(short) 10, (short)10, (short)10, (short)10,  
			Storage.DRY, true, true, true ,true);
	
	
	

	
	

	
	

	


	

	public ArrayList<Vegetable> getVegetables() {
		return vegetables;
	}


	public void setVegetables(Vegetable vegetable) {
		vegetables.add(vegetable);
	}








	@Override
	public String toString() {
		return "Vegetable [typeOfVegetable=" + typeOfVegetable + "]";
	}

	
    
	
    

	

	

	
    
    
}


  