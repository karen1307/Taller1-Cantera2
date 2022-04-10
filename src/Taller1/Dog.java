package Taller1;
/**
 * Solicita los datos perro
 * @author Karen Nathaly Fonseca Moreno
 */

public class Dog {
    /* variables de la clase */
    public String dogname;/*inicializacion de variable nombre del perro tipo string*/
    public String race;/*inicializacion de variable raza tipo string*/
    public float  weight;/*inicializacion de variable peso en kilos tipo float*/
    public int age;/* inicializacion de la variable edad tipo entero*/
    private boolean potentiallyDangerous; /* inicializacion de la variable potencialmente peligroso tipo boolean*/

    /*contructor*/
    /* asignacion de variables*/
    public Dog(String dogname, String race, float weight, int age) {
        this.dogname = dogname;
        this.race = race;
        this.weight = weight;
        this.age = age;
        this. potentiallyDangerous = potentiallyDangerous = false;
    }

    /* metodos*/
    /* obtener nombre del perro*/
    public String getDogname() {
        return dogname;
    }
    /* asignar nombre del perro*/
    public void setDogname(String dogname) {
        this.dogname = dogname;
    }
    /* obtener raza del perro*/
    public String getRace() {
        return race;
    }
    /* asignar raza del perro*/
    public void setRace(String race) {
        this.race = race;
    }
    /* obtener peso del perro*/
    public float getWeight() {
        return weight;
    }
    /* asignar peso del perro*/
    public void setWeight(float weight) {
        this.weight = weight;
    }
    /* obtener edad del perro*/
    public int getAge() {
        return age;
    }
    /* asignar edad del perro*/
    public void setAge(int age) {
        this.age = age;
    }
    /*perro ladra*/
    public void bark (){
        System.out.println("Guau Guau");
    }
    /*validar si un perro es potencialmente peligroso, clase protegida para usarla en subclases de razas de perro*/
    protected void validateRace(){
        if(race.equals("Rottweiler")){
            System.out.println("Raza potencialmente peligrosa");
            potentiallyDangerous = true; //si la raza es Rottweiler, se cambia el estado a verdadero
        }
    }
}
