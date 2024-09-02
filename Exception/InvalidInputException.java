package Exception;

import java.util.Scanner;

public class InvalidInputException {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter your name");
           obj.next();

    }
}
