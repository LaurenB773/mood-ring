package com.example;

public class MoodRing {

    public static void main(String[] args) {
        MoodRing moodRing = new MoodRing();
        moodRing.run();
    }

    public void run() {
        UserInterface userInterface = new UserInterface();

        //welcome screen
        userInterface.welcome();

        //ask for file path
        userInterface.setLogPath();

        //open ended questions
        //how are you feeling?
        userInterface.todaysFeelings();
        //who is to blame?
        userInterface.blameSomeone();
        //what did you learn today?
        userInterface.lessonsLearned();

        //get a color
        userInterface.assignAColor();

        //log responses and color
        userInterface.writeItDown();

        //exit screen
        userInterface.goodbye();
    }

}