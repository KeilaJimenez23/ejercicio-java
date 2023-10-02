package com.jimenez;
//Comprueba si un número es negativo o si es cero.
public class Negativo {
    public static void main(String[] args) {
        int numeroInt = -20;

        if(numeroInt == 0 ){
            System.out.print("El numero intorducido es 0");
        } else if (numeroInt < 0) {
            System.out.print("tienes un numero negativo ya que es menor a 0");
        }
        else {
            System.out.print("tu numero no es cero ni es negativo");
        }
    }
}
