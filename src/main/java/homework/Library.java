package homework;

public class Library {
    public static void main(String[] args) {
        Author autor = new Author("Gherasim Gabriel","gabi@yahoo.com");
        Book carte = new Book("Bibliografie",2024,autor,120);
        System.out.println("Book "+carte.getName()+" ("+carte.getPrice()+" RON), by "+carte.getAuthor()+", published in "+carte.getYear());

    }
}
