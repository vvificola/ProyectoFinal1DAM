package products;

import classes.Product;
import preferenceEnums.Storage;
import typeOfEnums.TypeOfCondiment;
import typeOfEnums.TypeOfFish;

public class Condiment extends Product {
	
	private TypeOfCondiment typeOfCondiment;

	public Condiment(String productName, TypeOfCondiment typeOfCondiment, short caloricDensity, short carbs, short proteins, short fats,  short weight,
			Storage storage, boolean vegan, boolean halal, boolean highProtein, boolean lowCarb
			) {
		super(caloricDensity, carbs, proteins, fats, productName, weight, storage, vegan, halal, highProtein, lowCarb);
		this.typeOfCondiment = typeOfCondiment;
	}
	
	


	
	
	
}
