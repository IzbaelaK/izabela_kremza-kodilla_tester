public class SimpleArray {
    public static void main(String[] args) {

        String[] animal = new String[5];
        animal[0] = "Pies";
        animal[1] = "Kot";
        animal[2] = "Krowa";
        animal[3] = "Wąż";
        animal[4] = "Koń";
        System.out.println(animal[3]);
        int numberOfElements = animal.length;
        System.out.println(numberOfElements);
    }
}

