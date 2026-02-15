/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication3;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class JavaApplication3 {

  public static void main(String[] args) {
      ejercicio5();
  
  }
  
  public static void ejercico1() {
     // Solicitar un entero y determinar sí es múltiplo de 3 y además que se encuentre en el rango (100-200).
         Scanner input = new Scanner(System.in);
        
        System.out.print("Ingrese un número entero: ");
        int numero = input.nextInt();
        
        if (numero % 3 == 0 && numero > 100 && numero < 200) {
        System.out.println("El número es múltiplo de 3 y está en un rango de(100-200).");
        
        }else{
          System.out.println("El número no cumple ninguna condicion.");
          
             }
            
        }
  
  
  public static void ejercicio2() { 
     //leer la fecha de nacimiento de una persona y muestre su signo zodiacal.
       Scanner lector = new Scanner(System.in);
     
     System.out.print("Ingrese el dia de nacimiento ");
     int dia = lector.nextInt();
     
     System.out.print("Ingrese el mes de nacimiento");
     int mes = lector.nextInt(); 
     String signo = "";

    // Validación básica
    if (dia < 1 || dia > 31 || mes < 1 || mes > 12) {
        System.out.println("Fecha inválida");
    } else {

        switch (mes) {

            case 1:
                if (dia <= 19)
                    signo = "Capricornio";
                else
                    signo = "Acuario";
                break;

            case 2:
                if (dia <= 18)
                    signo = "Acuario";
                else
                    signo = "Piscis";
                break;

            case 3:
                if (dia <= 20)
                    signo = "Piscis";
                else
                    signo = "Aries";
                break;

            case 4:
                if (dia <= 19)
                    signo = "Aries";
                else
                    signo = "Tauro";
                break;

            case 5:
                if (dia <= 20)
                    signo = "Tauro";
                else
                    signo = "Géminis";
                break;

            case 6:
                if (dia <= 20)
                    signo = "Géminis";
                else
                    signo = "Cáncer";
                break;

            case 7:
                if (dia <= 22)
                    signo = "Cáncer";
                else
                    signo = "Leo";
                break;

            case 8:
                if (dia <= 22)
                    signo = "Leo";
                else
                    signo = "Virgo";
                break;

            case 9:
                if (dia <= 22)
                    signo = "Virgo";
                else
                    signo = "Libra";
                break;

            case 10:
                if (dia <= 22)
                    signo = "Libra";
                else
                    signo = "Escorpio";
                break;

            case 11:
                if (dia <= 21)
                    signo = "Escorpio";
                else
                    signo = "Sagitario";
                break;

            case 12:
                if (dia <= 21)
                    signo = "Sagitario";
                else
                    signo = "Capricornio";
                break;
        }

        System.out.println("Su signo zodiacal es: " + signo);
     
       }
    }
   
    public static void  ejercio3() {
    // Solicita el valor del producto, el valor del descuento y calcula el valor a pagar.
        Scanner entrada = new Scanner(System.in);

        // Solicitar valor del producto
        System.out.print("Ingrese el valor del producto: ");
        double valorProducto = entrada.nextDouble();

        // Solicitar porcentaje de descuento
        System.out.print("Ingrese el porcentaje de descuento: ");
        double descuento = entrada.nextDouble();

        // Calcular valor del descuento
        double valorDescuento = valorProducto * (descuento / 100);

        // Calcular valor final a pagar
        double valorPagar = valorProducto - valorDescuento;

        // Mostrar resultados
        System.out.println("El valor del descuento es: " + valorDescuento);
        System.out.println("El valor total a pagar es: " + valorPagar);

    
    }
     public static void ejercicio4() {
        Scanner entrada = new Scanner(System.in);
        //Hallar el mayor de tres números y mostrar los tres organizados de menor a mayor.

        // Pedir los tres números 
        System.out.print("por favor Ingrese el primer número: ");
        double num1 = entrada.nextDouble();

        System.out.print("por favor Ingrese el segundo número: ");
        double num2 = entrada.nextDouble();

        System.out.print("por favor Ingrese el tercer número: ");
        double num3 = entrada.nextDouble();

        // Hallar el mayor
        double mayor = num1;

        if (num2 > mayor) {
            mayor = num2;
        }

        if (num3 > mayor) {
            mayor = num3;
        }

        // Ordenar de menor a mayor
        double menor,medio;

        if (num1 <= num2 && num1 <= num3) {
            menor = num1;
            if (num2 <= num3) {
                medio = num2;
                mayor = num3;
            } else {
                medio = num3;
                mayor = num2;
            }
        } else if (num2 <= num1 && num2 <= num3) {
            menor = num2;
            if (num1 <= num3) {
                medio = num1;
                mayor = num3;
            } else {
                medio = num3;
                mayor = num1;
            }
        } else {
            menor = num3;
            if (num1 <= num2) {
                medio = num1;
                mayor = num2;
            } else {
                medio = num2;
                mayor = num1;
            }
        }

        // Mostrar resultados
        System.out.println("El mayor es: " + mayor);
        System.out.println("Números ordenados de menor a mayor: "
                + menor + " - " + medio + " - " + mayor);
        
    }
       public static void ejercicio5() {
        //Solicitar una fecha y hallar el día posterior teniendo en cuenta la cantidad de días de cada mes y también tener en cuenta el cambio de año.

        Scanner dato = new Scanner(System.in);

        // Solicitar la fecha
        System.out.print("Ingrese el día: ");
        int dia = dato.nextInt();

        System.out.print("Ingrese el mes: ");
        int mes = dato.nextInt();

        System.out.print("Ingrese el año: ");
        int año = dato.nextInt();

        // Determinar si el año es bisiesto
        boolean esBisiesto = false;

        if ((año % 4 == 0 && año % 100 != 0) || (año % 400 == 0)) {
            esBisiesto = true;
        }

        // Determinar cantidad de días del mes
        int diasMes = 0;

        switch (mes) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                diasMes = 31;
                break;

            case 4: case 6: case 9: case 11:
                diasMes = 30;
                break;

            case 2:
                if (esBisiesto) {
                    diasMes = 29;
                } else {
                    diasMes = 28;
                }
                break;

            default:
                System.out.println("Mes inválido");
                return;
        }

        // Calcular el día posterior
        dia++;

        if (dia > diasMes) {
            dia = 1;
            mes++;

            if (mes > 12) {
                mes = 1;
                año++;
            }
        }

        // Mostrar resultado
        System.out.println("El día posterior es: " + dia + "/" + mes + "/" + año);
    }
 }
      
      
      

     
  








   