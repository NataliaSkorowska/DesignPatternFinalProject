package com.company;
import java.util.ArrayList;

public class Zoo {
    static ArrayList<Animal> homeAnimalsList;
    static ArrayList<Animal> zooAnimalsList;

    static {
        homeAnimalsList = new ArrayList<Animal>();

        Animal cat = new Animal("Cristian kot");
        Animal dog = new Animal("Daisy pies");
        Animal rabbit = new Animal("Rico królik");
        Animal parrot = new Animal("Polly papuga");

        homeAnimalsList.add(cat);
        homeAnimalsList.add(dog);
        homeAnimalsList.add(rabbit);
        homeAnimalsList.add(parrot);

        zooAnimalsList = new ArrayList<Animal>();

        Animal lion = new Animal("Loius lew");
        Animal tiger= new Animal("Timon tygrys");
        Animal zebra = new Animal("Zoe zebra");

        zooAnimalsList.add(lion);
        zooAnimalsList.add(tiger);
        zooAnimalsList.add(zebra);
    }

    public static void checkHomeAnimalsHealth() {
        Vet vet = new Vet("Weterynarz: Anna Nowak");
        for (Animal animal : homeAnimalsList) {
            animal.accept(vet);
        }
    }

    public static void checkZooAnimalsHealth() {
        Vet vet = new Vet("Weterynarz: Paweł Kowalski");
        for (Animal animal : zooAnimalsList) {
            animal.accept(vet);
        }
    }

    public static void checkCleanStatus() {
        CareTaker careTaker= new CareTaker("Kacper Wiśniewski");
        for (Animal animal : zooAnimalsList) {
            animal.accept(careTaker);
        }
    }
}