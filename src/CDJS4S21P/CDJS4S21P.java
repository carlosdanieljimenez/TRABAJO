/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package CDJS4S21P;

/**
 *
 * @author Carlos daniel
 */
public class CDJS4S21P {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // TODO code application logic here
        for (int a=1; a<args.length ;a++)
            if(args.length!=3){
                System.out.println("Da los siguientes datos que se te piden en argumentos: numero uno, operador y numero dos");
                System.exit(0);
            }int num1 = Integer.valueOf(args[0]);
            String operador = args[1];
            int num2 = Integer.valueOf(args[2]);
            int resultado = 0;
            switch(operador){
                case "+":
                    resultado = num1 + num2;
                    System.out.println("La suma de " + num1 + " y " + num2 + " es igual a " + resultado);
                    break;               
                case "-":
                    resultado = num1 - num2;
                    System.out.println("La resta de " + num1 + " y " + num2 + " es igual a " + resultado);
                    break;               
                case "x":
                    resultado = num1 * num2;
                    System.out.println("La multiplicacion de " + num1 + " y " + num2 + " es igual a " + resultado);
                    break;
                case "/":
                    if (num2 == 0){
                        System.out.println("El divisor no puede ser 0");
                    }else{
                        resultado = num1 / num2;
                        System.out.println("La division de " + num1 + " y " + num2 + " es igual a " + resultado);
                    }
                    break;
                default:
                    System.out.println("El operador " + operador + "no es valdio");                    
            }   
    }
    
}
