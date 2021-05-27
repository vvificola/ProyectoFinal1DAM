/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package products;

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

    public Vegetable(TypeOfVegetable typeOfVegetable, String productName, Short weight, Storage storage, DietaryRestrictions dietary, short caloricDensity, short carbs, short proteins, short fats) {
        super(productName, weight, storage, dietary, caloricDensity, carbs, proteins, fats);
        this.typeOfVegetable = typeOfVegetable;
    }
    
}
