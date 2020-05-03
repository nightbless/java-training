import java.util.Scanner;

public class AgeDiscount {

    public static void main(String... args){
        Scanner scanner = new Scanner (System.in);
        int first, second;
        boolean isTrue = true;
        char sym = 'R';
        System.out.println("enter your age:");
        first = scanner.nextInt();
        if (first > 65)
            System.out.println("Discount equal 10 %");
            else if (first < 65)
            System.out.println("Try another age");
        System.out.println("enter second age:");
        second = scanner.nextInt();
        if (second < 18)
            System.out.println("Discount equal 18%");
            else if (second > 18)
                System.out.println("Try another age");
        System.out.println("For regular client discount 5%");



    }
}
