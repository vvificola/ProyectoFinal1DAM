package products;

import java.util.ArrayList;

import classes.Product;
import preferenceEnums.DietaryRestrictions;
import preferenceEnums.Storage;
import typeOfEnums.TypeOfCondiment;
import typeOfEnums.TypeOfFish;

public class Condiment extends Product {
	
	private TypeOfCondiment typeOfCondiment;

	public Condiment (String productName, TypeOfCondiment typeOfCondiment, short caloricDensity, short carbs, short proteins, short fats, short weight, Storage storage, boolean vegan, boolean halal,
			boolean highProtein, boolean lowCarb,  
			ArrayList<DietaryRestrictions> restrictions) {
		super(caloricDensity, carbs, proteins, fats, vegan, halal, highProtein, lowCarb, productName, weight, storage,
				restrictions);
		this.typeOfCondiment= typeOfCondiment;
	}

	


	
	
	
}
