package session21;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Ordering2 {
    //Ordering objects from a list
    public static void main (String args[]){

        List<Book> books = new ArrayList<>();

        books.add(new Book("La Biblia", 1000));
        books.add(new Book("Don Quijote de la mancha", 500));
        books.add(new Book("Historia de dos ciudades", 200));
        books.add(new Book("El Hobbit", 140));
        books.add(new Book("El principito", 100));

        //Show in console books
        //ASC Ordering
        Comparator<Book> comparatorCopies = Comparator.comparing( book -> book.getCopies());
        books.stream()
                .sorted(comparatorCopies)
                .forEach(book-> System.out.println(book.getName()));

        System.out.println("\n---------------------\n");
        //DESC Ordering
        books.stream()
                .sorted(comparatorCopies.reversed())
                .forEach(book-> System.out.println(book.getName()));

        //Show in console the three books most sold
        books.stream()
                .sorted(comparatorCopies)
                .limit(3)
                .forEach(book-> System.out.println(book.getName()));
    }
}
