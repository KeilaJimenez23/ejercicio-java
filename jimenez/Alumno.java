package com.jimenez;

public class Alumno {
        public static void main(String[] args) {
            boolean aprobadoSi = true;
            int calificacion = 70;

            if (calificacion >= 60 && calificacion <= 100 && aprobadoSi) {
                System.out.println("El alumno aprobó.");
            } else {
                System.out.println("El alumno no aprobó.");
            }
        }
    }

