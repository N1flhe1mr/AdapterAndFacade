package ru.netology;

public class BinOps {
    public String sum(String a, String b) {
        var sum = Integer.parseInt(a, 2) + Integer.parseInt(b, 2);
        return Integer.toBinaryString(sum);
    }

    public String mult(String a, String b) {
        var milt = Integer.parseInt(a, 2) * Integer.parseInt(b, 2);
        return Integer.toBinaryString(milt);
    }
}
