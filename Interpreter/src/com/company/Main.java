package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Konwersja 10 centymentrów na metry");
        LengthContext cmLength = new LengthContext(10);
        LengthExpression cmConvert = new LengthExpression.CMConverter();
        cmConvert.interpret(cmLength, "m");
        System.out.println("Po konwersji: "+cmLength.getOutput() + " m");

        System.out.println("Konwersja 10 milimetrów na decymetry");
        LengthContext mmLength = new LengthContext(10);
        LengthExpression mmConvert = new LengthExpression.MMConverter();
        mmConvert.interpret(mmLength, "dm");
        System.out.println("Po konwersji: "+mmLength.getOutput() + " dm");

        System.out.println("Konwersja 10 metrów na milimetry");
        LengthContext mLength = new LengthContext(10);
        LengthExpression mConvert = new LengthExpression.MConverter();
        mConvert.interpret(mLength, "mm");
        System.out.println("Po konwersji: "+mLength.getOutput() + " mm");

    }
}
