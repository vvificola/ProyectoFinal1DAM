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
    private boolean vegan; 
    private boolean halal; 
    private boolean highProtein;
    private boolean lowCarb;
    private ArrayList <DietaryRestrictions> restrictions = new ArrayList <DietaryRestrictions>();
   

    

   

   

	
	
	public Product(short caloricDensity, short carbs, short proteins, short fats, String productName, Short weight,
			Storage storage, boolean vegan, boolean halal, boolean highProtein, boolean lowCarb)
			 {
		super(caloricDensity, carbs, proteins, fats);
		this.productName = productName;
		this.weight = weight;
		this.storage = storage;
		this.vegan = vegan;
		this.halal = halal;
		this.highProtein = highProtein;
		this.lowCarb = lowCarb;
		this.setRestrictions(vegan, halal, highProtein, lowCarb);
		
		
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
