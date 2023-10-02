package com.jimenez;

public class Verifica {
    public static void main(String[] args) {
        int numero = 60;

        if (numero < 50) {
            System.out.println("El número ingresado es menor que 50.");
        } else if (numero > 100) {
            System.out.println("El número ingresado es mayor que 100.");
        } else {
            System.out.println("El número que ingresaste es mayor que 50  y menor que 100");
        }
    }
}