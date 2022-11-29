package cz.vse;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner scanner = new Scanner(System.in);
        String input = null;
        do {
            input = scanner.nextLine();
            System.out.println("Napsal jsi " + input);
            if ("Konec".equals(input)) {
                break;
            }
        } while (scanner.hasNext());

    }
}