package com.company;

import java.util.Observable;
import java.util.Observer;

public class HeadHunter implements Observer{
    @Override
    public void update(Observable o, Object message) {
        System.out.println("Powiadamianie head huntera");
        System.out.println(message);
    }
}
