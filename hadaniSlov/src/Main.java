import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter your letter");
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        HadaniSlov hadanislov = new HadaniSlovImp();
        while (!"konec".equals(line)) {
            System.out.println(hadanislov.CheckWord(line));
            line = sc.nextLine();
        }
    }
}