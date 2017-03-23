/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo_while;

import java.util.Scanner;

/**
 *
 * @author MANUEL
 */
public class Ejemplo_while {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        int a;
        System.out.println("Introducir un número entero(0 para terminar): ");
        a = s.nextInt();
       while (a!=0)
       {
        if (a>0)
                if (a%2==0)
                    System.out.println (a+" positivo y par");
                else 
                    System.out.println(a+" positivo e impar");
        else 
            if (a<0)
                if (a%2==0)
                    System.out.println(a+" negativo y par");
                else
                    System.out.println(a+" negativo e impar");
        System.out.println("Otro entero: ");
        a = s.nextInt();
       }  
    }
    
}
