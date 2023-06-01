/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.datast;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

/**
 *
 * @author Home
 */
public class Process {
    
    /*Book book;
    
    public int countLines(File file){
        System.out.println("Counting lines");
        int total=0;
        try {
            FileReader isr = new FileReader(file);
            BufferedReader bf = new BufferedReader(isr);
            String line;
            line=bf.readLine();
            int lines=0;
            while(true){
                line=bf.readLine();
                if(line==null)
                    break;
                lines++;
            }
            total=lines;
            bf.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("t"+total);
        return total;
    }
    
    public void searchBooks(Book[] books){
        book = new Book();
        String name;
        Scanner type = new Scanner(System.in);
        System.out.println("Type Author Name or book title");
        name = type.nextLine();
        
        book.listBook(books, name);
        
        for (Book book : books) {
            //search for title with part of typed text
            if(book.getTitle().toLowerCase().contains(name.toLowerCase())){
                System.out.println("Id............................:"+book.getId());
                System.out.println("Title........................:"+book.getTitle());
                System.out.println("Author........................:"+book.getAuthor());
                System.out.println("----------------");
            }
            //search by Author with parts of the text typed
            if(book.getAuthor().toLowerCase().contains(name.toLowerCase())){
                System.out.println("Id........:"+book.getId());
                System.out.println("Title.....:"+book.getTitle());
                System.out.println("Author....:"+book.getAuthor());
                System.out.println("----------------");
            }
            
        }
    }*/
}
