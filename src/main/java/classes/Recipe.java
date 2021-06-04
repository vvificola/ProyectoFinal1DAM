/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import preferenceEnums.DietaryRestrictions;
import preferenceEnums.RecipeDifficulty;
import preferenceEnums.TypeOfCooking;

import java.util.ArrayList;

/**
 * Clase que contiene las Recetas y las rutas de archivo a sus imágenes así como
 * otros parámetros importantes como su dificultad o el tipo de cocina al que
 * pertenencen
 *
 * @author Cándido Vidal
 */
public class Recipe extends NutritionalValues {

    private String name;
    private String filePath;
    private RecipeDifficulty difficulty;
    private TypeOfCooking style;
    private ArrayList<Product> ingredients = new ArrayList<Product>();
    private String description;
    private boolean needsHeat; //true needs heat
    private ArrayList<DietaryRestrictions> restrictions;

    /**
     * Constructor de la clase Recipe
     *
     * @param name nombre de la receta
     * @param description descricpión de la receta (enlace URL)
     * @param difficulty dificultad de la receta en fucnión de unas etiquetas
     * fijas
     * @param style familia gastronómica a la que pertenece la receta
     * @param caloricDensity densidad calórica de la receta
     * @param carbs densidad de carbohidratos de la receta
     * @param proteins densidad de proteínas de la receta
     * @param fats densidad de grasas de la receta
     * @param vegan booleano que devuelve true si el producto es vegano o false
     * si no lo es
     * @param halal booleano que devuelve true si el producto es halal false si
     * no lo es
     * @param highProtein booleano que devuelve true si el producto es indicado
     * paa dietas altas en proteínas o false si no lo es
     * @param lowCarb booleano que devuelve true si el producto es bajo en
     * carbohidratos o false si no lo es
     * @param needsHeat booleano que devuelve true si la receta necesita de una
     * fuente de calor
     * @param restrictions array que contiene las restricciones alimentarias de
     * la receta
     * @param ingredients ingredientes de la receta
     */
    public Recipe(String name, String description, RecipeDifficulty difficulty, TypeOfCooking style, short caloricDensity, short carbs, short proteins, short fats, boolean vegan, boolean halal,
            boolean highProtein, boolean lowCarb, boolean needsHeat, ArrayList<DietaryRestrictions> restrictions, ArrayList<Product> ingredients) {
        super(caloricDensity, carbs, proteins, fats, vegan, halal, highProtein, lowCarb);
        this.name = name;
        this.difficulty = difficulty;
        this.style = style;
        this.ingredients = ingredients;
        this.description = description;
        this.needsHeat = needsHeat;
        this.restrictions = restrictions;
    }

    /**
     * Segundo constructor de la clase. Los parámet
     *
     * @param name nombre de la receta
     * @param filePath ruta relativa a la imagen de la receta
     * @param caloricDensity densidad calórica de la receta
     * @param carbs densidad de carbohidratos de la receta
     * @param proteins densidad de proteínas de la receta
     * @param fats densidad de grasas de la receta
     * @param vegan booleano que devuelve true si el producto es vegano o false si no lo es
     * @param halal booleano que devuelve true si el producto es halal false si no lo es
     * @param highProtein booleano que devuelve true si el producto es indicado para dietas altas en proteínas o false si no lo es carbohidratos o false si no lo es
     */
    public Recipe(String name, String filePath, short caloricDensity, short carbs, short proteins, short fats, boolean vegan, boolean halal,
            boolean highProtein, boolean lowCarb) {
        super(caloricDensity, carbs, proteins, fats, vegan, halal, highProtein, lowCarb);
        this.name = name;
        this.filePath = filePath;

    }
      /**
       * Función que devuelve el nombre de la receta
       * @return el nombre de la receta
       */
    public String getName() {
        return name;
    }
     /**
      * Función que establece el nombre de la receta 
      * @param name el nombre de la receta
      */
    public void setName(String name) {
        this.name = name;
    }
    /**Función que devuelve el estilo de la receta
     * 
     * @return el nombre de la receta
     */
    public TypeOfCooking getStyle() {
        return style;
    }
     /**
      * Función que define el estilo de la receta
      * @param style el estilo de la receta
      */
    public void setStyle(TypeOfCooking style) {
        this.style = style;
    }
    /**
     * Función que obtiene los ingredientes de la receta 
     * @return los ingredientes de la receta
     */
    public ArrayList<Product> getIngredients() {
        return ingredients;
    }
      /**
       * Función que establece los ingredientes de la receta recibiendo y devolviendo un ArrayList de ingredientes
       * @param ingredients el array con los ingredientes de la receta
       */
    public void setIngredients(ArrayList<Product> ingredients) {
        this.ingredients = ingredients;
    }
    /**
     * Función que devuelve  si una receta necesita o no calor (true necesita)
     * @return 
     */
    public boolean isNeedHeat() {
        return needsHeat;
    }
    /**
     * Funcion que define si una receta necesita o no calor 
     * @param needHeat 
     */
    public void setNeedHeat(boolean needHeat) {
        this.needsHeat = needHeat;
    }
     /**
      * Función que obtiene la dificultad de una receta 
      * @return la dificultad de una receta 
      */
    public RecipeDifficulty getDifficulty() {
        return difficulty;
    }
     /**
      * Función que define la dificultad de una receta 
      * @param difficulty la dificultad de una receta  
      */
    public void setDifficulty(RecipeDifficulty difficulty) {
        this.difficulty = difficulty;
    }

    
    /**
     * Función que obtiene el string de descripción de una receta (ya sea URL o descripcion)
     * @return 
     */
    public String getDescription() {
        return description;
    }
    /**Fucnión que establece el string de descripción de una receta (ya sea URL o descripcion)
     * 
     * @param description l string de descripción de una receta (ya sea URL o descripcion)
     */
    public void setDescription(String description) {
        this.description = description;
    }

}
