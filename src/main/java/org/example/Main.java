package org.example;

import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        boolean rs1 = 계산기.is_a_bigger_than_b(10, 20);
        System.out.println(rs1);
        rs1 = 계산기.is_a_bigger_than_b(240, 20);
        System.out.println(rs1);
        rs1 = 계산기.is_a_bigger_than_b(20, 20);
        System.out.println(rs1);

    }
}

class 계산기 {

    static boolean is_a_bigger_than_b(int a, int b) {
        if (a > b) {
            return true;
        }
        if (a < b) {
            return false;
        }
        return false;
    }
}