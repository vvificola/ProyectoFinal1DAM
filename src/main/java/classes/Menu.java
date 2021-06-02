/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.util.ArrayList;
import java.util.HashMap;
import enums.DayofWeek;

/**
 *
 * @author carlac
 */
public class Menu {
    
    private HashMap<DayofWeek, Recipe> planningDesayuno;
    private HashMap  <DayofWeek, ArrayList <Recipe>> planningComida;
    private HashMap  <DayofWeek, ArrayList <Recipe>> planningCena;
    
    
    
    
	public Menu(HashMap<DayofWeek, Recipe> planningDesayuno,
			HashMap<DayofWeek, ArrayList<Recipe>> planningComida, HashMap<DayofWeek, ArrayList<Recipe>> planningCena) {
		super();
		this.planningDesayuno = planningDesayuno;
		this.planningComida = planningComida;
		this.planningCena = planningCena;
	}





	public HashMap<DayofWeek, Recipe> getPlanningDesayuno() {
		return planningDesayuno;
	}




	public void setPlanningDesayuno(User u, ArrayList <Recipe> recetasDesayuno, String path) {
		
		
		 
		
	}




	public HashMap<DayofWeek, ArrayList<Recipe>> getPlanningComida() {
		return planningComida;
	}




	public void setPlanningComida(HashMap<DayofWeek, ArrayList<Recipe>> planningComida) {
		this.planningComida = planningComida;
	}




	public HashMap<DayofWeek, ArrayList<Recipe>> getPlanningCena() {
		return planningCena;
	}




	public void setPlanningCena(HashMap<DayofWeek, ArrayList<Recipe>> planningCena) {
		this.planningCena = planningCena;
	}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}