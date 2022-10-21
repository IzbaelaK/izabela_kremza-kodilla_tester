public class Grades2 {
    private int[] grades2;
    private int size;
    private int i;


    public Grades2 (){
        this.grades2 = new int[10];
        this.size = 0;
    }

    public void add(int value) {
        if (this.size == 10) {
            return;
        }
        this.grades2[this.size] = value;
        this.size++;
    }

    public int lastOne() {
        return this.grades2[this.size -1];
    }

    public double averageOfgrades() {
        double suma = 0;
        for (int i = 0; i < this.size; i++); {
            suma+= suma + this.grades2[i];
        }
        return suma/this.size;
    }
    public static void main(String[]args) {
        Grades2 grades2 = new Grades2();
        grades2.add(4);
        grades2.add(3);
        grades2.add(2);
        System.out.println(grades2.lastOne());
        System.out.println(grades2.averageOfgrades());

    }}
