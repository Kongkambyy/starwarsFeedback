import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Character[] characters = {new Jedi(), new Sith(), new Droid()};

        String brugerValg;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Vælg en af de følgende muligheder:");
            System.out.println("1. Se en Droid");
            System.out.println("2. Se en Jedi");
            System.out.println("3. Se en Sith");
            System.out.println("4. Se alle Star Wars karaktere");
            System.out.println("5. Luk programmet");

            brugerValg = scanner.nextLine().toLowerCase();

            switch (brugerValg) {
                case "1":
                    characters[0].action();
                    break;
                case "2":
                    characters[1].action();
                    break;
                case "3":
                    characters[2].action();
                    break;
                case "4":
                    for (Character character : characters) {
                        character.action();
                    }
                    break;
                case "5":
                    System.out.println("Afslutter programmet, vent venligst...");
                    break;
                default:
                    System.out.println("Ugyldigt tal, indtast venligst et korrekt tal");
                    break;
            }
        } while (!brugerValg.equals("5"));

        scanner.close();
    }
}