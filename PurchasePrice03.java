import java.util.Scanner;

public class PurchasePrice03 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String bookBrand;
        int pageCount, price, quantity;
        double discount, totalPrice, purchasePrice, totalDiscount;

        System.out.println("Input book brand: ");
        bookBrand = input.nextLine();

        System.out.println("Input page count: ");
        pageCount = input.nextInt();

        System.out.println("Input price: ");
        price = input.nextInt();

        System.out.println("Input quantity: ");
        quantity = input.nextInt();

        System.out.println("Input discount percentage: ");
        discount = input.nextDouble();

        totalPrice = price * quantity;
        totalDiscount = totalPrice * (discount / 100);  // Convert discount to a percentage
        purchasePrice = totalPrice - totalDiscount;

        System.out.println("Book Brand: " + bookBrand);
        System.out.println("Page Count: " + pageCount);
        System.out.println("Total discount: " + totalDiscount);
        System.out.println("Final purchase price: " + purchasePrice);
    }
}
