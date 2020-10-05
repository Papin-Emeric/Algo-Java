package com.company;

public class Main {
    static void Table(){
        int[] scores = new int[7];
        for (int i = 0; i < scores.length; i++) {
            int s = scores[i];
            System.out.println("The Scores!!! =" + s);
        }
    }

    public static void main(String[] args) {
        int[] scores = new int[7];
        scores[0] = 80;
        scores[1] = 81;
        scores[2] = 82;
        scores[3] = 83;
        scores[4] = 84;
        scores[5] = 85;
        scores[6] = 86;
        System.out.println(Table());

        float moyenne = 0f;
        for (int i = 0; i < scores.length; i++) {
            moyenne= moyenne + scores[i];
        }
        moyenne = moyenne/ scores.length;
        System.out.println(" ");
        System.out.println("The Moyenne is: " + moyenne);
    }
}