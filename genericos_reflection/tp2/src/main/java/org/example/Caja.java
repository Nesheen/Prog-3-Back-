package org.example;

public class Caja <T>{
    T printear;
    public Caja(){
        this.printear=printear;
    }

    public Caja(T printear) {
        this.printear = printear;
    }

    public void print(){
        System.out.println(printear);
    }
}
