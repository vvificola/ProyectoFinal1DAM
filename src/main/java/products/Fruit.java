/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package products;

import java.util.ArrayList;

import classes.Product;
import preferenceEnums.DietaryRestrictions;
import preferenceEnums.Storage;
import typeOfEnums.TypeOfFish;
import typeOfEnums.TypeOfFruit;

/**
 * 
 * Clase que modela los productos del tipo fruta 
 *
 * @author Cándido Vidal 
 */
public class Fruit  extends Product {
    private TypeOfFruit typeOfFruit;
           /**
            * 
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
            * @param typeOfFruit tipo de fruta
            */
	public Fruit(String productName, short caloricDensity, short carbs, short proteins, short fats, boolean vegan,
			boolean halal, boolean highProtein, boolean lowCarb, short weight, Storage storage,
			ArrayList<DietaryRestrictions> restrictions, TypeOfFruit typeOfFruit) {
		super(productName, caloricDensity, carbs, proteins, fats, vegan, halal, highProtein, lowCarb, weight, storage,
				restrictions);
		this.typeOfFruit = typeOfFruit;
	}

    
    
 
}
