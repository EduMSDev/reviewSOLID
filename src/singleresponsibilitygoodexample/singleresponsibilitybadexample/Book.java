package singleresponsibilitygoodexample.singleresponsibilitybadexample;

//Rompe con el principio de responsabilidad porque cambia la informacion del libro
//1- cambia la informacion del libro
//2 - La forma en que se guarda el libro
public class Book {
    private String title;
    private String author;

    public void turnPage() {
        System.out.println("turn pages");
    }

    public void turnPageBack() {
        System.out.println("turn pages back");
    }
}
