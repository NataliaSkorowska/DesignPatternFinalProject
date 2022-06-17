package com.company;

public class Main {
    public static void main(String[] args) {

        SimpleControl controler = new SimpleControl();
        Computer computer = new Computer();
        Browser browser = new Browser();

        controler.setCommand(new ComputerOpenCommand(computer));
        controler.doAction();
        controler.setCommand(new BrowserOpenEdgeCommand(browser));
        controler.doAction();
        controler.setCommand(new BrowserCloseCommand(browser));
        controler.doAction();
    }
}
