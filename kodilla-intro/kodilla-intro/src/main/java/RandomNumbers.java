public class RandomNumbers {
    RandomNumbers random = new RandomNumbers();

    private int min;
    private int max;
    int maximum = 5000;
    int result = 0;

    public void losowanie() {
        int sum = 0;
        int temp = 0;
        this.min = 30;
        this.max = 0;
        while (sum < maximum) {
            temp = random.nextInt(31);
            sum = sum + temp;

            if (temp > this.max) {
                this.max = temp;
            }
            if (temp < this.min) {
                this.min = temp;
            }
        }
    }

    private int nextInt(double i) {
        return 0;
    }

    public int getMax() {
        return this.max;
    }

    public int getMin() {
        return this.min;
    }


    public static void main(String[] args) {
        RandomNumbers losowanie = new RandomNumbers();
        losowanie.losowanie();
        System.out.println("Min: " + losowanie.getMin());
        System.out.println("Max: " + losowanie.getMax());
    }
}