package com.jimenez;
// Verifica si una persona tiene acceso a una sala VIP si es mayor de edad o si tiene
//una invitación especial
public class Vip {
    public static void main(String[] args){
        boolean invitacionEspecial = true;
        int edadPer = 13;

        if (edadPer >= 18 && !invitacionEspecial){
            System.out.print("Puedes pasar");
        } else if (edadPer < 18 && invitacionEspecial) {
            System.out.print("Eres menor de edad pero tienes invitacion especial,puedes pasar");

        } else {
            System.out.print("No puedes pasar");
        }
    }

}
