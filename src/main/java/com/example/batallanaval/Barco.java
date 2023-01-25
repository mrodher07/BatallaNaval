package com.example.batallanaval;

public class Barco {

    String nombre;
    int velocidad;
    int potenciaDeFuego;
    int vida;
    int sonar;
    String equipo;



    int posX = 0;
    int posY = 0;
    int movX = 5;
    int movY = 5;

    public Barco(String nombre, int velocidad, int potenciaDeFuego, int vida, int sonar, String equipo){
        this.nombre = nombre;
        this.velocidad = velocidad;
        this.potenciaDeFuego = potenciaDeFuego;
        this.vida = vida;
        this.sonar = sonar;
        this.equipo = equipo;
    }

    public Barco(String nombre, String equipo){
        if(nombre.equals("Destructor")){
            this.nombre = nombre;
            this.velocidad = 5;
            this.potenciaDeFuego = 50;
            this.vida = 80;
            this.sonar = 15;
            this.equipo = equipo;
        } else if (nombre.equals("Acorazado")) {
            this.nombre = nombre;
            this.velocidad = 3;
            this.potenciaDeFuego = 80;
            this.vida = 120;
            this.sonar = 20;
            this.equipo = equipo;
        }else if (nombre.equals("Submarino")) {
            this.nombre = nombre;
            this.velocidad = 2;
            this.potenciaDeFuego = 60;
            this.vida = 30;
            this.sonar = 20;
            this.equipo = equipo;
        }else if (nombre.equals("Lancha")) {
            this.nombre = nombre;
            this.velocidad = 10;
            this.potenciaDeFuego = 20;
            this.vida = 10;
            this.sonar = 12;
            this.equipo = equipo;
        }
    }

}
