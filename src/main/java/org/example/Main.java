package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        _menu();
    }
    public static void _menu(){
     Scanner teclado = new Scanner(System.in);
     int opcion;
     do {
         System.out.println("");
         System.out.println("Caluladora Cientifica");
         System.out.println("1.-");
         System.out.println("2.- Geometria Vol/Ar/Per");
         System.out.println("3.-");
         System.out.println("4.-");
         System.out.println("5.-");
         System.out.println("6.- Salir");
         System.out.println("Seleccione una opcion");
         opcion = teclado.nextInt();
         switch (opcion){
             case 1:
                 break;
             case 2:
                 _menu2();
                 break;
             case 3:
                 break;
             case 4:
                 break;
             case 5:
                 System.out.println("Ingresa las coordenadas del primer punto de la recta (x1,y1):");
                 double x1 = teclado.nextDouble();
                 double y1 = teclado.nextDouble();
                 System.out.println("Ingresa las coordenadas del Segundo punto de la recta (x2,y2):");
                 double x2 = teclado.nextDouble();
                 double y2 = teclado.nextDouble();
                 String ecuacion = calcularEcRecta(x1,y1,x2,y2);
                 System.out.println("La Solucion es: " + ecuacion);
                 break;
             case 6:
                 System.out.println("ByeBye");
                 System.exit(0);
                 break;
             default:
                 System.out.println("Opcion no valida");
                 break;
             }
         }while (opcion !=6);
    }

    public static String calcularEcRecta(double x1, double y1, double x2,double  y2){
        double m = (y2 - y1) / (x2 - x1);
        double b = y1 - m * x1;

        return "y = " + m + "x + " + b;
    }

    public static void _menu2() {
        Scanner teclado = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("");
            System.out.println("Menu Geometria");
            System.out.println("1.-Perimetro Cuadrado");
            System.out.println("2.-Área Cuadrado");
            System.out.println("3.-Perimetro Rectangulo");
            System.out.println("4.-Área Rectangulo");
            System.out.println("5.-Área Circulo");
            System.out.println("6.-Perimetro Circulo");
            System.out.println("7.-Periemtro Cubo");
            System.out.println("8.-Área Cubo");
            System.out.println("9.-Volumen Cubo");
            System.out.println("10.-Esfera");
            System.out.println("11.-Esfera");
            System.out.println("12.-Cono");
            System.out.println("13.-Cono");
            System.out.println("14.-Volver a Menu Principal");
            System.out.println("15.-Apagar");
            System.out.println("Seleccione una opcion");
            opcion = teclado.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Ingresa el lado del cuadrado:");
                    double n1 = teclado.nextDouble();
                    perimetroCuadrado(n1);
                    break;
                case 2:
                    System.out.println("Ingresa el lado del cuadrado:");
                    double n2 = teclado.nextDouble();
                    areaCuadrado(n2);
                    break;
                case 3:
                    System.out.println("Ingresa el largo del rectangulo:");
                    double a1 = teclado.nextDouble();
                    System.out.println("Ingrese el ancho del rectangulo:");
                    double a2 = teclado.nextDouble();
                    double resultadoPR = perimetroRectangulo(a1, a2);
                    System.out.println("El perimetro del rectangulo es: "+resultadoPR);
                    break;
                case 4:
                    System.out.println("Ingresa el largo del rectangulo:");
                    double b1 = teclado.nextDouble();
                    System.out.println("Ingrese el ancho del rectangulo:");
                    double b2 = teclado.nextDouble();
                    double resultadoAR = areaRectangulo(b1, b2);
                    System.out.println("El area del rectangulo es: "+resultadoAR);
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    break;
                case 10:
                    break;
                case 11:
                    break;
                case 12:
                    break;
                case 13:
                    break;
                case 14:
                    break;
                case 15:
                    System.out.println("ByeBye");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        }while (opcion !=15);
    }
    public static double perimetroCuadrado(double lado){
        System.out.println("El perimetro del Cuadrao es: "+lado*4);
        return lado * 4;
    }
    public static double areaCuadrado(double lado){
        System.out.println("El area del Cuadrao es: "+lado*lado);
        return lado * lado;
    }
    public static double perimetroRectangulo(double a1, double a2){
        double result = (a1*2) + (a2*2);
        return result;
    }
    public static double areaRectangulo(double b1, double b2){
        double result = b1 * b2;
        return result;
    }
    public static double areaCirculo(double radio){
        double result = Math.PI * radio * radio;
        return result;
    }
    public static double perimetroCirculo(double radio){
        double result = 2 * Math.PI * radio;
        return result;
    }
    public static double volumenCubo(double lado){
        double result = lado * lado * lado;
        return result;
    }
    public static double areaCubo(double lado){
        double result = lado * lado * lado;
        return result;
    }

}