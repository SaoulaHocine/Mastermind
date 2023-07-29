package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        String[] Latter = {"A", "B", "C", "D", "E", "F"};
        System.out.println("Hello in my small game");

        String[] Shuffled_Latter = ShuffelTheLatter(Latter);

        String[] Input_Latters;

        do {
            Input_Latters = Get_The_Input(Latter);
            GetTheHints(Input_Latters, Shuffled_Latter);
        } while (!isHeWin(Input_Latters, Shuffled_Latter));
        PrintLatters("Answer : ", Shuffled_Latter);
        System.out.println("The game is Finished ... ! ");

    }

    private static void PrintLatters(String s, String[] input_latters) {
        System.out.println(s + " : " + Arrays.asList(input_latters));
    }

    private static void GetTheHints(String[] input_latters, String[] shuffled_latter) {
        int BlackHint = 0, WhiteHint = 0;
        for (int i = 0; i < input_latters.length; i++) {
            for (int j = 0; j < input_latters.length; j++) {
                if (input_latters[i].equalsIgnoreCase(shuffled_latter[j])) {
                    if (i == j) {
                        BlackHint++;
                    } else {
                        WhiteHint++;
                    }

                }
            }
        }
        System.out.println("You have " + BlackHint + " Correct latters in the Correct Place \n" +
                "You have " + WhiteHint + " Correct latter in the wrong Place .");

    }

    private static boolean isHeWin(String[] input_latters, String[] shuffled_latter) {
        return Arrays.asList(input_latters).equals(Arrays.asList(shuffled_latter));
    }

    private static String[] Get_The_Input(String[] lat) {
        Scanner s = new Scanner(System.in);
        String[] inputs = new String[4];
        String tmp = "";
        for (int i = 0; i < 4; i++) {
            System.out.print("Latter " + (i + 1) + " : ");
            do {
                tmp = s.next();
            } while (!OnIt(tmp, lat, inputs));
            inputs[i] = tmp;
        }
        PrintLatters("Input : ", inputs);
        return inputs;
    }

    private static boolean OnIt(String s, String[] lat, String[] inputs) {
        return Arrays.asList(lat).contains(s) && !Arrays.asList(inputs).contains(s);
    }

    private static String[] ShuffelTheLatter(String[] Latter) {
        Collections.shuffle(Arrays.asList(Latter));
        return Arrays.copyOfRange(Latter, 0, 4);
    }
}
