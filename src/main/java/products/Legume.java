/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package products;

import classes.Product;
import preferenceEnums.DietaryRestrictions;
import preferenceEnums.Storage;
import typeOfEnums.TypeOfLegume;

/**
 *
 * @author carlac
 */
  class Legume  extends Product{
    
    private TypeOfLegume typeOfLegume;

    public Legume(String productName, Short weight, Storage storage, DietaryRestrictions dietary, short caloricDensity, short carbs, short proteins, short fats,TypeOfLegume typeOfLegume ) {
        super(productName, weight, storage, dietary, caloricDensity, carbs, proteins, fats);
        this.typeOfLegume=typeOfLegume;
    }
    
}
