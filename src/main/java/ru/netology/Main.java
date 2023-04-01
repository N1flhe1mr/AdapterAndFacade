package ru.netology;

public class Main {
    public static void main(String[] args) {
        Ints intsCalc = new IntsCalculator();
        System.out.println(intsCalc.sum(2, 2));
        System.out.println(intsCalc.sum(10, 22));
        System.out.println(intsCalc.pow(2, 10));
        BinOps binOps = new BinOps();
        System.out.println(binOps.sum("1000","0001"));
        System.out.println(binOps.mult("1000","1001"));
    }
}
