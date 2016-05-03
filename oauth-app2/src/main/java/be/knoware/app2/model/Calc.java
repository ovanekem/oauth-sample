package be.knoware.app2.model;

/**
 * Created by ovanekem on 03/05/16.
 */
public class Calc {

    private int a;
    private int b;
    private int min;

    public Calc(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void minAandB() {
        min = a - b;
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

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }
}
