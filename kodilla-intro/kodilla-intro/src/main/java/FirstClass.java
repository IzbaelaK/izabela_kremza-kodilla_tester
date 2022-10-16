public class FirstClass {                           // [1]
    public static void main(String[] args) {         // [2]
        Notebook notebook = new Notebook(600, 1000, 2010);
        System.out.println(notebook.weight + " " + notebook.price);
        notebook.checkPrice();
        Notebook heavyNotebook = new Notebook(2000, 1500,2020);
        System.out.println(heavyNotebook.weight + " " + heavyNotebook.price);
        heavyNotebook.checkPrice();
        Notebook oldNotebook = new Notebook(1600, 500,2000);
        System.out.println(oldNotebook.weight + " " + oldNotebook.price);
        oldNotebook.checkPrice();

        if (notebook.price < 600) {
            System.out.println("This notebook is very cheap.");
            if (notebook.price < 600 && notebook.price < 1000) ;
            System.out.println("The price is good.");
            if (notebook.price > 1000) ;
            System.out.println("This notebook is quite expensive.");
        } else {
            System.out.println("This notebook is quite expensive.");
        }

        if (notebook.weight <= 600) {
            System.out.println("Urządzenie jest lekkie");
            if (notebook.weight > 600 && notebook.weight < 1900);
            System.out.println("Urządzenie jest niezbyt ciężkie");
        } else {
            System.out.println("Urządzenie jest ciężkie");
        }
        if (notebook.year < 2012 && notebook.price <= 600) {
            System.out.println("Urządzenie jest niezbyt nowe, ale tanie.");
            if (oldNotebook.year < 2010 && oldNotebook.price > 999);
            System.out.println("Urządzenie jest niezbyt nowe i drogie");
        } else {
            System.out.println("Urządzenie jest nowsze ale i droższe.");
    }
}}


