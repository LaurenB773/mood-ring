package com.example;

import java.util.Random;

public class TypesOfFeelings {

    public static final String[] feelings = {
            "Optimistic? ",
            "Anxious? ",
            "Hangry? ",
            "Irritated? ",
            "Sleepy? ",
            "Manic? ",
            "Dead inside? ",
            "Mourning the planet? ",
            "Invincible? ",
            "Pretty but kind of mean? ",
            "Petty? ",
            "Like everyone is hanging out without you? ",
            "Je suis malade? ",
            "Appropriately medicated? ",
            "Like dancing? ",
            "Impoverished and willing to steal a loaf of bread? ",
    };

    public static String getRandomFeeling() {
        Random random = new Random();
        int index = random.nextInt(feelings.length);
        return feelings[index];
    }

}
