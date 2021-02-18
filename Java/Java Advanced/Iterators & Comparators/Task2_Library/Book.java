
import java.util.Arrays;
import java.util.List;

public class Book {

    private String title;
    private int year;
    private List<String> authors;

    public Book(String title, int year, String... values) {
        setTitle(title);
        setYear(year);
        setAuthors(values);

    }

    private void setAuthors(String[] values) {
        this.authors = Arrays.asList(values);
    }
    private void setTitle(String title) {
        this.title = title;
    }
    private void setYear(int year) {
        this.year = year;
    }


}
