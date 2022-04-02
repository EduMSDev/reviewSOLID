package singleresponsibility.badexample;

/*It breaks with the principle of responsibility because it is in charge of managing how the book is saved.
Why? Because it can be saved in many ways, and even if it doesn't now, later we may need to implement those different ways of saving the workbook.
How to implement these different ways would be to break with the principle of responsibility
because it would do more than one thing, the correct thing would be to extract it as it is done in the correct example.*/
public class Book {
    private String title;
    private String author;

    public void turnPage() {
        System.out.println("turn pages");
    }

    public void turnPageBack() {
        System.out.println("turn pages back");
    }

    public void save() {
        System.out.println("save information page");
    }

}
