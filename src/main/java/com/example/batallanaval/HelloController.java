package com.example.batallanaval;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.util.Duration;

public class HelloController {
    @FXML
    private Button botonEmpezar;
    @FXML
    private Label labelPrueba;

    int movimientoX = 5;
    int movimientoY = 5;

    public void moverBarco(Event event){
        Timeline mover = new Timeline(new KeyFrame(Duration.seconds(0.01), (ActionEvent ae)->{
            labelPrueba.setLayoutX(labelPrueba.getLayoutX() + movimientoX);
            labelPrueba.setLayoutY(labelPrueba.getLayoutY() + movimientoY);

            int numeroAleatorio = (int) (Math.random()*2+1);

            if (labelPrueba.getLayoutY() >= 751 && movimientoX == 5) {
                System.out.println("Numero aleatorio: " + numeroAleatorio);
                movimientoY = -5;
                labelPrueba.setRotate(0);
                labelPrueba.setRotate(315);
                numeroAleatorio = (int) (Math.random()*2+1);

            }

            if (labelPrueba.getLayoutY() >= 751 && movimientoX == 5 && numeroAleatorio==2) {
                System.out.println("Numero aleatorio: " + numeroAleatorio);
                movimientoY = -5;
                movimientoX = -5;
                labelPrueba.setRotate(0);
                labelPrueba.setRotate(135);
                numeroAleatorio = (int) (Math.random()*2+1);
            }

            if (labelPrueba.getLayoutY() >= 751 && movimientoX == -5) {
                movimientoY = -5;
                labelPrueba.setRotate(0);
                labelPrueba.setRotate(225);
            }

            //Cuando golpea derecha X

            if (labelPrueba.getLayoutX() >= 988 && movimientoY == 5) {
                movimientoX = -5;
                labelPrueba.setRotate(0);
                labelPrueba.setRotate(135);
            }

            if (labelPrueba.getLayoutX() >= 988 && movimientoY == -5) {
                movimientoX = -5;
                labelPrueba.setRotate(0);
                labelPrueba.setRotate(225);
            }

            //Cuando golpea arriba Y

            if (labelPrueba.getLayoutY() <= 0 && movimientoX==-5) {
                movimientoY = 5;
                labelPrueba.setRotate(0);
                labelPrueba.setRotate(135);
            }

            if (labelPrueba.getLayoutY() <= 0 && movimientoX== 5) {
                movimientoY = 5;
                labelPrueba.setRotate(0);
                labelPrueba.setRotate(45);
            }

            //Cuando golpea izquierda X


            if (labelPrueba.getLayoutX() <= 0 && movimientoY==5) {
                movimientoX = 5;
                labelPrueba.setRotate(0);
                labelPrueba.setRotate(45);
            }

            if (labelPrueba.getLayoutX() <= 0 && movimientoY==-5) {
                movimientoX = 5;
                labelPrueba.setRotate(0);
                labelPrueba.setRotate(315);
            }
        }));

        mover.setCycleCount(Timeline.INDEFINITE);
        mover.play();
    }

    public void initialize(){
        labelPrueba.setRotate(45);
    }

    @FXML
    public void moverBarco(ActionEvent actionEvent) {
    }
}