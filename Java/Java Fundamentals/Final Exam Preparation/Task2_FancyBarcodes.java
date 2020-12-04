import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2_FancyBarcodes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int barcodeCount = Integer.parseInt(scanner.nextLine());
        String productGroup = "";
//100/100
        for (int i = 0; i < barcodeCount; i++) {
            String barcode = scanner.nextLine();
            String regex = "@[#]+(?<type>[A-Z][A-Za-z0-9]{4,}[A-Z])@[#]+";

            Pattern barcodePattern = Pattern.compile(regex);
            Matcher barcodeMatcher = barcodePattern.matcher(barcode);

            if (barcodeMatcher.find()) {
                String code = barcodeMatcher.group("type");
                for (int j = 0; j < code.length(); j++) {
                    if (Character.isDigit(code.charAt(j))) {
                        productGroup += code.charAt(j);
                    }
                }
                if (productGroup.equals("")) {
                    System.out.println("Product group: 00");
                } else {
                    System.out.println("Product group: " + productGroup);
                    productGroup = "";
                }

            } else {
                System.out.println("Invalid barcode");
            }


        }
    }
}

