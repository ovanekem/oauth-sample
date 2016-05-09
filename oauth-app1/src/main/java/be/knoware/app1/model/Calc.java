package be.knoware.app1.model;

/**
 * Created by ovanekem on 03/05/16.
 */
public class Calc {

    private int a;
    private int b;
    private int result;

    public Calc(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void sumAandB() {
        result = a + b;
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

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }
}
