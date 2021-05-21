/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import enums.TypeOfCooking;
import java.util.ArrayList;
import restrictionsEnums.RecipeDifficulty;

/**
 *
 * @author carlac
 */
public class Recipes {
    
    private String name;
    private TypeOfCooking style; 
    private ArrayList<Product> ingredients;
    private boolean needHeat; //true needs heat
    private RecipeDifficulty difficulty;
    private String description;
    
    
}
