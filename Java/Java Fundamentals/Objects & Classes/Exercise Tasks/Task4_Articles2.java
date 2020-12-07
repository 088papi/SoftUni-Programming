import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//100/100
public class Task4_Articles2 {
    static class Article {
        String title;
        String content;
        String author;

        public String getTitle() {
            return title;
        }

        public String getContent() {
            return content;
        }

        public String getAuthor() {
            return author;
        }

        public Article(String title, String content, String author) {
            this.title = title;
            this.content = content;
            this.author = author;
        }

        public String toString() {

            return String.format("%s - %s: %s", getTitle(),
                    getContent(), getAuthor());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<Article> articles = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] data = scanner.nextLine().split(", ");
            String title = data[0];
            String content = data[1];
            String author = data[2];

            Article article = new Article(title, content, author);
            articles.add(article);
        }
        String sortingType = scanner.nextLine();

        if (sortingType.equals("title")) {
            articles.stream()
                    .sorted((a1, a2) -> a1.getTitle().compareTo(a2.getTitle()))
                    .forEach(article -> System.out.println(article.toString()));
        } else if (sortingType.equals("content")) {
            articles.stream()
                    .sorted((a1, a2) -> a1.getContent().compareTo(a2.getContent()))
                    .forEach(article -> System.out.println(article.toString()));
        } else if (sortingType.equals("author")) {
            articles.stream()
                    .sorted((a1, a2) -> a1.getAuthor().compareTo(a2.getAuthor()))
                    .forEach(article -> System.out.println(article.toString()));
        }
    }
}
