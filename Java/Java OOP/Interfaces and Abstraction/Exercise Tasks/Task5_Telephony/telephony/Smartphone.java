package telephony;

import java.util.ArrayList;
import java.util.List;

public class Smartphone implements Callable, Browsable {
    private List<String> numbers;
    private List<String> urls;

    public Smartphone(List<String> numbers, List<String> urls) {
        this.setNumbers(numbers);
        this.setUrls(urls);
    }

    private void setNumbers(List<String> numbers) {
        this.numbers = numbers;
    }

    private void setUrls(List<String> urls) {
        this.urls = urls;
    }

    @Override
    public String browse() {
        StringBuilder stringBuilder = new StringBuilder();
        appendURL(stringBuilder);
        return stringBuilder.toString().trim();
    }
    @Override
    public String call() {
        StringBuilder stringBuilder = new StringBuilder();
        appendCall(stringBuilder);


        return stringBuilder.toString().trim();
    }





    private void appendURL(StringBuilder stringBuilder) {
        urls.forEach(a -> {
            boolean isFound = false;

            for (int i = 0; i < a.length(); i++) {
                if (Character.isDigit(a.charAt(i))) {
                    stringBuilder
                            .append("Invalid URL!")
                            .append(System.lineSeparator());
                    isFound = true;
                    break;
                }
            }
            if (!isFound) {
                stringBuilder
                        .append("Browsing: ")
                        .append(a)
                        .append("!")
                        .append(System.lineSeparator());

            }
        });
    }



    private void appendCall(StringBuilder stringBuilder) {
        numbers.forEach(a -> {

            boolean isFound = false;

            for (int i = 0; i < a.length(); i++) {
                if (Character.isAlphabetic(a.charAt(i))) {
                    stringBuilder
                            .append("Invalid number!")
                            .append(System.lineSeparator());
                    isFound = true;
                    break;
                }
            }
            if (!isFound) {
                stringBuilder
                        .append("Calling... ")
                        .append(a)
                        .append(System.lineSeparator());
            }
        });
    }
}
