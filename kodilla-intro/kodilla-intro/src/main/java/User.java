public class User {
    public String name;
    public int age;


    public User (String name, int age) {
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

        User[] users = {jolanta, wanda, grażyna, halina, bożena, melania};

        double avg = averageOfAge(users);
        System.out.println("Average age of users: " + avg);
        youngerOfAverage(users);

    }
    public static double averageOfAge(User[] users) {
        double suma = 0;
        for (int i = 0; i < users.length; i++) {
            suma = suma + users[i].age;
        }
        return suma / users.length;
    }

    public static void youngerOfAverage(User[] users) {
        for (int i =0; i < users.length; i++) {
            if (users[i].age < averageOfAge(users)) {
                System.out.println(users[i].name);
            }
        }
    }
    }