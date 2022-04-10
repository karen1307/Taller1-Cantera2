package Taller1;

public class Notebook {
    /* variables de la clase */
    private int numberOfSheets; /*inicializacion de variable numero de hojas tipo entero*/
    public String size; /*inicializacion de variable tamaño tipo String*/
    private String typeOfSheets; /*inicializacion de variable tipo de hojas tipo String*/

    /*contructor*/
    /* asignacion de variables*/
    public Notebook(int numberOfSheets, String size, String typeOfSheets) {
        this.numberOfSheets = numberOfSheets;
        this.size = size;
        this.typeOfSheets = typeOfSheets;
    }

    /* metodos*/
    /* obtener numero de hojas*/
    public int getNumberOfSheets() {
        return numberOfSheets;
    }
    /* asignar numero de hojas*/
    public void setNumberOfSheets(int numberOfSheets) {
        this.numberOfSheets = numberOfSheets;
    }
    /* obtener tamaño*/
    public String getSize() {
        return size;
    }
    /* asignar tamaño*/
    public void setSize(String size) {
        this.size = size;
    }
    /* obtener tipo de hojas*/
    public String getTypeOfSheets() {
        return typeOfSheets;
    }
    /* asignar tipo de hojas*/
    public void setTypeOfSheets(String typeOfSheets) {
        this.typeOfSheets = typeOfSheets;
    }

    public void write(){
        System.out.println("Escribiendo...");
        counterSheets();
    }

    private void counterSheets() {
        numberOfSheets = numberOfSheets -1;
    }

}
