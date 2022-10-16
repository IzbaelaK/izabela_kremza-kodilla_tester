public class Notebook {
    int weight;
    int price;
    int year;

    public Notebook(int weight, int price, int year) {
        this.weight = weight;
        this.price = price;
        this.year = year;

    }

    public void checkPrice() {
        if (this.price < 600) {
            System.out.println("This notebook is very cheap.");
            if (this.price > 600 && this.price < 1000) ;
            System.out.println("The price is good.");
        } else {
            System.out.println("This notebook is quite expensive.");
        }
    }

    public void checkWeight() {
        if (this.weight <= 600) {
        System.out.println("Urządzenie jest lekkie");
        if (this.weight > 600 && this.weight < 1900);
        System.out.println("Urządzenie jest niezbyt ciężkie");
    } else {
        System.out.println("Urządzenie jest ciężkie");
    }
}

    public void checkYear() {
        if (this.year < 2000) {
            System.out.println("Urządzenie jest bardzo stare");
            if (this.year > 2000 && this.weight < 2010) ;
            System.out.println("Urządzenie jest niezbyt nowe"); }
        else {System.out.println("Urządzenie jest nowsze ale i droższe.");
        }
    }}