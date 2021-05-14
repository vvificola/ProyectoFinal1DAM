/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;


import java.time.LocalDate;
/**
 *
 * @author carlac
 */
public class User {
    
    private String userName;
    private char[] password;
    private String email;
    private String firstName;
    private String lastName;
    private boolean genre;
    private short heigth; //en centímetros
    private short weigth; //en centímetros
    
    private Tokens tokens;
    private LocalDate birthDate;
    
    
}
