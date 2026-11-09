  // 1. Crea una clase Book con atributos title y author. Crea un objeto y muestra sus datos.
  public class Book{
    String title;
    String autor;
    int isbn;
    public Book(String title, String autor, int isbn){
        this.title = title;
        this.autor = autor;
        this.isbn = isbn;
    }
    public void showData(){
        System.out.println("Title: " + title + "\nAuthor: " + autor + "\nISBN: " + isbn);
    }
  }