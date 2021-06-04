/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.io.File;

/**
 *Clase abstracta que contiene los valores nutricionales que comparten la clase Recipe y la Clase Product y sus 
 * clases herederas
 * @author Cándido Vidal
 */
public abstract class NutritionalValues {
    private short caloricDensity; //each 100 grams
    private short carbs; //each 100 grams
    private short proteins; //each 100 grams
    private short fats; //each 100 grams
    private boolean vegan; 
    private boolean halal; 
    private boolean highProtein;
    private boolean lowCarb;
   

   /**
    * Constructor de la clase 
    * @param caloricDensity la densidad calórica cada 100 gramos de producto 
    * @param carbs la densidad de carbohidratos cada 100 gramos de producto 
    * @param proteins la densidad de proteínas cada 100 gramos de producto 
    * @param fats la densidad de grasas cada 100 gramos de producto 
    * @param vegan booleano que devuelve true si el producto es vegano o false si no lo es 
    * @param halal booleano que devuelve true si el producto es halal false si no lo es 
    * @param highProtein booleano que devuelve true si el producto es indicado paa dietas altas en proteínas o false si no lo es 
    * @param lowCarb booleano que devuelve true si el producto es bajo en carbohidratos o false si no lo es 
    */

    public NutritionalValues(short caloricDensity, short carbs, short proteins, short fats, boolean vegan,
			boolean halal, boolean highProtein, boolean lowCarb) {
		super();
		this.caloricDensity = caloricDensity;
		this.carbs = carbs;
		this.proteins = proteins;
		this.fats = fats;
		this.vegan = vegan;
		this.halal = halal;
		this.highProtein = highProtein;
		this.lowCarb = lowCarb;
	}
        /**
         * función para obtener la densidad calórica de un producto 
         * @return la densidad calórica del producto 
         */
	public short getCaloricDensity() {
        return caloricDensity;
    }
     /**
      * función para establecer la densidad calórica de un producto 
      * 
      * @param caloricDensity  la densidad calórica de un producto 
      */
    public void setCaloricDensity(short caloricDensity) {
        this.caloricDensity = caloricDensity;
    }
     /**
      * función para obtener la densidad de carbohidratos  de un producto o receta
      * 
      * @return la densidad de carbohidratos  de un producto o receta
      */
    public short getCarbs() {
        return carbs;
    }
    /**función para definir la densidad de carbohidratos  de un producto o receta
     * 
     * @param carbs la densidad de carbohidratos  de un producto o receta
     */

    public void setCarbs(short carbs) {
        this.carbs = carbs;
    }

    
    /**función para obtener la densidad  proteica  de un producto o receta
      * 
     * 
     * @return la densidad  proteica  de un producto o receta
     */
    public short getProteins() {
        return proteins;
    }
     /**función para definir la densidad proteica  de un producto o receta
     * 
      * 
      * @param proteins la densidad proteica  de un producto o receta
      */
    public void setProteins(short proteins) {
        this.proteins = proteins;
    }

    /**
     * función para obtener la densidad  de grasas de un producto o receta
     * @return la densidad  de grasas de un producto o receta
     */
    public short getFats() {
        return fats;
    }

    
    /**unción para definir la densidad  de grasas de un producto o receta
     * 
     * @param fats la densidad  de grasas de un producto o receta
     */
    public void setFats(short fats) {
        this.fats = fats;
    }

   
    
     
}
