package session22;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

//Comparators
public class ComparatorApply {

    public static void main(String[] args){
        List<Book> books = new ArrayList<>();

        books.add(new Book("La Biblia", 1000));
        books.add(new Book("Don Quijote de la mancha", 500));
        books.add(new Book("Historia de dos ciudades", 200));
        books.add(new Book("El Hobbit", 140));
        books.add(new Book("El principito", 100));

        Comparator<Book> comparator;

        if( books.stream().count() > 3)
            comparator = Comparator.comparing(book1 -> book1.getCopies());
        else
            comparator= Comparator.comparing(book2 -> book2.getName());

        books.stream()
                .sorted(comparator)
                .limit(3)
                .forEach(book-> System.out.println(book.getName()));
    }
}
