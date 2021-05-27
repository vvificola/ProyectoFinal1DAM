/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import preferenceEnums.DietaryRestrictions;
import preferenceEnums.Storage;

/**
 *
 * @author carlac
 */
public class Product  extends NutritionalValues {
    
    private String productName;
    private Short weight;
    private Storage storage;
    private DietaryRestrictions dietary;

    public Product(String productName, Short weight, Storage storage, DietaryRestrictions dietary, short caloricDensity, short carbs, short proteins, short fats) {
        super(caloricDensity, carbs, proteins, fats);
        this.productName = productName;
        this.weight = weight;
        this.storage = storage;
        this.dietary = dietary;
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

    public DietaryRestrictions getDietary() {
        return dietary;
    }

    public void setDietary(DietaryRestrictions dietary) {
        this.dietary = dietary;
    }

    @Override
    public String toString() {
        return "Product{" + "productName=" + productName + ", weight=" + weight + ", storage=" + storage + ", dietary=" + dietary + '}';
    }
     
    
}
