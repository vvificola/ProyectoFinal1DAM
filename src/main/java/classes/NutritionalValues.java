/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author carlac
 */
public abstract class NutritionalValues {
    private short caloricDensity; //each 100 grams
    private short carbs; //each 100 grams
    private short proteins; //each 100 grams
    private short fats; //each 100 grams

    public NutritionalValues(short caloricDensity, short carbs, short proteins, short fats) {
        this.caloricDensity = caloricDensity;
        this.carbs = carbs;
        this.proteins = proteins;
        this.fats = fats;
    }

    public short getCaloricDensity() {
        return caloricDensity;
    }

    public void setCaloricDensity(short caloricDensity) {
        this.caloricDensity = caloricDensity;
    }

    public short getCarbs() {
        return carbs;
    }

    public void setCarbs(short carbs) {
        this.carbs = carbs;
    }

    public short getProteins() {
        return proteins;
    }

    public void setProteins(short proteins) {
        this.proteins = proteins;
    }

    public short getFats() {
        return fats;
    }

    public void setFats(short fats) {
        this.fats = fats;
    }

    @Override
    public String toString() {
        return "NutritionalValues{" + "caloricDensity=" + caloricDensity + ", carbs=" + carbs + ", proteins=" + proteins + ", fats=" + fats + '}';
    }
    
     
}
