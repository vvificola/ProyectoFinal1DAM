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
 * Clase que contiene y construye los productos alimentarios que componen las recetas 
 * @author Cándido Vidal 
 */
public class Product  extends NutritionalValues {
    
    private String productName;
    private Short weight;
    //el tipo de almacenamiento 
    private Storage storage;
   
    private ArrayList <DietaryRestrictions> restrictions = new ArrayList <DietaryRestrictions>();
   

    

	

            /**
             * Constructor de la clase con variables propias y heradedas de la clasee  NutritionalValues 
             * @param productName el nombre del producto o receta
             * @param caloricDensity la densidad calórica del producto o receta 
             * @param carbs la densidad de carbohidratos del producto o receta 
             * @param proteins la densidad proteica del producto o receta
             * @param fats la desnidad de grasas del producto o receta
             * @param vegan booelano que develve true si el producto o receta es apto para dietas veganas
             * @param halal booleano que devuelve true si el producto o receta es apto para dietas halal
             * @param highProtein booleano que devuelve true si el producto o receta es apto para dietas altas en proteínas 
             * @param lowCarb booleano que devuelve true si el producto o receta es apto para dietas bajas en carbohidratos
             * @param weight variable que almacena el peso del producto necesaria para implementar una futura clase Pantry con la que el usuario pueda gestioanr su stock de alimentos
             * @param storage tipo de almacenamiento del producto
             * @param restrictions array que contiene todas las restricciones 
             */

	public Product(String productName, short caloricDensity, short carbs, short proteins, short fats, boolean vegan, boolean halal,
			boolean highProtein, boolean lowCarb,  short weight, Storage storage,
			ArrayList<DietaryRestrictions> restrictions) {
		super(caloricDensity, carbs, proteins, fats, vegan, halal, highProtein, lowCarb);
		this.productName = productName;
		this.weight = weight;
		this.storage = storage;
		this.restrictions = restrictions;
	}


           /**
            * Funcion que establece las resticciones alimentarias y las almacena en un arraylist 
             * @param vegan booelano que develve true si el producto o receta es apto para dietas veganas
             * @param halal booleano que devuelve true si el producto o receta es apto para dietas halal
             * @param highProtein booleano que devuelve true si el producto o receta es apto para dietas altas en proteínas 
             * @param lowCarb booleano que devuelve true si el producto o receta es apto para dietas bajas en carbohidratos
            */
	public void setRestrictions(boolean vegan, boolean halal, boolean highProtein, boolean lowCarb) {
		
		      if (vegan) {restrictions.add(DietaryRestrictions.VEGAN);
			
		}else if (halal) {restrictions.add(DietaryRestrictions.HALAL);
			
		} else if (highProtein){restrictions.add(DietaryRestrictions.HIGHPROTEIN); 
			
		}else if (lowCarb) {restrictions.add(DietaryRestrictions.LOWCARB);}
	}

	
     /**
      * Función que devuelve el nombre del producto 
      * @return el nombre del producto 
      */
	public String getProductName() {
        return productName;
    }
    /**
     * Función que recibe y establece el nombre del producto 
     * 
     * @param productName el nombre del producto 
     */
    public void setProductName(String productName) {
        this.productName = productName;
    }

    
      /**
        Función que devuelve el peso del producto 
      * @return el peso del producto  
       */
    public Short getWeight() {
        return weight;
    }

    
    /**
     * unción que recibe y establece el peso del producto
     * @param weight el peso del producto
     */
    public void setWeight(Short weight) {
        this.weight = weight;
    }

    
    /**
     * Función que devuelve el tipo de almacenaje del producto 
     * @return el tipo de almacenaje del producto 
     */
    public Storage getStorage() {
        return storage;
    }

    
    /**Función que establece el tipo de almacenaje del producto 
     * 
     * @param storage el tipo del almacenage del producto de la Clase Storage
     */
    public void setStorage(Storage storage) {
        this.storage = storage;
    }

  

	
     
    
}
