package com.company;
import java.util.Observable;
import java.util.Observer;

public class Coach implements Observer {
    @Override
    public void update(Observable o, Object message) {
        System.out.println("Powiadamianie trenera");
        System.out.println(message);
    }
}
