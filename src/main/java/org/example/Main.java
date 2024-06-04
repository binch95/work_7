package org.example;

class Main {
    public static int 달리자(int 속도, int 속력){
        return 속도 - 속력;
    }
    public static void main(String[] args) {
        자동차 a사 = new 자동차();

        System.out.println(달리자(150,130));

    }
}

class 자동차 {

     static void 달리다(int 최고속력, int 최소속력) {

        System.out.println(" 자동차가 최고속력 " + 최고속력 + "으로 달립니다.");

    }
}