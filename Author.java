/*
 * Nama : Rahmi Aulia
 * NIM  : 2501083021
 * Desk :
*/
package com.mycompany.praktikum23042026;

/**
 *
 * @author Rahmi Aulia
 */
public class Author {
    private final String name;
    private String email;
    private final char gender;
    
    public Author(String nama, String email, char gender){
        this.name = nama;
        this.email = email;
        this.gender = gender;
    }
    
    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email= email;
    }
    public char getGender(){
        return gender;
    }
    public String toString() {
    return "Author[name=" + name + ", email=" + email + ", gender=" + gender + "]";
    }
}
