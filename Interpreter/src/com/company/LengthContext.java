package com.company;

public class LengthContext {
    private int input;
    private double output;

    public LengthContext(int in) {
        this.input = in;
    }
    public double getOutput() {
        return output;
    }
    public void setOutput(double out) {
        this.output = out;
    }
    public int getInput() {
        return input;
    }
    public void setInput(int in) {
        this.input = in;
    }
}
