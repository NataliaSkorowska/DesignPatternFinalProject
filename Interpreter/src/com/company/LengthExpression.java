package com.company;

public abstract class LengthExpression {
    public abstract double m(int input);
    public abstract double dm(int input);
    public abstract double cm(int input);
    public abstract double mm(int input);

    public void interpret(LengthContext context, String type){
        if(type=="m"){
            context.setOutput(m(context.getInput()));
        }else if(type=="dm"){
            context.setOutput(dm(context.getInput()));
        }else if(type=="cm"){
            context.setOutput(cm(context.getInput()));
        }else if(type=="mm"){
            context.setOutput(mm(context.getInput()));
        }
    }
public static class MConverter extends LengthExpression {
    public double m(int input) {return input;}
    public double dm(int input) {return input * 10;}
    public double cm(int input) {
        return input * 100;
    }
    public double mm(int input) {
        return input * 1000;
    }
}

public static class DMConverter extends LengthExpression {
    public double m(int input) {
        return input * 0.1;
    }
    public double dm(int input) {
        return input ;
    }
    public double cm(int input ) {return input * 10;}
    public double mm(int input) {
        return input * 100;
    }
}

public static class CMConverter extends LengthExpression {
    public double m(int input) {
        return input * 0.01;
    }
    public double dm(int input) {return input * 0.1;}
    public double cm(int input) {
        return input;
    }
    public double mm(int input) {
        return input * 10;
    }
}

public static class MMConverter extends LengthExpression {
    public double m(int input) {
        return input * 0.001;
    }
    public double dm(int input) {return input * 0.01;}
    public double cm(int input) {
        return input * 0.1;
    }
    public double mm(int input) {return input;}
    }
}
