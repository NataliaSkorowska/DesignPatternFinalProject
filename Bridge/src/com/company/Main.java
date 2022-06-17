package com.company;

public class Main {

    public static void main(String[] args) {
        ClothingElement clothingElement1 = new Skirt(new BlackColor(), new CottonMaterial(), new MSize());
        clothingElement1.setColor();
        clothingElement1.chooseMaterial();
        clothingElement1.setSize();
        System.out.println("");

        ClothingElement clothingElement2  = new Pants(new GreenColor(), new SilkMaterial(), new LSize() );
        clothingElement2.setColor();
        clothingElement2.chooseMaterial();
        clothingElement2.setSize();
    }
}
abstract class ClothingElement{

    protected Color color;
    protected Fabric fabric;
    protected Size size;

     public ClothingElement(Color c, Fabric f, Size s) {
        this.color =  c;
        this.fabric = f;
        this.size = s;
    }
    abstract public void setColor();
    abstract public void chooseMaterial();
    abstract public void setSize();
}

interface Color {
    void setColor();
}
interface Fabric{
    void chooseMaterial();
}
interface Size{
    void setSize();
}

class GreenColor implements Color{
    @Override
    public void setColor() {
        System.out.print(" zielonym.");
    }
}
class BlackColor implements Color{
    @Override
    public void setColor() {
        System.out.print(" czarnym.");
    }
}

class CottonMaterial implements Fabric{
    @Override
    public  void chooseMaterial(){
        System.out.print(" bawełnę. ");
    }
}
class SilkMaterial implements Fabric{
    @Override
    public  void chooseMaterial(){
        System.out.print("jedwab.");
    }
}

class MSize implements Size{
    @Override
    public  void setSize(){
        System.out.print("M. ");
    }
}
class LSize implements Size{
    @Override
    public  void setSize(){
        System.out.print("L.");
    }
}

class Skirt extends ClothingElement{

    public Skirt(Color c, Fabric f, Size s) {
        super(c,f,s);
    }

    @Override
    public void setColor() {
        System.out.print("Stworzono spódnicę w kolorze");
        color.setColor();
    }

    @Override
    public void chooseMaterial() {
        System.out.print(" Do jej wyprodukowania wykorzystano:");
        fabric.chooseMaterial();
    }

    @Override
    public void setSize(){
        System.out.print("Rozmiar: ");
        size.setSize();
    }
}

class Pants extends ClothingElement{

    public Pants(Color c, Fabric f, Size s) {
        super(c,f,s);
    }

    @Override
    public void setColor() {
        System.out.print("Stworzono spodnie w kolorze:");
        color.setColor();
    }

    @Override
    public void chooseMaterial() {
        System.out.print(" Do ich produkcji wykorzystano: ");
        fabric.chooseMaterial();
    }

    @Override
    public void setSize(){
        System.out.print(" Rozmiar: ");
        size.setSize();
    }

}


