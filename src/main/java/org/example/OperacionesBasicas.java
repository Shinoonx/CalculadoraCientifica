package org.example;

public class OperacionesBasicas {
    public OperacionesBasicas(){
    }
    public static double suma(double nuemro1, double numero2){
        return nuemro1 + numero2;

    }
    public static double resta(double numero1, double numero2){

        return numero1 - numero2;
    }
    public static double division(double numero1, double numero2){

        return numero1 / numero2;
    }
    public static double multiplicacion(double numero1, double numero2){

        return numero1 * numero2;
    }
    public static double numeroMayor (double nuemro1, double numero2){

        return Math.max(nuemro1, numero2);
    }
    public static double numeroMenor (double numero1, double numero2){

        return Math.min(numero1, numero2);
    }
    public static double potencia (double numero1, double numero2){

        return Math.pow(numero1,numero2);
    }
    public static double porcentaje(double numero1, double numero2){

        return (numero1*numero2)/100;
    }

}

