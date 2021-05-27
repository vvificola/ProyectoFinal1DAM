/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package products;

import classes.Product;
import preferenceEnums.DietaryRestrictions;
import preferenceEnums.Storage;
import typeOfEnums.TypeOfFruit;

/**
 *
 * @author carlac
 */
public class Fruit  extends Product {
    private TypeOfFruit typeOfFruit;
    
    public Fruit(String productName, Short weight, Storage storage, DietaryRestrictions dietary, short caloricDensity, short carbs, short proteins, short fats,TypeOfFruit typeOfFruit ) {
        super(productName, weight, storage, dietary, caloricDensity, carbs, proteins, fats);
        this.typeOfFruit = typeOfFruit;
    }
    
}
