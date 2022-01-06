package session23;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Skip {
    public static void main(String[] args){

        List<Book> books = new ArrayList<>();

        books.add(new Book("La Biblia", 1000));
        books.add(new Book("Don Quijote de la mancha", 500));
        books.add(new Book("Historia de dos ciudades", 200));
        books.add(new Book("El Hobbit", 140));
        books.add(new Book("El principito", 100));

        //Get name of second and the third book most sold
        Comparator<Book> comparatorCopies = Comparator.comparing(book -> book.getCopies());
        books.stream()
                .sorted(comparatorCopies.reversed())
                .limit(3)
                .skip(1)
                .forEach(book-> System.out.println(book.getName()));
    }
}
