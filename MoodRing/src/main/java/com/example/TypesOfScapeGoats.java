package com.example;

import java.util.Random;

public class TypesOfScapeGoats {

    public static final String[] scapegoats = {
            "Yourself? ",
            "The most dangerous foe... a housecat? ",
            "The last step up a flight of stairs? ",
            "Your evil step mother? ",
            "Your smother? ",
            "Your dad for some reason? ",
            "Bush: the both of them? ",
            "Fascists? ",
            "Climate deniers? ",
            "The patriarchy? ",
            "Whoever decided we needed to move out of caves anyway? ",
            "Pittsburgh Water Authority? ",
            "Men who drive trucks in the city? ",
            "Religious trauma? ",
            "Goats from Allegheny Goatscape? ",
            "Whoever controls the weather here? ",
            "The Pittsburgh left? ",
            "The sugar lobby? ",

    };

    public static String getRandomGoat() {
        Random random = new Random();
        int index = random.nextInt(scapegoats.length);
        return scapegoats[index];
    }
}
