package com.example;

import java.util.Scanner;

public class UserInterface {

    Scanner userInput = new Scanner(System.in);
    Logger moodLogger = new Logger();
    StringBuilder userMoodData = new StringBuilder();
    TypesOfFeelings feelingsUgh = new TypesOfFeelings();
    TypesOfScapeGoats scapeGoats = new TypesOfScapeGoats();
    MoodRingColors ringColor = new MoodRingColors();

    //Welcome screen
    public void welcome() {
        System.out.println("Welcome to MoodRing (｡♥‿♥｡)");
        System.out.println("It sucks to have feelings. Record them and then pretend they don't exist.");
        System.out.println();
    }

    //get file to log
    public void setLogPath() {
        String filePath;

        do {
            System.out.println("Where's your diary? ");
            filePath = userInput.nextLine();
            if (filePath.isEmpty()) {
                System.out.println("There's nothing there, silly goose. ");
            }
            moodLogger.setMoodLog(filePath);
        }while (filePath.isEmpty());

    }

    //asking user questions
    public void todaysFeelings() {
        System.out.print("How we feeling today? ");
        System.out.println(feelingsUgh.getRandomFeeling());

        String input;

        //loop while input is empty - must have something to log
        do {
            input = userInput.nextLine().trim();
            if (input.isEmpty()) {
                System.out.println("You need to have a feeling. Dig deep. ");
            }
        } while (input.isEmpty());

        //append to string builder with pipe deliminating
        userMoodData.append(input).append("|");
    }

    public void blameSomeone() {
        System.out.print("Who is to blame for your troubles? ");
        System.out.println(scapeGoats.getRandomGoat());

        String input;

        do {
            input = userInput.nextLine().trim();

            if (input.isEmpty()) {
                System.out.println("Really? No one? Just point the finger at random. ");
            }
        } while (input.isEmpty());

        userMoodData.append(input).append("|");
    }

    public void lessonsLearned() {
        System.out.println("What's a lesson you learned today that will help you defeat your enemies? ");
        String input;

        do {
            input = userInput.nextLine().trim();

            if (input.isEmpty()) {
                System.out.println("Head empty? That's how your enemies win. ");
            }
        } while (input.isEmpty());

        userMoodData.append(input).append("|");
    }

    //Assign a color
    public void assignAColor() {
        System.out.println("You recorded in Mood Ring you get a color... ");

        //store random color in a string variable
        String todaysColor = ringColor.getRandomColor();

        //print today's color for user
        System.out.println(todaysColor);

        //parse color into an array
        String[] todayColorArray = todaysColor.split(":");

        //record just the color
        userMoodData.append(todayColorArray[0]);
    }

    //feed string to logger
    public void writeItDown() {
        moodLogger.logger(userMoodData.toString());
    }

    //exit
    public void goodbye() {
        System.out.println("Bye bestie!");
        System.exit(0);
    }

}
