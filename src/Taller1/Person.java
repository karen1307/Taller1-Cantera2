package Taller1;

import java.util.Date;

/**
 * Solicita los datos personales
 * @author Karen Nathaly Fonseca Moreno
 */
public class Person {
    /* variables de la clase */
    public String name;/*inicializacion de variable nombre tipo string */
    public String lastName1;/*inicializacion de variable primer apellido tipo string */
    public String lastName2;/*inicializacion de variable segundo apellido tipo string */
    public Date dateBirth;/*inicializacion de variable fecha de cumpleaños tipo date*/
    public float height;/*inicializacion de variable estatura tipo float*/
    /* constructor*/
    /* asignacion de variables*/
    public Person(String name, String lastName1, String lastName2, Date dateBirth, float height) {
        this.name = name;
        this.lastName1 = lastName1;
        this.lastName2 = lastName2;
        this.dateBirth = dateBirth;
        this.height = height;
    }
    /*metodo*/
    /* obtener nombre*/
    public String getName() {
        return name;
    }
    /* asignar nombre*/
    public void setName(String name) {
        this.name = name;
    }
    /* obtener primer apellido*/
    public String getLastName1() {
        return lastName1;
    }
    /* asignar primer apellido*/
    public void setLastName1(String lastName1) {
        this.lastName1 = lastName1;
    }
    /* obtener segundo apellido*/
    public String getLastName2() {
        return lastName2;
    }
    /* asignar segundo apellido*/
    public void setLastName2(String lastName2) {
        this.lastName2 = lastName2;
    }
    /* obtener fecha de nacimiento*/
    public Date getDateBirth() {
        return dateBirth;
    }
    /* asignar fecha de nacimiento*/
    public void setDateBirth(Date dateBirth) {
        this.dateBirth = dateBirth;
    }
    /*obtener estatura*/
    public float getHeight() {
        return height;
    }
    /* asignar estatura*/
    public void setHeight(float height) {
        this.height = height;
    }
}
