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
 * Clase que contiene 3 hashmaps con las planificaciones semanales de Desayuno,
 * Comida y Cena para poder almacenar favoritos. 
 * 
 * NO IMPLEMENTADA EN ESTA VERSIÓN
 *
 * @author Candido Vidal C
 */
public class Menu {

    /**
     * Constructor de la clase Menu que permite almacenar los menús semanales
     *
     */
    private HashMap<DayofWeek, Recipe> planningDesayuno;
    private HashMap<DayofWeek, Recipe> planningComida;
    private HashMap<DayofWeek, Recipe> planningCena;

    public Menu(HashMap<DayofWeek, Recipe> planningDesayuno, HashMap<DayofWeek, Recipe> planningComida, HashMap<DayofWeek, Recipe> planningCena) {
        this.planningDesayuno = planningDesayuno;
        this.planningComida = planningComida;
        this.planningCena = planningCena;
    }

    /**
     * Metodo que devuelve el hashMap con la planificacion de los desayunos
     * asociando una receta a cada dia de la semana
     *
     * @return el hashmap que contiene la planificación del desayuno
     */
    public HashMap<DayofWeek, Recipe> getPlanningDesayuno() {
        return planningDesayuno;
    }

    /**
     * Función que define la planificación de los desayunos en función de las
     * recetas del usuario y los dias de la semana recibiendo 3 parámetros
     *
     * @param u la instancia del usuario que está usando el programa
     * @param recetasDesayuno el array de las recetas que están etiquetadas como
     * BREAKFAST
     * @param path la ruta relativa de la imagen asociada a la receta
     */
    public void setPlanningDesayuno(User u, ArrayList<Recipe> recetasDesayuno, String path) {
        this.planningDesayuno = planningDesayuno;

    }

    /**
     * Función que devuelve el hashMap con la planificacion de loas comidas
     * asociando una receta a cada uno de los días de la semana
     *
     * @return el hashmap que contiene la planificación de los desayunos
     */
    public HashMap<DayofWeek, Recipe> getPlanningComida() {
        return planningComida;
    }
    
    /**
     * Función que define la planificación de los desayunos en función de las
     * recetas del usuario y los dias de la semana recibiendo 3 parámetros
     *
     * 
     * @param u la instancia del usuario que está usando el programa con sus parámetros propios
     * @param recetas el array de las recetas que están guardadas como permitidas por el usuario 
     * @param path la ruta relativa de la imagen asociada a la receta
     */
    public void setPlanningComida(User u, ArrayList<Recipe> recetas, String path) {
        this.planningComida = planningComida;
    }

    
    /**
     * Función que devuelve el hashMap con la planificacion de las cenas
     * asociando una receta a cada uno de los días de la semana
     *
     * @return el hashmap que contiene la planificación de las cenas
     */
    public HashMap<DayofWeek, Recipe> getPlanningCena() {
        return planningCena;
    }

    
    /**
     * Función que define la planificación de las cenas en función de las
     * recetas del usuario y los dias de la semana recibiendo 3 parámetros
     *
     * 
     * @param u la instancia del usuario que está usando el programa con sus parámetros propios
     * @param recetas el array de las recetas que están guardadas como permitidas por el usuario 
     * @param path la ruta relativa de la imagen asociada a la receta
     */
   public void setPlanningCena(User u, ArrayList<Recipe> recetasCena, String path) {
        this.planningComida = planningComida;
    }


}
