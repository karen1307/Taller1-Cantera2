package com.sofka;

import Taller1.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Main {

    public static void main(String[] args) throws ParseException {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy"); //Definimos el formato que esperamos
        Date dateBirth = formato.parse("13/07/1997"); //convertimos el date tipo string a tipo Date para agregar la fecha formateada
        /*inicializar constructor de clases*/
        Notebook notebook = new Notebook(100, "Carta", "Cuadriculado");
        BankAccount bankAccount = new BankAccount(8472146, true);
        Fruit fruit = new Fruit("Mango", 400);
        Book book = new Book("It", "Stephen King", "Terror");
        Dog dog = new Dog("Tobby", "Poodle", 7, 8);
        Person person = new Person("Karen", "Fonseca", "Moreno", dateBirth, (float)1.70);

        /*Manejo de objetos*/
        System.out.println("Objeto Notebook");
        System.out.println("Tipo de cuaderno: " + notebook.getTypeOfSheets());
        notebook.write();
        System.out.println("Objeto Bank account");
        System.out.println("Numero de cuenta: " + bankAccount.getAccountNumber());
        bankAccount.accountStatus();
        System.out.println("Objeto Fruit");
        System.out.println("Nombre: " + fruit.getName());
        System.out.println("Peso promedio: " + fruit.getAverageWeight());
        System.out.println("Colores: " + fruit.getColors());
        System.out.println("Objeto Book");
        System.out.println("Nombre del libro: " + book.getNameBook());
        System.out.println("Autor del libro: " + book.getAutorName());
        System.out.println("Genero del libro: " + book.getKindOfBook());
        book.readBook();
        System.out.println("Objeto Dog");
        System.out.println("Nombre del perro: " + dog.getDogname());
        System.out.println("Raza del perro: " + dog.getRace());
        System.out.println("Peso en kilos: " + dog.getWeight());
        System.out.println("Años del perro: " + dog.getAge());
        dog.bark();
        System.out.println("Objeto Person");
        System.out.println("Nombre de la persona: " + person.getName());
        System.out.println("Primer apellido: " + person.getLastName1());
        System.out.println("Fecha de nacimiento: " + person.getDateBirth());
        System.out.println("Estatura: "+ person.getHeight());
    }
}
