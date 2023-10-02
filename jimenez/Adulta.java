package com.jimenez;
//Determina si una persona es adulta y no es jubilada.

import com.sun.org.apache.bcel.internal.util.Args;

public class Adulta {
    public static void main(String[] args ){
        int edadAdulta = 18;
        boolean adultoJubilado =false;
        
        if (edadAdulta >= 18 && !adultoJubilado){
            System.out.print("Eres adulto y estas jubilado");
        } else {
            System.out.print("Eres una persona adulta pero no estas jubilado");
            
        }
    }

}
