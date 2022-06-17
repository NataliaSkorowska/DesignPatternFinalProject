package com.company;
public class Toy implements ToyState{

    private ToyState toyOn;
    private ToyCry toyCry;
    private ToyState toyOff;
    private ToyState state;

    public Toy(){
        this.toyOn = new ToyOn(this);
        this.toyOff = new ToyOff(this);
        this.toyCry = new ToyCry(this);
        this.state = toyOn;
    }

    public void setToyState(ToyState state){
        this.state = state;
    }

    @Override
    public void walk() {
        state.walk();
    }

    @Override
    public void cry() {
        state.cry();
    }

    @Override
    public void off() {
        state.off();
    }

    public ToyState getToyOn() {
        return toyOn;
    }

    public void setToyOn(ToyState toyOn) {
        this.toyOn = toyOn;
    }

    public ToyState getToyOff() {
        return toyOff;
    }

    public void setToyOff(ToyState toyOff) {
        this.toyOff = toyOff;
    }

    public ToyState getToyCry() {
        return toyCry;
    }

    public void setToyCry(ToyCry toyCry) {
        this.toyCry = toyCry;
    }

    public ToyState getState() {
        return state;
    }

    public void setState(ToyState state) {
        this.state = state;
    }
}
