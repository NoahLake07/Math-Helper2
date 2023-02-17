package com.mathhelper.data;

public class Radical {

    private int insideValue;
    private int quantity = 1;

    public double value;

    public Radical(int insideValue){
        this.insideValue = insideValue;
        updateValue();
    }

    public Radical(int quantity, int insideValue){
        this.quantity = quantity;
        this.insideValue = insideValue;
        updateValue();
    }

    public String toString(){
        if(quantity == 1){
            return "√" + insideValue;
        } else {
            return quantity + "√" + insideValue;
        }
    }

    private void updateValue(){
        value = quantity * Math.sqrt(insideValue);
    }

}
