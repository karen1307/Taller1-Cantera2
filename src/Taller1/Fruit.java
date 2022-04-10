package Taller1;

import java.util.ArrayList;

/**
 * Solicita datos de las frutas
 * @author Karen Nathaly Fonseca Moreno
 */

public class Fruit {
    /*variables*/
    public String name;/*inicializar nombre de la fruta tipo string*/
    private float averageWeight;/* inicializar peso promedio de la fruta en gramos tipo float*/
    public ArrayList<String> colors;/* inicializa color de la fruta tipo lista*/

    /*constructor*/
    /* asignacion de variables*/
    public Fruit(String name, float averageWeight) {
        this.name = name;
        this.averageWeight = averageWeight;
        this.colors = addColorFruit();
    }
    /*metodos*/
    /* obtener nombre de la fruta*/
    public String getName() {
        return name;
    }
    /* asignar nombre de la fruta*/
    public void setName(String name) {
        this.name = name;
    }
    /*obtener peso promedio de la fruta*/
    public float getAverageWeight() {
        return averageWeight;
    }
    /* asignar peso promedio de la fruta*/
    public void setAverageWeight(float averageWeight) {
        this.averageWeight = averageWeight;
    }
    /*obtener color de la fruta*/
    public ArrayList<String> getColors() {
        return colors;
    }
    /* asignar color de la fruta*/
    public void setColors(ArrayList<String> colors) {
        this.colors = colors;
    }
    //Agregar colores de las frutas
    private ArrayList<String> addColorFruit(){
        ArrayList<String> colors = new ArrayList<String>();
        colors.add("Verde");
        colors.add("Amarillo");
        return colors;
    }
}
