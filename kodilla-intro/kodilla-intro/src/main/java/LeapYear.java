public class LeapYear {
    public static void main(String[] args) {
        int rok = 2024;

        System.out.println(rok);

        if (rok%4!=0) {
            System.out.println("Rok nie przestępny");
        } else if (rok % 100 != 0) {
            System.out.println("Rok przestępny");
        } else if (rok % 400 != 0) {
            System.out.println("Rok nie przestępny");
        } else
            System.out.println("Rok przestępny");
    }
}

