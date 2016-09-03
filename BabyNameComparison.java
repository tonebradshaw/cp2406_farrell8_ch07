import java.util.Scanner;

/**
 * Created by tony on 29/08/2016.
 */
public class BabyNameComparison {

    public static void main(String[] args) {

        String name1, name2, name3;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter 1st baby name: ");
        name1 = scanner.next();
        scanner = new Scanner(System.in);
        System.out.print("Please enter 2nd baby name: ");
        name2 = scanner.next();
        scanner = new Scanner(System.in);
        System.out.print("Please enter 3rd baby name: ");
        name3 = scanner.next();

        System.out.println(name1 + " " + name2);
        System.out.println(name1 + " " + name3);
        System.out.println(name2 + " " + name1);
        System.out.println(name2 + " " + name3);
        System.out.println(name3 + " " + name1);
        System.out.println(name3 + " " + name2);
    }
}
