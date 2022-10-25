public class User {
    static User[] user;
    String name;
    int age;
    int i;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {

        User jolanta = new User("Jolanta", 35);
        User wanda = new User("Wanda", 38);
        User grażyna = new User("Grażyna", 28);
        User halina = new User("Halina", 25);
        User bożena = new User("Bożena", 60);
        User melania = new User("Melania", 15);

        User[] user = {jolanta, wanda, grażyna, halina, bożena, melania};
    }

    public double averageOfAge() {
        double suma = 0;
        for (int i = 0; i < user.length; i++) {
            suma = suma + user[i].age;
        }
        return suma / user.length;
    }

    public void youngerOfaverage() {
        if (user[i].age < averageOfAge()) {
            System.out.println(user[i].name);
        }
    }}