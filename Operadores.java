/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operadores;
import java.util.Scanner;

/**
 *
 * @author autologon
 */
public class Operadores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        int a = 10; 
        int b = 98;
        int c = 17;
        int d = 23;
        int e = 39;
        boolean status = false; //true ou flase
        char letra = 'a';
        float numero = (float) 3.14;
        double n1 = 3.11;
        String palavra = "uma palavra ou várias";
        System.out.println("adição de A e B: " +(a+b));
        System.out.println("Subtração de A e B: " +(a+b));
        System.out.println("Multiplicação de A e B: " +(a*b));
        System.out.println("Quociente de A e B:" +(a/b));
        System.out.println("Modulo de A e B:"+(a%b));
        
        //Media
        System.out.println("A soma dos valores A+B+C+D+E :" +(a+b+c+d+e) );
        System.out.println("A média dos valores :" +(a+b+c+d+e)/(5));
        
        
        
        
        
        n1= n1 + 1;
        n1++;
        n1+= 2;
        n1= n1 - 1;
        n1--;
        //n1-= 2;
        
        //verificar se o numero é impar
        System.out.println("Digite um número");
        int verifica = scann.nextInt();
        
        if (verifica %2==0){
            System.out.println("Número par");
        }  
        else{
            System.out.println("Número impar");
    }
        
            
            
            
            
      
                
                
        
        
        
        
        //byte n3;
        //long n4
        //short n5;
        //StringBuilder string;
        //StringBuffer String;
        
        
        
        
    }
    
}
