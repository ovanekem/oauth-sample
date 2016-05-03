package be.knoware.app1.model;

/**
 * Created by ovanekem on 03/05/16.
 */
public class Calc {

    private int a;
    private int b;
    private int sum;

    public Calc(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void sumAandB() {
        sum = a + b;
    }


    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }
}
