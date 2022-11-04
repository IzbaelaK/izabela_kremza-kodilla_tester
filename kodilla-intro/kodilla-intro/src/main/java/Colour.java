import java.util.Scanner;

public class Colour {
    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);

        while(true) {
                System.out.println("Podaj pierwszą literę koloru");
                String litera = scanner.nextLine();


                switch (litera) {
                    case "r": System.out.println("różowy");
                    break;
                    case "n": System.out.println("niebieski");
                    break;
                    case "z": System.out.println("zielony");
                    break;
                    case "c": System.out.println("czerwony" + ", " + "czarny");
                    break;
                    case "ź": System.out.println("żółty");
                    break;
                    case "f": System.out.println("fioletowy");
                    break;
                }
            }
}
}
