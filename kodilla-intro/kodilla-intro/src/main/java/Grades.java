public class Grades {
    private int[] grades;
    private int size;

    public Grades() {
        this.grades = new int[10];
        this.size = 0;
    }

    public void add(int value) {
        if (this.size == 10) {
            return;
        }
        this.grades[this.size] = value;
        this.size++;
    }

    public int lastOne(int value) {
        return (this.grades[this.size]);
    }

    public double averageOfgrades() {
        double suma = 0;
        for (int i = 0; i < this.size; i++); {
            suma+= grades [i];
        }
        return suma/grades;
    }
}
