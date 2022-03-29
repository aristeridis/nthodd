/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nthodd;

import java.util.List;
import java.util.Scanner;
import java.util.*;

/**
 *
 * @author alexandrosaristeridis
 */
public class NthOdd {
    public Integer nth(List<Integer> list,Integer n){
        int elem=n-1;
        if (elem>list.size()){
        System.out.println("-1");
        }else{
            list.get(elem);
        }
        return list.get(elem);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Integer> lista=new ArrayList<Integer>();
        NthOdd ntha=new NthOdd();
        Scanner s = new Scanner(System.in);
         System.out.println("Enter n: ");  
          int n=s.nextInt();
        Scanner scanner =new Scanner (System.in);

        while (true) {
            System.out.println("Please enter num: ");
            lista.add(scanner.nextInt());

            System.out.println("Do you want to add a directory yes/no?");
            String answer = scanner.next(); 
            if (answer.equals("no")){
                System.out.println("Thanks for adding to the ArrayList");
                System.out.println("\t "+lista);
                break; //
            }

        }
        System.out.println("return " + ntha.nth(lista,n));
    }
}
