package com.jimenez;
//Determina si una persona puede votar si es mayor de 18 años y no está inhabilitada
//legalmente.

public class Persona {
    public static void main(String[] args) {

        boolean personaInhabilitada = true;
        int edadPersona = 18;

        if (edadPersona >= 18 && !personaInhabilitada) {

            System.out.println("Puedes votar, eres mayor de edad y no estás inhabilitado legalmente.");
        } else if (edadPersona >= 18 && personaInhabilitada) {

            System.out.println("Eres mayor de edad, pero estás inhabilitado legalmente, por lo que no puedes votar.");
        }
        else {
            System.out.println("Eres menor de edad o estás inhabilitado legalmente, no puedes votar.");
        }
    }
}






