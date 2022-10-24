package Utils;

import java.util.Scanner;

public class InputARGS {
    static Scanner scanner = new Scanner(System.in);

    public static int inputnumber() {

        int num = 0;
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter digit try " + (i + 1));

            if (scanner.hasNextInt()) {
                num = scanner.nextInt();
                scanner.nextLine();
                break;
            } else {
                System.out.println("Error");
                scanner.next();
            }
            if (i == 2) {
                System.exit(0);
            }
        }

        return num;
    }

    public static char inputSimbol() {

        char simbol = 0;
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter simbol try " + (i + 1));

            simbol =  scanner.nextLine().charAt(0);
            if (simbol == '/' || simbol == '+' || simbol == '-' || simbol == '*' || simbol == '%') {
                return simbol;
            } else {
                System.out.println("ERROR");
                scanner.nextLine();
            }
            if (i == 2) {
                System.exit(0);
            }
        }

        return simbol;
    }
}
