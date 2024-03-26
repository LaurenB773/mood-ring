package com.example;

import java.util.Random;

public class MoodRingColors {

    public static final String[] colors = {

            "Cyan: Freshness, cleanliness, modernity, innovation, calmness.",
            "Lavender: Romance, femininity, grace, elegance, refinement, tranquility.",
            "Robin's Egg Blue: Serenity, nostalgia, delicacy, innocence, freshness.",
            "Magenta: Passion, vibrancy, creativity, excitement, intensity.",
            "Teal: Sophistication, depth, uniqueness, creativity, stability.",
            "Marigold: Vibrancy, energy, warmth, happiness, positivity.",
            "Sapphire: Wisdom, truth, royalty, power, strength, protection.",
            "Mauve: Creativity, imagination, subtlety, grace, calmness.",
            "Crimson: Passion, courage, energy, strength, determination.",
            "Turquoise: Healing, protection, communication, clarity, balance.",
            "Periwinkle: Tranquility, relaxation, harmony, spirituality, intuition.",
            "Peach: Warmth, sincerity, innocence, youthfulness, gentleness.",
            "Olive: Peace, harmony, wisdom, endurance, stability.",
            "Tangerine: Vitality, enthusiasm, spontaneity, energy, warmth.",
            "Amethyst: Spirituality, intuition, inner peace, healing, wisdom.",
            "Chartreuse: Eccentricity, vitality, eccentricity, creativity, quirkiness.",
            "Fuchsia: Playfulness, exuberance, spontaneity, boldness, individuality.",
            "Lime: Zest, freshness, liveliness, unconventional thinking, optimism.",
            "Coral: Adventure, enthusiasm, socializing, spontaneity, vibrancy.",
            "Aqua: Fluidity, adaptability, openness, intuition, unconventional wisdom.",
            "Plum: Mystery, allure, indulgence, sophistication, eccentricity.",
            "Mint: Whimsy, youthfulness, freshness, innocence, clarity.",
            "Carnation: Sentimentality, nostalgia, sweetness, affection, charm.",
            "Champagne: Celebration, elegance, luxury, refinement, indulgence.",
            "Pistachio: Unconventionality, uniqueness, quirkiness, creativity, innovation.",
            "Cobalt: Boldness, strength, independence, eccentricity, uniqueness.",
            "Saffron: Spice, zest for life, boldness, creativity, adventure.",
            "Taffy Pink: Sweetness, nostalgia, indulgence, playfulness, comfort.",
            "Butterscotch: Warmth, sweetness, nostalgia, indulgence, comfort.",
            "Denim: Casualness, versatility, authenticity, comfort, independence. ",

    };

    public static String getRandomColor() {
        Random random = new Random();
        int index = random.nextInt(colors.length);
        return colors[index];
    }
}
