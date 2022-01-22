package w_skip;

public class Book {

    private String name;
    private int copies;

    public Book(String name, int copies) {
        this.name = name;
        this.copies = copies;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCopies() {
        return copies;
    }

    public void setCopies(int copies) {
        this.copies = copies;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", copies=" + copies +
                '}';
    }
}
