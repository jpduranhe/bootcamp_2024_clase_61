package cl.bootcamp.clase_61;

import java.util.Scanner;

import cl.bootcamp.clase_61.calculadora.Calculadora;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Calculainador" );
        
        Calculadora calculadora= new Calculadora();
        
        
        Scanner sc= new Scanner(System.in);
        
        
        System.out.print("Ingresa el num1:");
        int num1=sc.nextInt();
        
        System.out.println();
        
        System.out.print("Ingresa el num2:");
        int num2=sc.nextInt();
        
        
        System.out.println();
        
        System.out.print("El Resultado es:"+calculadora.sumar(num1, num2));
        
        
        
    }
}
