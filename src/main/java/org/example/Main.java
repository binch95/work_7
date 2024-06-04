package org.example;

class Main {
    static int a = 10;

    public static int 더하기(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {

        System.out.println(a);
         int a = 20;
        System.out.println(a);

        계산기.합(20,30);
        계산기.합(20);
        System.out.println(더하기(30,20));
        exam();

    }
    public static void exam(){
        System.out.println("a : " + a);
    }
}

class 계산기 {

    static void 합(int c) {
        System.out.println("c = " + c);
    }

    static void 합(int a, int b) {
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}