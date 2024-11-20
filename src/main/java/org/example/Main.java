package org.example;

public class Main {
    public static void main(String[] args) {
        int summe=summe(10, 10);
        System.out.println(summe);



    }
    public static int summe(int a, int b){
        return a+b;
    };

    public static boolean istGeradeZahl(int nummer){

        return nummer % 2 == 0;
    }
    public static int summeMult(int a, int b){
        return a*b;
    };
    public static String toUppercase(String s) {
        return s.toUpperCase();

    }
    public static boolean zahlIstPositv(int zahl){

       return zahl > 0;
    };

}

