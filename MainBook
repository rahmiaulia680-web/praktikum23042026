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
public class MainBook {

    public static void main(String[] args) {
        Author Rin = new Author("Rinaldi Munir","rinaldi@gmail.com",'m');
        System.out.print(Rin);
        
        Book dummybook = new Book("Algoritma dan Pemograman",Rin,98000,99);
        System.out.println(dummybook);
        dummybook.setPrice(120000);
        dummybook.setQty(88);
        System.out.println("Nama : "+dummybook.getNama());
        System.out.println("Price : "+dummybook.getPrice());
        System.out.println("Qty : "+dummybook.getQty());
        System.out.println("Author : "+dummybook.getAuthor());
        System.out.println("Author name : "+dummybook.getAuthor().getName());
        System.out.println("Author email : "+dummybook.getAuthor().getEmail());
        System.out.println("Authir gender : "+dummybook.getAuthor().getGender());
        
        Book newDummybook = new Book("Java for Dummies", new Author("Peter Lee","peter@gmail.com",'m'),19.99,8);
        System.out.println(newDummybook);
    }
    
}
