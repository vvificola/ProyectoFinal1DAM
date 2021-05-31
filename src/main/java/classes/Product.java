/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.util.ArrayList;
import java.util.stream.Stream;

import preferenceEnums.DietaryRestrictions;
import preferenceEnums.Storage;
import products.Vegetable;
import typeOfEnums.TypeOfVegetable;

/**
 *
 * @author carlac
 */
public class Product  extends NutritionalValues {
    
    private String productName;
    private Short weight;
    private Storage storage;
   
    private ArrayList <DietaryRestrictions> restrictions = new ArrayList <DietaryRestrictions>();
   

    

	



	public Product(short caloricDensity, short carbs, short proteins, short fats, boolean vegan, boolean halal,
			boolean highProtein, boolean lowCarb, String productName, Short weight, Storage storage,
			ArrayList<DietaryRestrictions> restrictions) {
		super(caloricDensity, carbs, proteins, fats, vegan, halal, highProtein, lowCarb);
		this.productName = productName;
		this.weight = weight;
		this.storage = storage;
		this.restrictions = restrictions;
	}



	public void setRestrictions(boolean vegan, boolean halal, boolean highProtein, boolean lowCarb) {
		
		      if (vegan) {restrictions.add(DietaryRestrictions.VEGAN);
			
		}else if (halal) {restrictions.add(DietaryRestrictions.HALAL);
			
		} else if (highProtein){restrictions.add(DietaryRestrictions.HIGHPROTEIN); 
			
		}else if (lowCarb) {restrictions.add(DietaryRestrictions.LOWCARB);}
	}

	

	public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Short getWeight() {
        return weight;
    }

    public void setWeight(Short weight) {
        this.weight = weight;
    }

    public Storage getStorage() {
        return storage;
    }

    public void setStorage(Storage storage) {
        this.storage = storage;
    }

  

    public ArrayList<DietaryRestrictions> getRestrictions() {
		return restrictions;
	}

	

	@Override
    public String toString() {
        return "Product{" + "productName=" + productName + ", weight=" + weight + ", storage=" + storage + ", dietary=" + restrictions + '}';
    }
     
    
}
