package Taller1;

public class Book {
    private String nameBook; /*inicializacion de variable nombre del libro tipo string*/
    protected String autorName; /*inicializacion de variable nombre del autor tipo string*/
    public String kindOfBook; /*inicializacion de variable genero del libro tipo string*/

    /*contructor*/
    /* asignacion de variables*/
    public Book(String nameBook, String autorName, String kindOfBook) {
        this.nameBook = nameBook;
        this.autorName = autorName;
        this.kindOfBook = kindOfBook;
    }

    /* metodos*/
    /* obtener nombre del libro*/
    public String getNameBook() {
        return nameBook;
    }
    /* asignar nombre del libro*/
    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }
    /* obtener nombre del autor*/
    public String getAutorName() {
        return autorName;
    }
    /* asignar nombre del autor*/
    public void setAutorName(String autorName) {
        this.autorName = autorName;
    }
    /* obtener genero del libro*/
    public String getKindOfBook() {
        return kindOfBook;
    }
    /* asignar genero del libro*/
    public void setKindOfBook(String kindOfBook) {
        this.kindOfBook = kindOfBook;
    }
    /*Leer libro*/
    public void readBook(){
        System.out.println("Leyendo el libro: " + getNameBook());
    }
}
