public class Calculator {
    private int a;
    private int b;
    private int sum;

    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    int getSum() {
        this.sum = this.a + this.b;
        return this.sum;
    }

    int getMax() {
        if (this.a > this.b)
            return this.a;
        return this.b;
    }
}