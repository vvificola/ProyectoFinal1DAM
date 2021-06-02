package products;

import java.util.ArrayList;

import classes.Product;
import preferenceEnums.DietaryRestrictions;
import preferenceEnums.Storage;
import typeOfEnums.TypeOfCondiment;
import typeOfEnums.TypeOfFish;

public class Condiment extends Product {
	
	private TypeOfCondiment typeOfCondiment;

	public Condiment(String productName, short caloricDensity, short carbs, short proteins, short fats, boolean vegan,
			boolean halal, boolean highProtein, boolean lowCarb, short weight, Storage storage,
			ArrayList<DietaryRestrictions> restrictions, TypeOfCondiment typeOfCondiment) 
	
	
	{
		super(productName, caloricDensity, carbs, proteins, fats, vegan, halal, highProtein, lowCarb, weight, storage,
				restrictions);
		this.typeOfCondiment = typeOfCondiment;
	}


	


	
	
	
}
