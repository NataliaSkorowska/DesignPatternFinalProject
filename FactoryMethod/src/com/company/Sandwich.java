package com.company;

public abstract class Sandwich {
    String name;
    String description;
    Integer kcal;
    Integer price;

    public String getName(){
        return name;
    }

    public String getDescription(){
        return description;
    }

    public Integer getKcal(){
        return  kcal;
    }
    public Integer getPrice(){
        return price;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setDescription(String description){
        this.description = description;
    }
    public void setKcal(int kcal){
        this.kcal = kcal;
    }
    public void setPrice(int price){
        this.price = price;
    }
    public void sandwichDetails(){
        System.out.println("Kanapka nazywa się " + name);
        System.out.println("Szczegóły: " + description);
        System.out.println("Ma " + kcal + " kalorii");
        System.out.println("Cena: " + price + " zł");
    };
    public abstract void opinionsAboutSandwich();
}

