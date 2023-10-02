package com.jimenez;

public class Triangulo {

        public static void main(String[] args) {
            int lado1 = 2;
            int lado2 = 8;
            int lado3 = 5;

            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("El triángulo es equilátero.");
            } else if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3) {
                System.out.println("El triángulo es isósceles.");
            } else {
                System.out.println("El triángulo no es equilátero ni isósceles.");
            }
        }
    }


